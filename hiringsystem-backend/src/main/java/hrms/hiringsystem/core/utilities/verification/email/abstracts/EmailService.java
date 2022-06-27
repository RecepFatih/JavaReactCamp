package hrms.hiringsystem.core.utilities.verification.email.abstracts;

import org.springframework.web.bind.annotation.RequestParam;

import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.User;

public interface EmailService {
	Result verify(String email);
}
