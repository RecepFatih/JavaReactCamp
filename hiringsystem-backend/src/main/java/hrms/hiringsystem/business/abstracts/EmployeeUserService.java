package hrms.hiringsystem.business.abstracts;



import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.EmployeeUser;

public interface EmployeeUserService {
	
	Result add(EmployeeUser employeeUser);
	Result delete(int id);
	Result update(EmployeeUser employeeUser);

}
