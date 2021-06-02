package Kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name="user_id" ,referencedColumnName ="id")
@Table(name= "job_seekers")

public class JobSeeker extends User{
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "surname")
	private String surname;
	
	@Column(name= "national_identity")
	private String nationalIdentity;
	
	@Column(name= "birth_year")
	private int birthYear;
	
	@Column(name = "email")
	private String email;
	
	@Column(name= "password")
	private String password;

}
