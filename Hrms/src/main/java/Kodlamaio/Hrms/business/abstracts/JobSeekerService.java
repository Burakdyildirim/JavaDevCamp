package Kodlamaio.Hrms.business.abstracts;

import java.util.List;

import Kodlamaio.Hrms.core.utilities.results.DataResult;
import Kodlamaio.Hrms.core.utilities.results.Result;
import Kodlamaio.Hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	DataResult<JobSeeker> findByNationalIdentityOrEmail(String nationalIdentity,String email);
	List<JobSeeker> getAll();
	Result add(JobSeeker jobSeeker);
	Result update (JobSeeker jobSeeker);
	Result delete (JobSeeker jobSeeker);
}
