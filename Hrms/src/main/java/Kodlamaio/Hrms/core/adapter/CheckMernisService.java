package Kodlamaio.Hrms.core.adapter;

import Kodlamaio.Hrms.entities.concretes.JobSeeker;

public interface CheckMernisService {
	boolean checkIfRealTcNo(JobSeeker jobSeeker);
}
