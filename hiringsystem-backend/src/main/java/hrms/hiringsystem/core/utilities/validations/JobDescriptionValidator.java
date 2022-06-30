package hrms.hiringsystem.core.utilities.validations;

import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;

public class JobDescriptionValidator {
	public static Result valid(String jobDescription) {
		if(jobDescription == "") {
			return new ErrorResult("Job's description cannot be empty!");
		}
		return new SuccessResult();
	}
}
