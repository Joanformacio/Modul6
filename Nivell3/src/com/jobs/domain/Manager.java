package com.jobs.domain;

import com.jobs.helpers.SalaryExceptions;

public class Manager extends Employee{
	
	public Manager(String name, String address, String phone, double grossSalary,IPaymentRate paymentRate ) throws Exception {
		super(name, address, phone, grossSalary, paymentRate);
		if (grossSalary<3000 || grossSalary>5000) throw new SalaryExceptions("Manager");
	}
	
	@Override
	public void pay() {
		netSalary=this.paymentRate.pay(this.grossSalary);
	}
}
