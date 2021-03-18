package com.jobs.domain;

import com.jobs.helpers.SalaryExceptions;

public class Senior extends Employee {
	
	public Senior(String name, String address, String phone, double grossSalary,IPaymentRate paymentRate ) throws Exception {
		super(name, address, phone, grossSalary, paymentRate);
		if (grossSalary<2700 || grossSalary>4000) throw new SalaryExceptions("Senior");
	}
	
	
	@Override
	public void pay() {
		netSalary=this.paymentRate.pay(this.grossSalary);
	}
}
