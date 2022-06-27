package hrms.hiringsystem.business.abstracts;

import java.util.List;

import hrms.hiringsystem.core.utilities.results.DataResult;
import hrms.hiringsystem.core.utilities.results.Result;
import hrms.hiringsystem.entities.concretes.JobPosition;


public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
}
