package hrms.hiringsystem.core.utilities.verification.email.concretes;


import org.springframework.stereotype.Service;

import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.core.utilities.verification.email.abstracts.EmailService;


@Service
public class EmailManager implements EmailService{

	@Override
	public Result verify(String email) {
		
		return new SuccessResult();
	}

	

}
