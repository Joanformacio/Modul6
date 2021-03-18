package com.jobs.domain;



public abstract  class Employee  {
	
	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double netSalary=0;
	protected double grossSalary=0;
	protected double grossSalaryPerYear=0;
	protected double netSalaryPerYear=0;
	protected IPaymentRate paymentRate;	
	private static int COUNTER_MEMBERS = 1;
	
	public Employee(String name, String address, String phone, double grossSalary,IPaymentRate paymentRate) throws Exception {
		
		if (name.equals(""))throw new Exception();
		if (address.equals(""))throw new Exception();
		if (phone.equals(""))throw new Exception();	
		if(grossSalary<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.grossSalary=grossSalary;
		this.paymentRate=paymentRate;
		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

	
	public double getGrossSalaryPerYear() {
		return grossSalaryPerYear=this.grossSalary*12;
	}


	


	public double getNetSalaryPerYear() {
		return this.netSalaryPerYear= this.netSalary*12;
		 
	};
	public void pay() {}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", netSalary="
				+ netSalary + ", grossSalary=" + grossSalary + ", grossSalaryPerYear=" + getGrossSalaryPerYear()
				+ ", netSalaryPerYear=" + getNetSalaryPerYear() + "]";
	}



	
	
	


}
