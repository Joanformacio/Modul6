package com.jobs.domain;

import com.jobs.helpers.SalaryExceptions;

public class Boss extends Employee{
	
	public Boss(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate ) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		if (salaryPerMonth<8000) throw new SalaryExceptions("Boss");
	}
	
	
	@Override
	public void pay() {
		totalPaid=this.paymentRate.pay(this.salaryPerMonth);
	}
}
