package Kodlamaio.Hrms.core.adapter;

import org.springframework.stereotype.Service;

import Kodlamaio.Hrms.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisServiceAdapter implements CheckMernisService{
	
	@Override
	public boolean checkIfRealTcNo(JobSeeker jobSeeker) {
		 KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

	        boolean serviceResult=false;

	        try {

	            serviceResult = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getNationalIdentity()),
	                    jobSeeker.getName().toUpperCase(),
	                    jobSeeker.getSurname().toUpperCase(),
	                    jobSeeker.getBirthYear());

	        } catch (Exception e) {

	            System.out.println("Not a valid person");
	        }

	       return serviceResult; 
	}

}
