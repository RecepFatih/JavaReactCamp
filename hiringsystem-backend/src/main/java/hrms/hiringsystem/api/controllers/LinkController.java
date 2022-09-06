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

import hrms.hiringsystem.business.abstracts.LinkService;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.Link;

@RestController
@RequestMapping("/api/link/")
public class LinkController {
	
	private LinkService linkService;

	@Autowired
	public LinkController(LinkService linkService) {
		super();
		this.linkService = linkService;
	}
	
	@GetMapping("getByResume_CandidateUser")
	public Result getByResume_CandidateUser(@RequestParam int candidateUserId) {
		return this.linkService.getByResume_CandidateUser(candidateUserId);
	}
	
	@GetMapping("getById")
	public Result getById(@RequestParam int linkId) {
		return this.linkService.getById(linkId);
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Link link) {
		return this.linkService.add(link);
	}
	
	@DeleteMapping("delete")
	public Result delete(@RequestParam int linkId) {
		return this.linkService.delete(linkId);
	}
	
	@PutMapping("update")
	public Result update(@RequestBody Link link) {
		return this.linkService.update(link);
	}

}
