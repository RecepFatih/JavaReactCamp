package hrms.hiringsystem.core.utilities.validations;

import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;

public class PhoneNumberValidator {
	public static Result valid(String phoneNumber) {
		if(phoneNumber == "") {
			return new ErrorResult("Phone number  cannot be empty");
		}else {
			return new SuccessResult();
		}
	}
}
