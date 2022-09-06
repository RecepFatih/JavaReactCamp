package hrms.hiringsystem.business.concretes;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hiringsystem.business.abstracts.ResumeService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessDataResult;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.dataAccess.abstracts.ResumeDao;
import hrms.hiringsystem.entities.concretes.Resume;
import hrms.hiringsystem.entities.dtos.ResumeWithAllRelatedEntitiesDto;

@Service
public class ResumeManager implements ResumeService{
	
	private ResumeDao resumeDao;
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao = resumeDao;
	}

	@Override
	public Result add(Resume resume) {
		
		this.resumeDao.save(resume);
		return new SuccessResult("Registration completed successfully.");
	}

	@Override
	public Result delete(int resumeId) {
		
		this.resumeDao.deleteById(resumeId);
		return new SuccessResult("The resume has been deleted.");
	}

	@Override
	public Result update(Resume resume) {
		
		this.resumeDao.save(resume);
		return new SuccessResult("Updating completed successfully.");
	}

	@Override
	public DataResult<Resume> getById(int resumeId) {
		
		return new SuccessDataResult<Resume>
		(this.resumeDao.getById(resumeId),"Data listed.");
		
	}

	@Override
	public DataResult<ResumeWithAllRelatedEntitiesDto> getResumeDetailsByCandidateId(int candidateId) {
		
		Resume resume = resumeDao.getByCandidateUser_Id(candidateId);
		ResumeWithAllRelatedEntitiesDto resumeWithAllRelatedEntitiesDto = new ResumeWithAllRelatedEntitiesDto(
				resume.getCandidateUser(),
				resume.getCoverLetter(),
				resume.getImage(),
				resume.getJobExperiences(),
				resume.getLanguages(),
				resume.getLink(),
				resume.getSchools(),
				resume.getSkills(),resume.getPostingDate());
		
		
		return new SuccessDataResult<ResumeWithAllRelatedEntitiesDto>
		(resumeWithAllRelatedEntitiesDto,"Data Listed.");
	}

	
	
}
