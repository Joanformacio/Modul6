package com.jobs.domain;



public abstract  class Employee  {
	
	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid=0;
	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	
	private static int COUNTER_MEMBERS = 1;
	
	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		
		if (name.equals(""))throw new Exception();
		if (address.equals(""))throw new Exception();
		if (phone.equals(""))throw new Exception();	
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

	
	
	public void pay() {}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", totalPaid="
				+ totalPaid  + "]";
	}
	
	


}
