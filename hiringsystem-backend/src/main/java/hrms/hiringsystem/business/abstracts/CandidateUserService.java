package hrms.hiringsystem.business.abstracts;

import java.util.List;

import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.CandidateUser;

public interface CandidateUserService {

	Result add(CandidateUser candidateUser, String passwordAgain) throws Exception;
	DataResult<List<CandidateUser>> getAll();
	
}
