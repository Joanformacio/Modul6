package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
		
	private String description;
	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		
		//TODO
		if (description.equals("")) throw new Exception();
		
		this.description=description;
	}

	
	@Override
	public void pay() {
		//TODO
		super.totalPaid=0;
	}


	@Override
	public String toString() {
		return "Volunteer [description=" + description + ", id=" + id + ", name=" + name + ", address=" + address
				+ ", phone=" + phone + ", totalPaid=" + totalPaid + "]";
	}
	
	

}
