package hrms.hiringsystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hiringsystem.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image, Integer>{

	Image getById(int imageId);
	Image getByResume_CandidateUser_Id(int candidateUserId);
}
