package hrms.hiringsystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import hrms.hiringsystem.business.abstracts.JobExperienceService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessDataResult;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.dataAccess.abstracts.JobExperienceDao;
import hrms.hiringsystem.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService{
	
	private JobExperienceDao jobExperienceDao;

	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public DataResult<JobExperience> getById(int jobExperienceId) {
		
		return new SuccessDataResult<JobExperience>
		(this.jobExperienceDao.getById(jobExperienceId), "Data listed.");
	}

	@Override
	public DataResult<List<JobExperience>> getByResume_CandidateUser(int candidateUserId) {
		return new SuccessDataResult<List<JobExperience>>
		(this.jobExperienceDao.getByResume_CandidateUser_Id(candidateUserId), "Data listed.");
	}

	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("Registration completed successfully.");
	}

	@Override
	public Result delete(int jobExperienceId) {
		this.jobExperienceDao.deleteById(jobExperienceId);
		return new SuccessResult("The experience of job has been deleted.");
	}

	@Override
	public Result update(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("Updating completed successfully.");
	}

	@Override
	public DataResult<List<JobExperience>> getByResume_CandidateUser_IdAndEndYearDesc(int candidateUserId) {
		Sort sort = Sort.by(Sort.Direction.DESC,"endYear");
		return new SuccessDataResult<List<JobExperience>>
		(this.jobExperienceDao.getByResume_CandidateUser_Id(candidateUserId,sort), "Data listed.");
	}

}
