package hrms.hiringsystem.business.abstracts;

import java.util.List;

import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.JobAnnouncement;
import hrms.hiringsystem.entities.dtos.JobAnnouncementDto;

public interface JobAnnouncementService {
	Result add(JobAnnouncement jobAnnouncement);
	DataResult<List<JobAnnouncementDto>> getDetailsByStatus(boolean isActive);
	DataResult<List<JobAnnouncementDto>> getActiveDetailByDate();
	DataResult<List<JobAnnouncementDto>> getActiveDetailByEmployerUser(int employerUserId);
	Result updateStatus(int jobAnnouncementId);
}
