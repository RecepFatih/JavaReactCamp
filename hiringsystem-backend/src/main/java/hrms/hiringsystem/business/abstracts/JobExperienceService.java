package hrms.hiringsystem.business.abstracts;


import java.util.List;

import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.JobExperience;

public interface JobExperienceService {
	
	DataResult<JobExperience> getById(int jobExperienceId);
	DataResult<List<JobExperience>> getByResume_CandidateUser(int candidateUserId);
	Result add(JobExperience jobExperience);
	Result delete(int jobExperienceId);
	Result update(JobExperience jobExperience);
	DataResult<List<JobExperience>> getByResume_CandidateUser_IdAndEndYearDesc(int candidateUserId);
}
