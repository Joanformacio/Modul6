package com.jobs.domain;

import com.jobs.helpers.SalaryExceptions;

public class Manager extends Employee{
	
	public Manager(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate ) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		if (salaryPerMonth<3000 || salaryPerMonth>5000) throw new SalaryExceptions("Manager");
	}
	
	@Override
	public void pay() {
		totalPaid=this.paymentRate.pay(this.salaryPerMonth);
	}
}
