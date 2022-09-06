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

import hrms.hiringsystem.business.abstracts.SchoolService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.School;

@RestController
@RequestMapping("/api/school/")
public class SchoolController {
	
	private SchoolService schoolService;

	@Autowired
	public SchoolController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}
	
	@GetMapping("getByResume_CandidateUser")
	public DataResult<List<School>> getByResume_CandidateUser(@RequestParam int candidateUserId) {
		return this.schoolService.getByResume_CandidateUser(candidateUserId);
	}
	 
	@GetMapping("getById")
	public DataResult<School> getById(@RequestParam int schoolId) {
		return this.schoolService.getById(schoolId);
	}
	
	@PostMapping("add")
	public Result add(@RequestBody School school) {
		return this.schoolService.add(school);
	}
	
	@DeleteMapping("delete")
	public Result delete(@RequestParam int schoolId) {
		return this.schoolService.delete(schoolId);
	}
	
	@PutMapping("update")
	public Result update(@RequestBody School school) {
		return this.schoolService.update(school);
	}
	
	@GetMapping("getByResume_CandidateUser_IdAndEndYearDesc")
	public DataResult<List<School>> getByResume_CandidateUser_IdAndEndYearDesc(@RequestParam int candidateUserId) {
		return this.schoolService.getByResume_CandidateUser_IdAndEndYearDesc(candidateUserId);
	}
	
	
 
}
