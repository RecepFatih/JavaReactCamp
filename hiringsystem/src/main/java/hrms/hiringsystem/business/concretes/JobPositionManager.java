package hrms.hiringsystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hiringsystem.business.abstracts.JobPositionService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessDataResult;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.dataAccess.abstracts.JobPositionDao;
import hrms.hiringsystem.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}


	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Data Listed");
				
	}


	@Override
	public Result add(JobPosition jobPosition) {
		
		boolean jobPositionCheck = checkJobPosition(jobPosition.getName());
		
		if(!jobPositionCheck == false) return new ErrorResult("JOB POSITION ALREADY EXIST");
		
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("Registration completed successfully.");
	}
	
	private boolean checkJobPosition(String jobPositionName) {
		JobPosition jobPosition = this.jobPositionDao.getByName(jobPositionName);
		if(jobPosition != null) {
			return true;
		}else {
			return false;
		}
	}
}
