package Kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlamaio.Hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{
	JobSeeker findByNationalIdentityOrEmail(String nationalIdentity,String email);
}
