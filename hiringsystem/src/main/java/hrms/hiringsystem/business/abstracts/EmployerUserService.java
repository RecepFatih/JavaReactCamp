package hrms.hiringsystem.business.abstracts;

import java.util.List;

import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.EmployerUser;

public interface EmployerUserService {
	Result add(EmployerUser employerUser , String passwordAgain);
	DataResult<List<EmployerUser>> getAll();
}
