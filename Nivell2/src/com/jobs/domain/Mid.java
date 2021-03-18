package com.jobs.domain;


import com.jobs.helpers.SalaryExceptions;
public class Mid extends Employee{
	
	protected double baseSalary;
	
	public Mid(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate ) throws Exception, SalaryExceptions {
		super(name, address, phone, salaryPerMonth, paymentRate);
		if (salaryPerMonth<1800 || salaryPerMonth>2500) throw new SalaryExceptions("Mid");
	}
	
	
	
	@Override
	public void pay() {
		totalPaid=this.paymentRate.pay(this.salaryPerMonth);
	}

}
