package Kodlamaio.Hrms.business.abstracts;

import java.util.List;

import Kodlamaio.Hrms.core.utilities.results.DataResult;
import Kodlamaio.Hrms.core.utilities.results.Result;
import Kodlamaio.Hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	DataResult<JobTitle> findByTitleName(String titleName);
	DataResult<List<JobTitle>> getAll();
	Result add(JobTitle jobTitle);
	Result update (JobTitle jobTitle);
	Result delete (JobTitle jobTitle);
}
