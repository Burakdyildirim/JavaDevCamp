package Kodlamaio.Hrms.core.utilities.results;

import lombok.Data;

@Data

public class Result {
	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success= success;
	}
	public Result(Boolean success,String message) {
		this(success);
		this.message=message;
	}

}
