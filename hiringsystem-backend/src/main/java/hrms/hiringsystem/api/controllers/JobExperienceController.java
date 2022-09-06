package hrms.hiringsystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hiringsystem.business.abstracts.JobExperienceService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/jobExperience/")
public class JobExperienceController {
	
	private JobExperienceService jobExperienceService;

	@Autowired
	public JobExperienceController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}

	@GetMapping("getByResume_CandidateUser")
	public DataResult<List<JobExperience>> getByResume_CandidateUser(@RequestParam int candidateUserId) {
		return this.jobExperienceService.getByResume_CandidateUser(candidateUserId);
	}
	
	@GetMapping("getById")
	public DataResult<JobExperience> getById(@RequestParam int jobExperienceId) {
		return this.jobExperienceService.getById(jobExperienceId);
	}
	
	@PostMapping("add")
	public Result add(@RequestBody JobExperience jobExperience) {
		return this.jobExperienceService.add(jobExperience);
	}
	
	@DeleteMapping("delete")
	public Result delete(@RequestParam int jobExperienceId) {
		return this.jobExperienceService.delete(jobExperienceId);
	}
	
	@PutMapping("update")
	public Result update(@RequestBody JobExperience jobExperience) {
		return this.jobExperienceService.update(jobExperience);
	}
	
	@GetMapping("getByResume_CandidateUser_IdAndEndYearDesc")
	public DataResult<List<JobExperience>> getByResume_CandidateUser_IdAndEndYearDesc(@RequestParam int candidateUserId) {
		return this.jobExperienceService.getByResume_CandidateUser_IdAndEndYearDesc(candidateUserId);
	}
}
