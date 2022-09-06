package hrms.hiringsystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hiringsystem.business.abstracts.SkillService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessDataResult;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.dataAccess.abstracts.SkillDao;
import hrms.hiringsystem.entities.concretes.Skill;

@Service
public class SkillManager implements SkillService{
	
	private SkillDao skillDao;

	@Autowired
	public SkillManager(SkillDao skillDao) {
		super();
		this.skillDao = skillDao;
	}

	@Override
	public DataResult<Skill> getById(int skillId) {

		return new SuccessDataResult<Skill>
		(this.skillDao.getById(skillId), "Data listed.");
	}

	@Override
	public DataResult<List<Skill>> getByResume_CandidateUser(int candidateUserId) {
		return new SuccessDataResult<List<Skill>>
		(this.skillDao.getByResume_CandidateUser_Id(candidateUserId), "Data listed.");
	}

	@Override
	public Result add(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult("Registration completed successfully.");
	}

	@Override
	public Result delete(int skillId) {
		this.skillDao.deleteById(skillId);
		return new SuccessResult("The skill has been deleted.");
	}

	@Override
	public Result update(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult("Updating completed successfully.");
	}
	
	

}
