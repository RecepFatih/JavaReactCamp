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

import hrms.hiringsystem.business.abstracts.SkillService;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.Skill;

@RestController
@RequestMapping("/api/skill/")
public class SkillController {
	
	private SkillService skillService;

	@Autowired
	public SkillController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}
	
	
	@GetMapping("getByResume_CandidateUser")
	public Result getByResume_CandidateUser(@RequestParam int candidateUserId) {
		return this.skillService.getByResume_CandidateUser(candidateUserId);
	}
	 
	@GetMapping("getById")
	public Result getById(@RequestParam int skillId) {
		return this.skillService.getById(skillId);
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Skill skill) {
		return this.skillService.add(skill);
	}
	
	@DeleteMapping("delete")
	public Result delete(@RequestParam int skillId) {
		return this.skillService.delete(skillId);
	}
	
	@PutMapping("update")
	public Result update(@RequestBody Skill skill) {
		return this.skillService.update(skill);
	}

}
