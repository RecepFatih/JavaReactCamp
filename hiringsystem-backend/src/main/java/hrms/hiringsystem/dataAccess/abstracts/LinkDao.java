package hrms.hiringsystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hiringsystem.entities.concretes.Link;

public interface LinkDao extends JpaRepository<Link, Integer>{
	
	Link getById(int imageId);
	Link getByResume_CandidateUser_Id(int candidateUserId);

}
