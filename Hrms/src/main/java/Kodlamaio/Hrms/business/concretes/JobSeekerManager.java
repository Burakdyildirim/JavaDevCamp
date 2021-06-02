package Kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.Hrms.business.abstracts.JobSeekerService;
import Kodlamaio.Hrms.core.utilities.results.DataResult;
import Kodlamaio.Hrms.core.utilities.results.ErrorResult;
import Kodlamaio.Hrms.core.utilities.results.Result;
import Kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import Kodlamaio.Hrms.core.utilities.results.SuccessResult;
import Kodlamaio.Hrms.dataAccess.abstracts.JobSeekerDao;
import Kodlamaio.Hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {
	
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao=jobSeekerDao;
	}

	@Override
	public List<JobSeeker> getAll() {
		return this.jobSeekerDao.findAll();
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		String nationalIdentity = jobSeeker.getNationalIdentity();
		String email = jobSeeker.getEmail();
		var result = this.jobSeekerDao.findByNationalIdentityOrEmail(nationalIdentity, email);
		if(result == null) {
			
			jobSeekerDao.save(jobSeeker);
			return new SuccessResult("Kişi eklendi");
		}
		else
			return new ErrorResult("Kişi mevcut");
		
	}

	@Override
	public Result update(JobSeeker jobSeeker) {
		jobSeekerDao.save(jobSeeker);
		return new SuccessResult("İş Arayan Güncellendi");
	}

	@Override
	public Result delete(JobSeeker jobSeeker) {
		jobSeekerDao.delete(jobSeeker);
		return new SuccessResult("İş arayan Silindi");
	}

	@Override
	public DataResult<JobSeeker> findByNationalIdentityOrEmail(String nationalIdentity, String email) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findByNationalIdentityOrEmail(nationalIdentity,email));
	}
	


}
