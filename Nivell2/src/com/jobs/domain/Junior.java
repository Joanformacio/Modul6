package com.jobs.domain;

import com.jobs.helpers.SalaryExceptions;

public class Junior extends Employee{
	
	
	public Junior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate ) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		if (salaryPerMonth<900 || salaryPerMonth>1600) throw new SalaryExceptions("Junior");
	}
	
	@Override
	public void pay() {
		totalPaid=this.paymentRate.pay(this.salaryPerMonth);
	}
}
