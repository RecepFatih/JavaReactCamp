package hrms.hiringsystem.core.utilities.verification.email.abstracts;

import hrms.hiringsystem.core.utilities.results.Result;

public interface EmailService {
	Result verify(String email);
}
