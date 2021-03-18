package com.jobs.persistence;

import java.util.*;


import com.jobs.domain.Employee;

public class EmployeeRepository {

	private static List<Employee> members=new ArrayList<>();
	
	public EmployeeRepository(){
		
	}
	
	public List<Employee> getAllMembers(){
		return new ArrayList<>(members);
	}
	
	
	public void addMember(Employee member) throws Exception{
		if(member==null) throw new Exception();
		members.add(member);
	}
	
	
}
