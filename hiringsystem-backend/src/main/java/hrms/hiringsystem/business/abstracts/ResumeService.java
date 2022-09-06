package hrms.hiringsystem.business.abstracts;



import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.Resume;
import hrms.hiringsystem.entities.dtos.ResumeWithAllRelatedEntitiesDto;

public interface ResumeService {
	
	Result add(Resume resume);
	Result delete(int resumeId);
	Result update(Resume resume);
	DataResult<Resume> getById(int resumeId);
	DataResult<ResumeWithAllRelatedEntitiesDto> getResumeDetailsByCandidateId(int candidateId);

}
