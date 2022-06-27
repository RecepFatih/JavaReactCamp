package hrms.hiringsystem.core.utilities.validations;

import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;

public class PasswordValidator {
	public static Result valid(String password1, String password2) {
		
		if(password1 == "") {
			return new ErrorResult("Password cannot be empty");
		}
		
		if(password2 == "") {
			return new ErrorResult("Password repeat cannot be empty");
		}
		
		if(!password1.equals(password2)) {
			return new ErrorResult("Passwords are not the same");
		}
		
		return new SuccessResult();
		
	}
}
