package hrms.hiringsystem.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hiringsystem.entities.concretes.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer> {
 
	JobExperience getById(int imageId);
	List<JobExperience> getByResume_CandidateUser_Id(int candidateUserId);
	List<JobExperience> getByResume_CandidateUser_Id(int candidateUserId, Sort sort);
}
