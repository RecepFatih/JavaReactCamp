package hrms.hiringsystem.business.abstracts;

import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.Link;

public interface LinkService {

	DataResult<Link> getById(int linkId);
	DataResult<Link> getByResume_CandidateUser(int candidateUserId);
	Result add(Link link);
	Result delete(int linkId);
	Result update(Link link);
}
