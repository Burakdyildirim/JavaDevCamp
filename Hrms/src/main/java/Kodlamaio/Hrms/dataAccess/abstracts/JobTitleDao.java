package Kodlamaio.Hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Kodlamaio.Hrms.entities.concretes.JobTitle;

@Repository
public interface JobTitleDao extends JpaRepository<JobTitle, Integer>{
	JobTitle findByTitleName(String TitleName);
}