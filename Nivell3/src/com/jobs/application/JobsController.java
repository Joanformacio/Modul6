package com.jobs.application;

import java.util.*;

import com.jobs.domain.*;
import com.jobs.helpers.CalculateIRPC;
import com.jobs.persistence.EmployeeRepository;



public class JobsController {

	public EmployeeRepository repository= new EmployeeRepository();
	CalculateIRPC irpc = new CalculateIRPC();
	public JobsController(){
		
	}
	
	public void createBoss(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Boss boss = new Boss(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss(irpc));
		repository.addMember(boss);
	}
	
	public void createManager(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Manager manager = new Manager(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager(irpc));
		repository.addMember(manager);
	}

	public void createSenior(String name, String address, String phone, double salaryPerMonth) throws Exception{
		// TODO Auto-generated method stub
		Senior senior = new Senior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateSenior(irpc));
		repository.addMember(senior);
		
	}
	
	public void createMid(String name, String address, String phone, double salaryPerMonth) throws Exception{
		// TODO Auto-generated method stub
		Mid mid = new Mid(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateSenior(irpc));
		repository.addMember(mid);
		
	}
	
	public void createJunior(String name, String address, String phone, double salaryPerMonth) throws Exception{
		// TODO Auto-generated method stub
		Junior junior = new Junior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateJunior(irpc));
		repository.addMember(junior);
		
	}
	
	public void createVolunteer(String name, String address, String phone, double salaryPerMonth , String description) throws Exception {
		Volunteer volunteer = new Volunteer(name, address, phone, salaryPerMonth,PaymentFactory.createPaymentRateVolunteer());
		if (description==null) throw new Exception();
		volunteer.setDescription(description);
		repository.addMember(volunteer);			
	}	


	public void payAllEmployeers() {
		// TODO Auto-generated method stub
		List<Employee> payList= repository.getAllMembers();
		
		for (Employee e:payList) {
			e.pay();	
		}
			
	}

	public String getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> payList= repository.getAllMembers();
		String employees=" ";
		
		for (Employee element:payList) {
			
			employees+= element + ".\n";
	
		}		
				
		return employees;

	}

	
		
		
	
	
	
}
