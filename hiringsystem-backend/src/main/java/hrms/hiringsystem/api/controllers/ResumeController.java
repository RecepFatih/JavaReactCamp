package hrms.hiringsystem.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hiringsystem.business.abstracts.ResumeService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.Resume;
import hrms.hiringsystem.entities.dtos.ResumeWithAllRelatedEntitiesDto;

@RestController
@RequestMapping("/api/resume/")
public class ResumeController {
	
	private ResumeService resumeService;

	@Autowired
	public ResumeController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Resume resume) {
		return this.resumeService.add(resume);
	}
	
	@DeleteMapping("delete")
	public Result delete(@RequestParam int resumeId) {
		return this.resumeService.delete(resumeId);
	}
	
	@PutMapping("update")
	public Result update(@RequestBody Resume resume) {
		return this.update(resume);
	}
	
	@GetMapping("getById")
	public DataResult<Resume> getById(@RequestParam int resumeId) {
		return this.resumeService.getById(resumeId);
	}
	
	@GetMapping("getResumeDetailsByCandidateId")
	public DataResult<ResumeWithAllRelatedEntitiesDto> getResumeDetailsByCandidateId(int candidateId){
		return this.resumeService.getResumeDetailsByCandidateId(candidateId);
	}
	

}
