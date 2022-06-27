package hrms.hiringsystem.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hiringsystem.entities.concretes.CandidateUser;

public interface CandidateUserDao extends JpaRepository<CandidateUser, Integer>{
	CandidateUser getByNationalIdentity(String nationalIdentity);
}
