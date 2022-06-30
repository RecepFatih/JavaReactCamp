package hrms.hiringsystem.business.abstracts;

import java.util.List;

import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.City;

public interface CityService {
	Result add(City city);
	DataResult<List<City>> getAll();
}
