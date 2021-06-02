package Kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.Hrms.business.abstracts.JobTitleService;
import Kodlamaio.Hrms.core.utilities.results.DataResult;
import Kodlamaio.Hrms.core.utilities.results.Result;
import Kodlamaio.Hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobTitles")
public class JobTitlesController {

    private JobTitleService jobTitleService;

    @Autowired
    public JobTitlesController(JobTitleService jobTitleService) {
        super();
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("/getall")
    public DataResult<List<JobTitle>> getAll() {
        return this.jobTitleService.getAll();
    }
    
    @PostMapping("/add")
    public Result add(@RequestBody JobTitle jobTitle) {
    	return this.jobTitleService.add(jobTitle);
    }
    
    @PostMapping("/update")
	public Result update(@RequestBody JobTitle jobTitle) {
		return this.jobTitleService.update(jobTitle);
	}
    
    @PostMapping("/delete")
	public Result delete(@RequestBody JobTitle jobTitle) {
		return this.jobTitleService.delete(jobTitle);
	}
    
    
    
    
    
    
}