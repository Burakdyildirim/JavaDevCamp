package Kodlamaio.Hrms.business.abstracts;

import java.util.List;

import Kodlamaio.Hrms.core.utilities.results.DataResult;
import Kodlamaio.Hrms.entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();
}
