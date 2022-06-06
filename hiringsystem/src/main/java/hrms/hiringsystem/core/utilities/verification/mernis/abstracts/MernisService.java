package hrms.hiringsystem.core.utilities.verification.mernis.abstracts;

import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.CandidateUser;

public interface MernisService {
	public Result checkIfRealPerson(CandidateUser candidateUser) throws Exception;
}
