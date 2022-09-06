package hrms.hiringsystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hiringsystem.business.abstracts.CandidateUserService;
import hrms.hiringsystem.business.abstracts.UserService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessDataResult;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.core.utilities.validations.BirthDateValidator;
import hrms.hiringsystem.core.utilities.validations.EmailValidator;
import hrms.hiringsystem.core.utilities.validations.FirstNameValidator;
import hrms.hiringsystem.core.utilities.validations.LastNameValidator;
import hrms.hiringsystem.core.utilities.validations.NationalIdentityValidator;
import hrms.hiringsystem.core.utilities.validations.PasswordValidator;
import hrms.hiringsystem.core.utilities.verification.email.abstracts.EmailService;
import hrms.hiringsystem.core.utilities.verification.mernis.abstracts.MernisService;
import hrms.hiringsystem.dataAccess.abstracts.CandidateUserDao;
import hrms.hiringsystem.entities.concretes.CandidateUser;
import hrms.hiringsystem.entities.concretes.User;

@Service
public class CandidateUserManager implements CandidateUserService{

	private CandidateUserDao candidateUserDao;
	private UserService userService;
	private EmailService emailService;
	private MernisService mernisService;
	
	@Autowired
	public CandidateUserManager(UserService userService, CandidateUserDao candidateUserDao,
			EmailService emailService, MernisService mernisService) {
		super();
		this.candidateUserDao = candidateUserDao;
		this.userService = userService;
		this.emailService = emailService;
		this.mernisService = mernisService;
	}

	@Override
	public Result add(CandidateUser candidateUser, String passwordAgain) throws Exception{
		
		Result firstName = FirstNameValidator.valid(candidateUser.getFirstName());
		Result lastName = LastNameValidator.valid(candidateUser.getLastName());
		Result email = EmailValidator.valid(candidateUser.getEmail());
		Result nationalIdentity = NationalIdentityValidator.valid(candidateUser.getNationalIdentity());
		Result birtday = BirthDateValidator.valid(candidateUser.getBirthDate());
		Result password = PasswordValidator.valid(candidateUser.getPassword(), passwordAgain);
		boolean emailCheck = userService.checkIfEmailAlreadyExists(candidateUser.getEmail());
		boolean nationalIdentityCheck = checkIfNationalityIdentityAlreadyExists(candidateUser.getNationalIdentity());
		Result emailVerification = emailService.verify(candidateUser.getEmail());
		Result mernisCheck = mernisService.checkIfRealPerson(candidateUser);
		
		if(!firstName.isSuccess()) return new ErrorResult(firstName.getMessage());
		if(!lastName.isSuccess()) return new ErrorResult(lastName.getMessage());
		if(!email.isSuccess()) return new ErrorResult(email.getMessage());
		if(!nationalIdentity.isSuccess()) return new ErrorResult(nationalIdentity.getMessage());
		if(!birtday.isSuccess()) return new ErrorResult(birtday.getMessage());
		if(!password.isSuccess()) return new ErrorResult(password.getMessage());
		if(!emailCheck == false) return new ErrorResult("Email ALREADY EXIST");
		if(!nationalIdentityCheck == false) return new ErrorResult("National Identity ALREADY EXIST");
		if(!emailVerification.isSuccess()) return new ErrorResult("Email could not be verified");
		if(!mernisCheck.isSuccess()) return new ErrorResult(mernisCheck.getMessage());
		
		this.candidateUserDao.save(candidateUser);
		return new SuccessResult("Registration completed successfully.");
	}
	
	@Override
	public DataResult<List<CandidateUser>> getAll() {
		return new SuccessDataResult<List<CandidateUser>>(this.candidateUserDao.findAll(),"Data Listed");
	}
	
	private boolean checkIfNationalityIdentityAlreadyExists(String nationalityIdentity) {
				 
		User user = this.candidateUserDao.getByNationalIdentity(nationalityIdentity);
		if (user != null) {

			return true;
		}else {
			return false;
		}
		
	}

}
