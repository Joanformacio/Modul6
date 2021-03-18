package com.jobs.helpers;

import java.lang.Exception;

public class SalaryExceptions extends Exception {
	
	/**
	 * 
	 */
	
	private String typeError;
	
	public SalaryExceptions(String tipoError) {
		super();
		
		this.typeError=tipoError;
	}
	@Override
	public String getMessage() {
		String mensaje="";
		switch(typeError) {
		
		case "Boss":
			mensaje= "The salary must be over 8000";
			break;
		case "Manager":
			mensaje= "The salary must be between 3000 and 5000";
			break;
		case "Senior":
			mensaje= "The salary must be between  2700 and 4000";
			break;
		case "Mid":
			mensaje= "The salary must be between  1800 and 2500";
			break;
		case "Junior":
			mensaje= "The salary must be between  900 and 1600";
			break;
		case "Volunteer":
			mensaje= "The volunteer don't have a salary";
			break;
			
		}
		
		return mensaje;
	}
}
