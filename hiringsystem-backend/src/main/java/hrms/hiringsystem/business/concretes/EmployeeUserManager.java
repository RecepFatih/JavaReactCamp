package hrms.hiringsystem.business.concretes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hiringsystem.business.abstracts.EmployeeUserService;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.dataAccess.abstracts.EmployeeUserDao;
import hrms.hiringsystem.entities.concretes.EmployeeUser;

@Service
public class EmployeeUserManager implements EmployeeUserService{
	
	private EmployeeUserDao employeeUserDao;

	@Autowired
	public EmployeeUserManager(EmployeeUserDao employeeUserDao) {
		super();
		this.employeeUserDao = employeeUserDao;
	}

	@Override
	public Result add(EmployeeUser employeeUser) {
		
		this.employeeUserDao.save(employeeUser);
		return new SuccessResult("Registration completed successfully.");
	}

	@Override
	public Result delete(int id) {
		
		this.employeeUserDao.deleteById(id);
		return new SuccessResult("The user has been deleted.");
	}

	@Override
	public Result update(EmployeeUser employeeUser) {
		
		this.employeeUserDao.save(employeeUser);
		return new SuccessResult("Updating completed successfully.");
	}

	

}
