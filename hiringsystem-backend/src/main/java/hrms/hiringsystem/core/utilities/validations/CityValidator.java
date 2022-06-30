package hrms.hiringsystem.core.utilities.validations;

import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;
import hrms.hiringsystem.entities.concretes.City;

public class CityValidator {
	public static Result valid(City city) {
		if(city.getId() < 1) {
			return new ErrorResult("City cannot be empty!");
		}
		return new SuccessResult();
	}
}
