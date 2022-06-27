package hrms.hiringsystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hiringsystem.business.abstracts.EmployerUserService;
import hrms.hiringsystem.business.abstracts.UserService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessDataResult;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.core.utilities.validations.CompanyNameValidator;
import hrms.hiringsystem.core.utilities.validations.EmailIsWebsiteDomainValidator;
import hrms.hiringsystem.core.utilities.validations.EmailValidator;
import hrms.hiringsystem.core.utilities.validations.PasswordValidator;
import hrms.hiringsystem.core.utilities.validations.PhoneNumberValidator;
import hrms.hiringsystem.core.utilities.validations.WebsiteValidator;
import hrms.hiringsystem.core.utilities.verification.email.abstracts.EmailService;
import hrms.hiringsystem.core.utilities.verification.systemManager.abstracts.SystemManagerVerificationService;
import hrms.hiringsystem.dataAccess.abstracts.EmployerUserDao;
import hrms.hiringsystem.entities.concretes.EmployerUser;

@Service
public class EmployerUserManager implements EmployerUserService{

	private EmployerUserDao employerUserDao;
	private UserService userService;
	private EmailService emailService;
	private SystemManagerVerificationService managerVerificationService;
	
	@Autowired
	public EmployerUserManager(EmployerUserDao employerUserDao, UserService userService, 
			EmailService emailService,SystemManagerVerificationService managerVerificationService) {
		super();
		this.employerUserDao = employerUserDao;
		this.userService = userService;
		this.emailService = emailService;
		this.managerVerificationService = managerVerificationService;
	}

	@Override
	public Result add(EmployerUser employerUser, String passwordAgain) {
		
		Result companyName = CompanyNameValidator.valid(employerUser.getCompanyName());
		Result website = WebsiteValidator.valid(employerUser.getWebAddress());
		Result phoneNumber = PhoneNumberValidator.valid(employerUser.getPhoneNumber());
		Result email = EmailValidator.valid(employerUser.getEmail());
		Result password = PasswordValidator.valid(employerUser.getPassword(), passwordAgain);
		Result sameDomainEmail = EmailIsWebsiteDomainValidator.valid(employerUser.getEmail(),employerUser.getWebAddress());
		boolean emailCheck = userService.checkIfEmailAlreadyExists(employerUser.getEmail());
		Result systemManagerVerification = managerVerificationService.verify(employerUser.getEmail());
		Result emailVerification = emailService.verify(employerUser.getEmail());
		
		if(!companyName.isSuccess()) return new ErrorResult(companyName.getMessage());
		if(!website.isSuccess()) return new ErrorResult(website.getMessage());
		if(!phoneNumber.isSuccess()) return new ErrorResult(phoneNumber.getMessage());
		if(!email.isSuccess()) return new ErrorResult(email.getMessage());
		if(!password.isSuccess()) return new ErrorResult(password.getMessage());
		if(!sameDomainEmail.isSuccess()) return new ErrorResult(sameDomainEmail.getMessage());
		if(!emailCheck == false) return new ErrorResult("Email ALREADY EXIST");
		if(!emailVerification.isSuccess() || !systemManagerVerification.isSuccess()) return new ErrorResult("User could not be verified");
		
		this.employerUserDao.save(employerUser);
		return new SuccessResult("Registration completed successfully.");
	}

	@Override
	public DataResult<List<EmployerUser>> getAll() {
		return new SuccessDataResult<List<EmployerUser>>(this.employerUserDao.findAll(),"Data Listed");
	}

}
