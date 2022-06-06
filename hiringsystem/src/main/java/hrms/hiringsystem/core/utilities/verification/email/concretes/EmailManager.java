package hrms.hiringsystem.core.utilities.verification.email.concretes;

import java.util.Scanner;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hrms.hiringsystem.core.utilities.results.ErrorResult;
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
