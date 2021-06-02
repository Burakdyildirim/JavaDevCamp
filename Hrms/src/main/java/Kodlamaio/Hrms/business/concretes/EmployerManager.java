package Kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.Hrms.business.abstracts.EmployerService;
import Kodlamaio.Hrms.core.utilities.results.Result;
import Kodlamaio.Hrms.core.utilities.results.SuccessResult;
import Kodlamaio.Hrms.dataAccess.abstracts.EmployerDao;
import Kodlamaio.Hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
        super();
        this.employerDao = employerDao;
    }
	
	@Override
	public List<Employer> getAll() {
		return this.employerDao.findAll();
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("İşveren Eklendi");
	}

	@Override
	public Result update(Employer employer) {
		employerDao.save(employer);
		return new SuccessResult("İş veren eklendi");
	}

	@Override
	public Result delete(Employer employer) {
		employerDao.delete(employer);
		return new SuccessResult("İş veren Silindi");
	}

}
