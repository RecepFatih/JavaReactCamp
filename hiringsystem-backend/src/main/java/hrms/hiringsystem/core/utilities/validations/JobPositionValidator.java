package hrms.hiringsystem.core.utilities.validations;

import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.entities.concretes.JobPosition;

public class JobPositionValidator {
	public static Result valid(JobPosition jobPosition) {
		if(jobPosition.getId() < 1 | String.valueOf(jobPosition.getId()) == null) {
			return new ErrorResult("Job position cannot be empty!");
			
		}
		return new SuccessResult();
	}
}
