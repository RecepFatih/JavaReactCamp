package hrms.hiringsystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import hrms.hiringsystem.entities.concretes.CoverLetter;

public interface CoverLetterDao extends JpaRepository<CoverLetter, Integer>{
	
	CoverLetter getById(int coverLetterId);
	CoverLetter getByResume_CandidateUser_Id(int candidateUserId);

}

