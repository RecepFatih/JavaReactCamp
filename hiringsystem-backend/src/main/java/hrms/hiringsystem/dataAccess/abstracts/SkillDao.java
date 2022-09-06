package hrms.hiringsystem.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hiringsystem.entities.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer>{
	
	Skill getById(int skillId);
	List<Skill> getByResume_CandidateUser_Id(int candidateUserId);

}
