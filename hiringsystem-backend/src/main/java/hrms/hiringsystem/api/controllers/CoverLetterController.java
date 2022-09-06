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

import hrms.hiringsystem.business.abstracts.CoverLetterService;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.CoverLetter;

@RestController
@RequestMapping("/api/coverLetter/")
public class CoverLetterController {
	
	private CoverLetterService coverLetterService;

	@Autowired
	public CoverLetterController(CoverLetterService coverLetterService) {
		super();
		this.coverLetterService = coverLetterService;
	}
	
	@GetMapping("getByResume_CandidateUser")
	public Result getByResume_CandidateUser(@RequestParam int candidateUserId) {
		return this.coverLetterService.getByResume_CandidateUser(candidateUserId);
	}
	
	@GetMapping("getById")
	public Result getById(@RequestParam int coverLetterId) {
		return this.coverLetterService.getById(coverLetterId);
	}
	
	@PostMapping("add")
	public Result add(@RequestBody CoverLetter coverLetter) {
		return this.coverLetterService.add(coverLetter);
	}
	
	@DeleteMapping("delete")
	public Result delete(@RequestParam int coverLetterId) {
		return this.coverLetterService.delete(coverLetterId);
	}
	
	@PutMapping("update")
	public Result update(@RequestBody CoverLetter coverLetter) {
		return this.coverLetterService.update(coverLetter);
	}

}
