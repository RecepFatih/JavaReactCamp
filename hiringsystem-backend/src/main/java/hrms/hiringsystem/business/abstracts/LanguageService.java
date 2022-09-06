package hrms.hiringsystem.business.abstracts;

import java.util.List;

import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.Language;

public interface LanguageService {
	
	DataResult<Language> getById(int languageId);
	DataResult<List<Language>> getByResume_CandidateUser(int candidateUserId);
	Result add(Language language);
	Result delete(int languageId);
	Result update(Language language);

}
