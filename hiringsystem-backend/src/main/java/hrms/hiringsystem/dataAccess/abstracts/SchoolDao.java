package hrms.hiringsystem.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.data.jpa.repository.JpaRepository;
import hrms.hiringsystem.entities.concretes.School;

public interface SchoolDao extends JpaRepository<School, Integer>{
	
	School getById(int schoolId);
	List<School> getByResume_CandidateUser_Id(int candidateUserId);
	List<School> getByResume_CandidateUser_Id(int candidateUserId, Sort sort);

}
