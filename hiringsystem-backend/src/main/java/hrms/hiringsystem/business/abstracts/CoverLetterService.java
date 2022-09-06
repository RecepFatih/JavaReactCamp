package hrms.hiringsystem.business.abstracts;

import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.CoverLetter;

public interface CoverLetterService {
	
	DataResult<CoverLetter> getById(int coverLetterId);
	DataResult<CoverLetter> getByResume_CandidateUser(int candidateUserId);
	Result add(CoverLetter coverLetter);
	Result delete(int coverLetterId);
	Result update(CoverLetter coverLetter);

}
