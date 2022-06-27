package hrms.hiringsystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hiringsystem.business.abstracts.CandidateUserService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.CandidateUser;
import hrms.hiringsystem.entities.concretes.EmployerUser;


@RestController
@RequestMapping("/api/candidateuser")
public class CandidateUserController {

	private CandidateUserService candidateUserService;

	@Autowired
	public CandidateUserController(CandidateUserService candidateUserService) {
		super();
		this.candidateUserService = candidateUserService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidateUser candidateUser, @RequestParam String passwordAgain) throws Exception {
		return this.candidateUserService.add(candidateUser,passwordAgain);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CandidateUser>> getAll(){
		return this.candidateUserService.getAll();
	}
	
}
