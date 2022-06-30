package hrms.hiringsystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hiringsystem.business.abstracts.JobAnnouncementService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.JobAnnouncement;
import hrms.hiringsystem.entities.dtos.JobAnnouncementDto;

@RestController
@RequestMapping("/api/jobAnnouncement/")
public class JobAnnouncementController {

	private JobAnnouncementService jobAnnouncementService;

	@Autowired
	public JobAnnouncementController(JobAnnouncementService jobAnnouncementService) {
		super();
		this.jobAnnouncementService = jobAnnouncementService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAnnouncement jobAnnouncement) {
		return this.jobAnnouncementService.add(jobAnnouncement);
	}
	
	@GetMapping("/getAllIsActive")
	public DataResult<List<JobAnnouncementDto>> getAllIsActive(@RequestParam boolean isActive){
		return this.jobAnnouncementService.getDetailsByStatus(isActive);
	}
	
	@GetMapping("/getActiveDetailByDate")
	public DataResult<List<JobAnnouncementDto>> getActiveDetailByDate(){
		return this.jobAnnouncementService.getActiveDetailByDate();
	}
	
	@GetMapping("/getActiveDetailByEmployerUser")
	public DataResult<List<JobAnnouncementDto>> getActiveDetailByEmployerUser(@RequestParam int employerUserId){
		return this.jobAnnouncementService.getActiveDetailByEmployerUser(employerUserId);
	}
	
	@PostMapping("/updateStatus")
	public Result updateStatus(int jobAnnouncementId) {
		return this.jobAnnouncementService.updateStatus(jobAnnouncementId);
	}
}
