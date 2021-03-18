package com.jobs.domain;

import com.jobs.helpers.SalaryExceptions;

public class Junior extends Employee{
	
	
	public Junior(String name, String address, String phone, double grossSalary,IPaymentRate paymentRate ) throws Exception {
		super(name, address, phone, grossSalary, paymentRate);
		if (grossSalary<900 || grossSalary>1600) throw new SalaryExceptions("Junior");
	}
	
	@Override
	public void pay() {
		netSalary=this.paymentRate.pay(this.grossSalary);
	}
}
