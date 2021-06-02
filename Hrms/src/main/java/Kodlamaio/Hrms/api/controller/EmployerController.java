package Kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.Hrms.business.abstracts.EmployerService;
import Kodlamaio.Hrms.core.utilities.results.Result;
import Kodlamaio.Hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/Employer")
public class EmployerController {
	private EmployerService employerService;
	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService=employerService;
	}
	@GetMapping("/getall")
	public List<Employer> getall(){
		return this.employerService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}
	@PostMapping("/update")
	public Result update (@RequestBody Employer employer) {
		return this.employerService.update(employer);
	}
	@PostMapping("/delete")
	public Result delete (@RequestBody Employer employer) {
		return this.employerService.delete(employer);
	}
}
