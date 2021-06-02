package Kodlamaio.Hrms.business.abstracts;

import java.util.List;

import Kodlamaio.Hrms.core.utilities.results.Result;
import Kodlamaio.Hrms.entities.concretes.Employer;

public interface EmployerService {
	List<Employer> getAll();
	Result add (Employer employer);
	Result update (Employer employer);
	Result delete (Employer employer);
}
