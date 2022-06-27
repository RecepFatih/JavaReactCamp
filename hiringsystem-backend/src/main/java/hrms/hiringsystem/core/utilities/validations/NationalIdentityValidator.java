package hrms.hiringsystem.core.utilities.validations;

import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;

public class NationalIdentityValidator {
	public static Result valid(String nationalIdentity) {
		if(nationalIdentity == "") {
			return new ErrorResult("National Identity cannot be empty");
		}
		return new SuccessResult();
	}
}
