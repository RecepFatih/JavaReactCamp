package hrms.hiringsystem.core.utilities.validations;

import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;

public class FirstNameValidator {
	
	public static Result valid(String firstName) {
		if(firstName == "") {
			return new ErrorResult("Name cannot be empty");
		}
		return new SuccessResult();
	}
	
}
