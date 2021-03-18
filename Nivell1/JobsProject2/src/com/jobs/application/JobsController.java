package com.jobs.application;

import java.util.*;

import com.jobs.domain.*;
import com.jobs.persistence.EmployeeRepository;



public class JobsController {

	public EmployeeRepository repository= new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(boss);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		// TODO Auto-generated method stub
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(boss);
		
	}


	public void payAllEmployeers() {
		// TODO Auto-generated method stub
		List<AbsStaffMember> payList= repository.getAllMembers();
		
		
		for (AbsStaffMember e:payList) {
			
			if(e instanceof Employee) {
				Employee element= (Employee) e;
				element.pay();
				
			}
			
			
		}
	}

	public String getAllEmployees() {
		// TODO Auto-generated method stub
		List<AbsStaffMember> payList= repository.getAllMembers();
		String employees=" ";
		
		for (AbsStaffMember e:payList) {
			
			if(e instanceof Employee) {
				Employee element= (Employee)e;
				employees+= element + ".\n";
				
			}else if(e instanceof Volunteer){
				Volunteer element= (Volunteer)e;
				employees+=element +".\n ";
			}

		}
		return employees;
	}

	
	public void createVolunteer(String name, String address, String phone, String description) throws Exception {
		Volunteer volunteer = new Volunteer(name, address, phone, description);
		repository.addMember(volunteer);			
	}		
		
	
	
	
}
