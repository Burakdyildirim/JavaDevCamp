package Kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.Hrms.business.abstracts.JobTitleService;
import Kodlamaio.Hrms.core.utilities.results.DataResult;
import Kodlamaio.Hrms.core.utilities.results.ErrorResult;
import Kodlamaio.Hrms.core.utilities.results.Result;
import Kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import Kodlamaio.Hrms.core.utilities.results.SuccessResult;
import Kodlamaio.Hrms.dataAccess.abstracts.JobTitleDao;
import Kodlamaio.Hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{

    private JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        super();
        this.jobTitleDao = jobTitleDao;
    }
    
    @Override
    public DataResult<List<JobTitle>> getAll() {
        return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(),"Data listelendi");
    }
    
	@Override
	public Result add(JobTitle jobTitle) {
		String titleName = jobTitle.getTitleName();
		var result = this.jobTitleDao.findByTitleName(titleName);
		if (result == null) {
			jobTitleDao.save(jobTitle);
			return new SuccessResult("İş pozisyonu eklendi.");
		}
		else
			return new ErrorResult("iş Pozisyonu Mevcut");
	}
	
	@Override
	public Result update(JobTitle jobTitle) {
		jobTitleDao.save(jobTitle);
		return new SuccessResult("İş pozisyonu güncellendi.");
	}
	@Override
	public Result delete(JobTitle jobTitle) {
		jobTitleDao.delete(jobTitle);
		return new SuccessResult("İş pozisyonu silindi.");
	}

	@Override
	public DataResult<JobTitle> findByTitleName(String titleName) {
		return new SuccessDataResult<JobTitle>(this.jobTitleDao.findByTitleName(titleName),"Listelendi");
	}
	


}