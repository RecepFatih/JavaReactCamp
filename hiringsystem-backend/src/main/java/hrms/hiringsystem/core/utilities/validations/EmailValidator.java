package hrms.hiringsystem.core.utilities.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;

public class EmailValidator {
	public static Result valid(String email) {
		if(email == "") {
			return new ErrorResult("Email cannot be empty");
		}
		
		Pattern validEmailAdressRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE);

		Matcher matcher = validEmailAdressRegex.matcher(email);

		boolean result = matcher.find();
		if (!result) {
			return new ErrorResult("Email invalid format!");
		}
		
		return new SuccessResult();
	}
	
	
}
