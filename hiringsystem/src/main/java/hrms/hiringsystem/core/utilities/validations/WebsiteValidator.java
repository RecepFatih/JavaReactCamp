package hrms.hiringsystem.core.utilities.validations;

import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;

public class WebsiteValidator {
	public static Result valid(String website) {
		if(website == "") {
			return new ErrorResult("Website name cannot be empty");
		}else {
			return new SuccessResult();
		}
	}
}
