package com.jobs.helpers;

import java.util.*;

public class CalculateIRPC {
	HashMap<String, String> irpcMap = new HashMap<String, String>();
	
	
	
	public CalculateIRPC () {
		
	}
	
	public double getIrpc(String category) {
		
		irpcMap.put("Boss", "0.32");
		irpcMap.put("Manager", "0.26");
		irpcMap.put("Senior", "0.24");
		irpcMap.put("Mid", "0.15");
		irpcMap.put("Junior", "0.02");
		
		double valorIrpc= Double.parseDouble(irpcMap.get(category)) ;
		
		return (1-valorIrpc);
	}
	
	
}
