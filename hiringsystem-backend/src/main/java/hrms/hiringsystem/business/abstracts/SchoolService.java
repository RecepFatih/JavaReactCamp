package hrms.hiringsystem.business.abstracts;

import java.util.List;


import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.School;

public interface SchoolService {
	
	DataResult<School> getById(int schoolId);
	DataResult<List<School>> getByResume_CandidateUser(int candidateUserId);
	Result add(School school);
	Result delete(int schoolId);
	Result update(School school);
	DataResult<List<School>> getByResume_CandidateUser_IdAndEndYearDesc(int candidateUserId);
	

}
