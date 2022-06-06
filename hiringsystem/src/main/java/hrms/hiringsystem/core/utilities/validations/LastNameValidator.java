package hrms.hiringsystem.core.utilities.validations;

import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;

public class LastNameValidator {
	public static Result valid(String lastName) {
		if(lastName == "") {
			return new ErrorResult("Last name cannot be empty");
		}
		return new SuccessResult();
	}
}
