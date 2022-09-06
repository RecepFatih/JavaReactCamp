package hrms.hiringsystem.business.abstracts;

import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.Image;

public interface ImageService {
	
	DataResult<Image> getById(int imageId);
	DataResult<Image> getByResume_CandidateUser(int candidateUserId);
	Result add(Image image);
	Result delete(int imageId);
	Result update(Image image);

}
