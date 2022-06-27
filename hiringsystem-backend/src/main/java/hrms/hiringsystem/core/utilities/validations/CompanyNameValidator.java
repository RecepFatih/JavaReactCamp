package hrms.hiringsystem.core.utilities.validations;

import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;

public class CompanyNameValidator {
	public static Result valid(String companyName) {
		if(companyName == "") {
			return new ErrorResult("Company name cannot be empty");
		}else {
			return new SuccessResult();
		}
	}
}
