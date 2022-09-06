package hrms.hiringsystem.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hrms.hiringsystem.entities.concretes.JobAnnouncement;
import hrms.hiringsystem.entities.dtos.JobAnnouncementDto;

public interface JobAnnouncementDao extends JpaRepository<JobAnnouncement, Integer>{
	
	@Query("Select new hrms.hiringsystem.entities.dtos.JobAnnouncementDto"
			+ "(e.companyName, jp.name, ja.openPositions, ja.postingDate, ja.aplicationDeadline)"
			+ " From JobAnnouncement ja Inner Join ja.employerUser e Inner Join ja.jobPosition jp "
			+ "where ja.isActive =:isActive")
	//"From Category c Inner Join c.products p"
	List<JobAnnouncementDto> getDetailsByStatus(boolean isActive);
	
	@Query("Select new hrms.hiringsystem.entities.dtos.JobAnnouncementDto"
			+ "(e.companyName, jp.name, ja.openPositions, ja.postingDate, ja.aplicationDeadline)"
			+ " From JobAnnouncement ja Inner Join ja.employerUser e Inner Join ja.jobPosition jp "
			+ "where ja.isActive = true")
	List<JobAnnouncementDto> getActiveDetailByDate(Sort sort);
	
	@Query("Select new hrms.hiringsystem.entities.dtos.JobAnnouncementDto"
			+ "(e.companyName, jp.name, ja.openPositions, ja.postingDate, ja.aplicationDeadline)"
			+ " From JobAnnouncement ja Inner Join ja.employerUser e Inner Join ja.jobPosition jp "
			+ "where ja.isActive = true and ja.employerUser.id =:employerUserId")
	List<JobAnnouncementDto> getActiveDetailByEmployerUser(int employerUserId);

	JobAnnouncement getById(int jobAnnouncementId);
}
