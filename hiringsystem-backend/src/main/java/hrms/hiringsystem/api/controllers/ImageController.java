package hrms.hiringsystem.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hiringsystem.business.abstracts.ImageService;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.Image;

@RestController
@RequestMapping("/api/image/")
public class ImageController {
	
	private ImageService imageService;

	@Autowired
	public ImageController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	
	@GetMapping("getByResume_CandidateUser")
	public Result getByResume_CandidateUser(@RequestParam int candidateUserId) {
		return this.imageService.getByResume_CandidateUser(candidateUserId);
	}
	
	@GetMapping("getById")
	public Result getById(@RequestParam int imageId) {
		return this.imageService.getById(imageId);
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Image image) {
		return this.imageService.add(image);
	}
	
	@DeleteMapping("delete")
	public Result delete(@RequestParam int imageId) {
		return this.imageService.delete(imageId);
	}
	
	@PutMapping("update")
	public Result update(@RequestBody Image image) {
		return this.imageService.update(image);
	}

}
