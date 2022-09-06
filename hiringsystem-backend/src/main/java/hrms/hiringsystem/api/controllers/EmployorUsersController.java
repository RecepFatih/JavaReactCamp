package hrms.hiringsystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hiringsystem.business.abstracts.EmployerUserService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.EmployerUser;

@RestController
@RequestMapping("/api/employeruser")
public class EmployorUsersController {

	private EmployerUserService employerUserService;

	@Autowired
	public EmployorUsersController(EmployerUserService employerUserService) {
		super();
		this.employerUserService = employerUserService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody EmployerUser employerUser, @RequestParam String passwordAgain) {
		return this.employerUserService.add(employerUser, passwordAgain);
	}
	
	@GetMapping("/getall")
	public DataResult<List<EmployerUser>> getAll(){
		return this.employerUserService.getAll();
	}
	
	
}
