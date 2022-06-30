package hrms.hiringsystem.core.utilities.validations;

import hrms.hiringsystem.core.utilities.results.ErrorResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.core.utilities.results.SuccessResult;

public class OpenPositionsValidator {
	public static Result valid(int openPositions) {
		if(openPositions < 1) {
			return new ErrorResult("Number of open positions cannot be empty!");
		} 
		return new SuccessResult();
	}
}
