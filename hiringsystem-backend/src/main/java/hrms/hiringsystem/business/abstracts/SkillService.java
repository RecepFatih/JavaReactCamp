package hrms.hiringsystem.business.abstracts;

import java.util.List;

import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.Skill;

public interface SkillService {
	
	DataResult<Skill> getById(int skillId);
	DataResult<List<Skill>> getByResume_CandidateUser(int candidateUserId);
	Result add(Skill skill);
	Result delete(int skillId);
	Result update(Skill skill);

}
