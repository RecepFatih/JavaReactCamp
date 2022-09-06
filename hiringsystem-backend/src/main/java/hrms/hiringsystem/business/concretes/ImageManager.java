package hrms.hiringsystem.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hiringsystem.business.abstracts.ImageService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessDataResult;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.dataAccess.abstracts.ImageDao;
import hrms.hiringsystem.entities.concretes.Image;

@Service
public class ImageManager implements ImageService{
	
	private ImageDao imageDao;

	@Autowired
	public ImageManager(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}

	@Override
	public DataResult<Image> getById(int imageId) {
		
		return new SuccessDataResult<Image>
		(this.imageDao.getById(imageId), "Data listed.");
	}

	@Override
	public DataResult<Image> getByResume_CandidateUser(int candidateUserId) {
		return new SuccessDataResult<Image>
		(this.imageDao.getByResume_CandidateUser_Id(candidateUserId), "Data listed.");
	}

	@Override
	public Result add(Image image) {
		this.imageDao.save(image);
		return new SuccessResult("Registration completed successfully.");
	}

	@Override
	public Result delete(int imageId) {
		this.imageDao.deleteById(imageId);
		return new SuccessResult("The image has been deleted.");
	}

	@Override
	public Result update(Image image) {
		this.imageDao.save(image);
		return new SuccessResult("Updating completed successfully.");
	}

}
