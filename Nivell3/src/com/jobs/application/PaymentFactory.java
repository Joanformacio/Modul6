package com.jobs.application;

import com.jobs.domain.IPaymentRate;
import com.jobs.helpers.*;
public class PaymentFactory {

	
	
	public static IPaymentRate createPaymentRateBoss(CalculateIRPC rateIrpc){
		return new IPaymentRate() {	
			@Override
			public double pay(double grossSalary) {
				return grossSalary*rateIrpc.getIrpc("Boss");
			}
		};
	}
	
	public static IPaymentRate createPaymentRateManager(CalculateIRPC rateIrpc){
		return new IPaymentRate() {	
			@Override
			public double pay(double grossSalary) {
				
				return grossSalary*rateIrpc.getIrpc("Manager");
			}
		};
	}
	
	public static IPaymentRate createPaymentRateSenior(CalculateIRPC rateIrpc){
		return new IPaymentRate() {
			@Override
			public double pay(double grossSalary) {
				return grossSalary*rateIrpc.getIrpc("Senior"); 
			}
		};
	}
	
	public static IPaymentRate createPaymentRateMid(CalculateIRPC rateIrpc){
		return new IPaymentRate() {
			@Override
			public double pay(double grossSalary) {
				return grossSalary*rateIrpc.getIrpc("Mid"); 
			}
		};
	}
	
	public static IPaymentRate createPaymentRateJunior(CalculateIRPC rateIrpc){
		return new IPaymentRate() {
			@Override
			public double pay(double grossSalary) {
				return grossSalary*rateIrpc.getIrpc("Junior"); 
			}
		};
	}
	
	public static IPaymentRate createPaymentRateVolunteer(){
		return new IPaymentRate() {
			@Override
			public double pay(double grossSalary) {
				return grossSalary; 
			}
		};
	}
	
}
