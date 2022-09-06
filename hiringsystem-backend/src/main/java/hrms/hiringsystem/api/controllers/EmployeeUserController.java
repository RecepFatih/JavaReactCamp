package hrms.hiringsystem.api.controllers;




import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hiringsystem.business.abstracts.EmployeeUserService;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.EmployeeUser;

@RestController
@RequestMapping("/api/employeeUser/")
public class EmployeeUserController {
	
	private EmployeeUserService employeeUserService;

	public EmployeeUserController(EmployeeUserService employeeUserService) {
		super();
		this.employeeUserService = employeeUserService;
	}
	
	@PostMapping(value = "add")
	public Result add(@RequestBody EmployeeUser employeeUser) {
		
		return this.employeeUserService.add(employeeUser);
	}
	
	@DeleteMapping("delete")
	public Result delete(@RequestParam int id) {
		return this.employeeUserService.delete(id);
	}
	
	@PutMapping("update")
	public Result update(@RequestBody EmployeeUser employeeUser) {
		return this.update(employeeUser);
	}
	

}
