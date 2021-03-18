package com.jobs.domain;

import com.jobs.helpers.SalaryExceptions;

public class Volunteer extends Employee {
		
	protected String description;
	
	public Volunteer(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		
		//TODO
		
		if (salaryPerMonth>0) throw new SalaryExceptions("Volunteer");
		
		
		this.salaryPerMonth=salaryPerMonth;
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
		totalPaid=this.paymentRate.pay(this.salaryPerMonth);
	}

	@Override
	public String toString() {
		return "Volunteer [id: " + id  + ", name=" + name + ", address=" + address + ", description=" + description   + ", phone=" + phone + ", totalPaid=" + totalPaid + "]";
	}


	
	

}
