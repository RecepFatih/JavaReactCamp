package hrms.hiringsystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import hrms.hiringsystem.business.abstracts.SchoolService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessDataResult;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.dataAccess.abstracts.SchoolDao;
import hrms.hiringsystem.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService{
	
	private SchoolDao schoolDao;

	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public DataResult<School> getById(int schoolId) {
		return new SuccessDataResult<School>
		(this.schoolDao.getById(schoolId), "Data listed.");
	}

	@Override
	public DataResult<List<School>> getByResume_CandidateUser(int candidateUserId) {
		return new SuccessDataResult<List<School>>
		(this.schoolDao.getByResume_CandidateUser_Id(candidateUserId), "Data listed.");
	}

	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("Registration completed successfully.");
	}

	@Override
	public Result delete(int schoolId) {
		this.schoolDao.deleteById(schoolId);
		return new SuccessResult("The school has been deleted.");
	}

	@Override
	public Result update(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("Updating completed successfully.");
	}

	@Override
	public DataResult<List<School>> getByResume_CandidateUser_IdAndEndYearDesc(int candidateUserId) {
		Sort sort = Sort.by(Sort.Direction.DESC,"endYear");
		return new SuccessDataResult<List<School>>
		(this.schoolDao.getByResume_CandidateUser_Id(candidateUserId,sort), "Data listed.");
	}
	
	
	

}
