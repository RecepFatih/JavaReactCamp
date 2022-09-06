package hrms.hiringsystem.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hiringsystem.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume, Integer>{
	
	Resume getById(int resumeId);
	Resume getByCandidateUser_Id(int candidateId);
}
