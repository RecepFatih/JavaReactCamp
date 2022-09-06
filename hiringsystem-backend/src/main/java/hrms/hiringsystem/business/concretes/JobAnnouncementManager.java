package hrms.hiringsystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import hrms.hiringsystem.business.abstracts.JobAnnouncementService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessDataResult;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.core.utilities.validations.CityValidator;
import hrms.hiringsystem.core.utilities.validations.JobDescriptionValidator;
import hrms.hiringsystem.core.utilities.validations.JobPositionValidator;
import hrms.hiringsystem.core.utilities.validations.OpenPositionsValidator;
import hrms.hiringsystem.dataAccess.abstracts.JobAnnouncementDao;
import hrms.hiringsystem.entities.concretes.JobAnnouncement;
import hrms.hiringsystem.entities.dtos.JobAnnouncementDto;

@Service
public class JobAnnouncementManager implements JobAnnouncementService {

	private JobAnnouncementDao jobAnnouncementDao;
	
	@Autowired
	public JobAnnouncementManager(JobAnnouncementDao jobAnnouncementDao) {
		super();
		this.jobAnnouncementDao = jobAnnouncementDao;
	}


	@Override
	public Result add(JobAnnouncement jobAnnouncement) {

		Result jobPosition = JobPositionValidator.valid(jobAnnouncement.getJobPosition());
		Result description = JobDescriptionValidator.valid(jobAnnouncement.getDescription());
		Result city = CityValidator.valid(jobAnnouncement.getCity());
		Result openPosition = OpenPositionsValidator.valid(jobAnnouncement.getOpenPositions());
		
		if(!jobPosition.isSuccess()) return new ErrorResult(jobPosition.getMessage());
		if(!description.isSuccess()) return new ErrorResult(description.getMessage());
		if(!city.isSuccess()) return new ErrorResult(city.getMessage());
		if(!openPosition.isSuccess()) return new ErrorResult(openPosition.getMessage());
		
		this.jobAnnouncementDao.save(jobAnnouncement);
		return new SuccessResult("Registration completed successfully.");
	}


	@Override
	public DataResult<List<JobAnnouncementDto>> getDetailsByStatus(boolean isActive) {
		
		return new SuccessDataResult<List<JobAnnouncementDto>>
		(this.jobAnnouncementDao.getDetailsByStatus(isActive), "The data is listed.");
				
	}

	@Override
	public DataResult<List<JobAnnouncementDto>> getActiveDetailByDate() {
		Sort sort = Sort.by(Sort.Direction.DESC,"postingDate");
		return new SuccessDataResult<List<JobAnnouncementDto>>
		(this.jobAnnouncementDao.getActiveDetailByDate(sort),"The data is listed.");
	}


	@Override
	public DataResult<List<JobAnnouncementDto>> getActiveDetailByEmployerUser(int employerUserId) {
		return new SuccessDataResult<List<JobAnnouncementDto>>
		(this.jobAnnouncementDao.getActiveDetailByEmployerUser(employerUserId),"The data is listed.");
	}


	@Override
	public Result updateStatus(int jobAnnouncementId) {
		var result = this.jobAnnouncementDao.getById(jobAnnouncementId);
		result.setActive(false);
		this.jobAnnouncementDao.save(result);
		return new SuccessResult("Job posting has been deactivated.");
	}

}
