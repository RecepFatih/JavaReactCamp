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

import hrms.hiringsystem.business.abstracts.LanguageService;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.Language;

@RestController
@RequestMapping("/api/language/")
public class LanguageController {
	
	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("getByResume_CandidateUser")
	public Result getByResume_CandidateUser(@RequestParam int candidateUserId) {
		return this.languageService.getByResume_CandidateUser(candidateUserId);
	}
	 
	@GetMapping("getById")
	public Result getById(@RequestParam int languageId) {
		return this.languageService.getById(languageId);
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Language language) {
		return this.languageService.add(language);
	}
	
	@DeleteMapping("delete")
	public Result delete(@RequestParam int languageId) {
		return this.languageService.delete(languageId);
	}
	
	@PutMapping("update")
	public Result update(@RequestBody Language language) {
		return this.languageService.update(language);
	}

}
