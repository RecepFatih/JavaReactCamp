package hrms.hiringsystem.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hiringsystem.business.abstracts.LinkService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessDataResult;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.dataAccess.abstracts.LinkDao;
import hrms.hiringsystem.entities.concretes.Link;

@Service
public class LinkManager implements LinkService{
	
	private LinkDao linkDao;

	@Autowired
	public LinkManager(LinkDao linkDao) {
		super();
		this.linkDao = linkDao;
	}

	@Override
	public DataResult<Link> getById(int linkId) {
		
		return new SuccessDataResult<Link>
		(this.linkDao.getById(linkId), "Data listed.");
	}

	@Override
	public DataResult<Link> getByResume_CandidateUser(int candidateUserId) {
		return new SuccessDataResult<Link>
		(this.linkDao.getByResume_CandidateUser_Id(candidateUserId), "Data listed.");
	}

	@Override
	public Result add(Link link) {
		this.linkDao.save(link);
		return new SuccessResult("Registration completed successfully.");
	}

	@Override
	public Result delete(int linkId) {
		this.linkDao.deleteById(linkId);
		return new SuccessResult("The link has been deleted.");
	}

	@Override
	public Result update(Link link) {
		this.linkDao.save(link);
		return new SuccessResult("Updating completed successfully.");
	}

}
