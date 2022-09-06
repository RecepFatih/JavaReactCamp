package hrms.hiringsystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hiringsystem.entities.concretes.EmployeeUser;

public interface EmployeeUserDao extends JpaRepository<EmployeeUser, Integer>{
	EmployeeUser getById(int id);
}
