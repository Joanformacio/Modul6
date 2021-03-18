package com.jobs.domain;

import com.jobs.helpers.SalaryExceptions;

public class Boss extends Employee{
	
	public Boss(String name, String address, String phone, double grossSalary,IPaymentRate paymentRate ) throws Exception {
		super(name, address, phone, grossSalary, paymentRate);
		if (grossSalary<8000) throw new SalaryExceptions("Boss");
	}
	
	
	@Override
	public void pay() {
		netSalary=this.paymentRate.pay(this.grossSalary);
	}
}
