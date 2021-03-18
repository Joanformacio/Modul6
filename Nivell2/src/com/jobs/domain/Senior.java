package com.jobs.domain;

import com.jobs.helpers.SalaryExceptions;

public class Senior extends Employee {
	
	public Senior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate ) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		if (salaryPerMonth<2700 || salaryPerMonth>4000) throw new SalaryExceptions("Senior");
	}
	
	
	@Override
	public void pay() {
		totalPaid=this.paymentRate.pay(this.salaryPerMonth);
	}
}
