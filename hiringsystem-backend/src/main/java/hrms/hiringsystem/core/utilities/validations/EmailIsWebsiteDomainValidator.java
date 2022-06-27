package hrms.hiringsystem.core.utilities.validations;

import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;

public class EmailIsWebsiteDomainValidator {
	
	public static Result valid(String email, String website) {

		website = website + ".com";
		
		String[] splitMail = email.split("@", 2);

		if (!website.contains(splitMail[1])) {
			return new ErrorResult("The email must have the same domain as the website.");
		}
		return new SuccessResult();

	}
}
