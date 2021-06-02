package Kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.Hrms.business.abstracts.UserService;
import Kodlamaio.Hrms.core.utilities.results.DataResult;
import Kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import Kodlamaio.Hrms.dataAccess.abstracts.UserDao;
import Kodlamaio.Hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao=userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Kullanıcılar Listelendi");
	}





}
