package hrms.hiringsystem.core.utilities.validations;


import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;

public class BirthDateValidator {
	public static Result valid(int birthDate) {
		if(String.valueOf(birthDate) == "") {
			return new ErrorResult("Birth date cannot be empty");
		}
		return new SuccessResult();
	}
}
