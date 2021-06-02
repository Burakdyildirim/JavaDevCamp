package Kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.Hrms.business.abstracts.JobSeekerService;
import Kodlamaio.Hrms.core.utilities.results.Result;
import Kodlamaio.Hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobSeeker")
public class JobSeekerController {
	
	private JobSeekerService jobSeekerService;
	
	@Autowired
	public JobSeekerController (JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@GetMapping("/getall")
	public List<JobSeeker> getAll(){
		return this.jobSeekerService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.add(jobSeeker);
	}
	@PostMapping("/update")
	public Result update(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.update(jobSeeker);
	}
	@PostMapping("/delete")
	public Result delete(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.delete(jobSeeker);
	}
}
