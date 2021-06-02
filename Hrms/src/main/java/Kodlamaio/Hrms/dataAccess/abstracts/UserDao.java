package Kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlamaio.Hrms.entities.concretes.User;


public interface UserDao extends JpaRepository<User, Integer>{
}
