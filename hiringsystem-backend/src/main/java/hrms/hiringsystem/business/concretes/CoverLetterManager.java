package hrms.hiringsystem.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hiringsystem.business.abstracts.CoverLetterService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessDataResult;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.dataAccess.abstracts.CoverLetterDao;
import hrms.hiringsystem.entities.concretes.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService{
	
	private CoverLetterDao coverLetterDao;

	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterDao) {
		super();
		this.coverLetterDao = coverLetterDao;
	}

	@Override
	public DataResult<CoverLetter> getByResume_CandidateUser(int candidateUserId) {
		
		return new SuccessDataResult<CoverLetter>
		(this.coverLetterDao.getByResume_CandidateUser_Id(candidateUserId), "Data listed.");
	}

	@Override
	public DataResult<CoverLetter> getById(int coverLetterId) {
		
		return new SuccessDataResult<CoverLetter>
		(this.coverLetterDao.getById(coverLetterId), "Data listed.");
	}

	@Override
	public Result add(CoverLetter coverLetter) {
		
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult("Registration completed successfully.");
	}

	@Override
	public Result delete(int coverLetterId) {
		
		this.coverLetterDao.deleteById(coverLetterId);
		return new SuccessResult("The cover letter has been deleted.");
	}

	@Override
	public Result update(CoverLetter coverLetter) {
		
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult("Updating completed successfully.");
	}


	

}
