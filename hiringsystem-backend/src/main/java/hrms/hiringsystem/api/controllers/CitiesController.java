package hrms.hiringsystem.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hiringsystem.business.abstracts.CityService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.City;

@RestController
@RequestMapping("/api/city/")
public class CitiesController {
	
	private CityService cityService;

	public CitiesController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody City city) {
		return this.cityService.add(city);
	}
	
	@GetMapping("getAll")
	public DataResult<List<City>> getAll(){
		return this.cityService.getAll();
	}

}
