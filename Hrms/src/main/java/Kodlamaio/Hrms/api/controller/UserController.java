package Kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.Hrms.business.abstracts.UserService;
import Kodlamaio.Hrms.core.utilities.results.DataResult;
import Kodlamaio.Hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/User")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	@GetMapping("/getall")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();
	}
}
