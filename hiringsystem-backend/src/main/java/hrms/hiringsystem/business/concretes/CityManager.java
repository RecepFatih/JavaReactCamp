package hrms.hiringsystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hiringsystem.business.abstracts.CityService;
import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessDataResult;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.dataAccess.abstracts.CityDao;
import hrms.hiringsystem.entities.concretes.City;

@Service
public class CityManager implements CityService{

	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public Result add(City city) {
		
		this.cityDao.save(city);
		return new SuccessResult("Registration completed successfully.");
	}

	@Override
	public DataResult<List<City>> getAll() {
	
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"Data Listed");
	}

}
