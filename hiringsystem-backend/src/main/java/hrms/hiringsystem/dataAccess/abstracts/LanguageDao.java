package hrms.hiringsystem.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hiringsystem.entities.concretes.Language;


public interface LanguageDao extends JpaRepository<Language, Integer>{
	
	Language getById(int languageId);
	List<Language> getByResume_CandidateUser_Id(int candidateUserId);

}
