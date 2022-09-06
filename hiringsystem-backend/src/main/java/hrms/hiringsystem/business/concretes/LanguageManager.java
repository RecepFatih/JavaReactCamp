package hrms.hiringsystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hiringsystem.business.abstracts.LanguageService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessDataResult;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.dataAccess.abstracts.LanguageDao;
import hrms.hiringsystem.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	
	private LanguageDao languageDao;

	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
	public DataResult<Language> getById(int languageId) {
		
		return new SuccessDataResult<Language>
		(this.languageDao.getById(languageId), "Data listed.");
	}

	@Override
	public DataResult<List<Language>> getByResume_CandidateUser(int candidateUserId) {
		return new SuccessDataResult<List<Language>>
		(this.languageDao.getByResume_CandidateUser_Id(candidateUserId), "Data listed.");
	}

	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("Registration completed successfully.");
	}

	@Override
	public Result delete(int languageId) {
		this.languageDao.deleteById(languageId);
		return new SuccessResult("The language has been deleted.");
	}

	@Override
	public Result update(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("Updating completed successfully.");
	}
	
	

}
