package hrms.hiringsystem.core.utilities.verification.systemManager.concretes;

import org.springframework.stereotype.Service;

import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.core.utilities.verification.systemManager.abstracts.SystemManagerVerificationService;

@Service
public class SystemManagerVerificationManager implements SystemManagerVerificationService{

	@Override
	public Result verify(String systemManager) {
		
		return new SuccessResult();
	}

}
