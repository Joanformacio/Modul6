package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args)  {
		
			try {
				controller.createBoss("Pepe Boss", "Direccion molona", "666666666", 8050);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			try {
				controller.createManager("Eusebio Manager", "Direccion molona 2", "665266666", 4000);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				System.out.println(e2.getMessage());
				
			}
			try {
				controller.createSenior("Laura Senior", "Direccion molona 3", "625266666", 3000);
			} catch (Exception e3) {
				// TODO Auto-generated catch block
				System.out.println(e3.getMessage());
				
			}
			try {
				controller.createVolunteer("Juan Volunteer", "Direccion molona 4", "614266666",0d,"Tareas de oficina");
			} catch (Exception e4) {
				// TODO Auto-generated catch block
				System.out.println(e4.getMessage());
			}catch(Error ex) {
				System.out.println(ex.getMessage());
				
			}
			try {
				controller.createMid("Pedro Mid", "Direccion molona 2", "665226666", 1900);
			} catch (Exception e5) {
				// TODO Auto-generated catch block
				System.out.println(e5.getMessage());
			}
			
			try {
				controller.createJunior("Alberto Junior", "Direccion molona 2", "665226666", 1000);
			} catch (Exception e6) {
				// TODO Auto-generated catch block
				System.out.println(e6.getMessage());
			}
		
		
		
		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("EMPLOYEES: " + allEmployees + " \n");
		
	}

}
