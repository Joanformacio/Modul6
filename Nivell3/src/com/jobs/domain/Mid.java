package com.jobs.domain;


import com.jobs.helpers.SalaryExceptions;
public class Mid extends Employee{
	
	protected double baseSalary;
	
	public Mid(String name, String address, String phone, double grossSalary,IPaymentRate paymentRate ) throws Exception, SalaryExceptions {
		super(name, address, phone, grossSalary, paymentRate);
		if (grossSalary<1800 || grossSalary>2500) throw new SalaryExceptions("Mid");
	}
	
	
	
	@Override
	public void pay() {
		netSalary=this.paymentRate.pay(this.grossSalary);
	}

}
