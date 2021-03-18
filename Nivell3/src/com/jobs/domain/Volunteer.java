package com.jobs.domain;

import com.jobs.helpers.SalaryExceptions;

public class Volunteer extends Employee {
		
	protected String description;
	
	public Volunteer(String name, String address, String phone, double grossSalary, IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, grossSalary, paymentRate);
		
		//TODO
		
		if (grossSalary>300) throw new SalaryExceptions("Volunteer");
		
		
		this.grossSalary=grossSalary;
	}

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) throws Exception {
		if (description.equals("")) throw new Exception();
		this.description = description;
	}
	
	
	@Override
	public void pay() {
		//TODO
		netSalary=this.paymentRate.pay(this.grossSalary);
	}

	@Override
	public String toString() {
		return "Volunteer [id: " + id  + ", name=" + name + ", address=" + address + ", description=" + description   + ", phone=" + phone + ", government aid=" + netSalary + "]";
	}


	
	

}
