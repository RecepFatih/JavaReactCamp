package hrms.hiringsystem.core.utilities.verification.mernis.concretes;

import org.springframework.stereotype.Service;

import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.core.utilities.verification.mernis.abstracts.MernisService;
import hrms.hiringsystem.entities.concretes.CandidateUser;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisManager implements MernisService{

	@Override
	public Result checkIfRealPerson(CandidateUser candidateUser) throws Exception{
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(candidateUser.getNationalIdentity()),
				candidateUser.getFirstName(), candidateUser.getLastName(), candidateUser.getBirthDate());
		
		if(!result) {
			return new ErrorResult("Failed to verify person information.");
		}
		return new SuccessResult();
	}

}
