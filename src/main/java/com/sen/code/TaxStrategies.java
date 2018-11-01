package com.sen.code;

import java.util.HashMap;
import java.util.Map;

public class TaxStrategies {
	
	public static Tax<Item,Double> importTax = item -> item.isImported() ? (0.1 * item.getPriceCost()) : 0 ;
	
	public static Tax<Item,Double> salesTax = item -> (0.1 * item.getPriceCost());
	
	public static Map<String, Tax<Item,Double>> taxStrategies;
	
	static {
		taxStrategies = new HashMap<>();		
		taxStrategies.put("importTax", importTax);
		taxStrategies.put("salesTax", salesTax);
	}
	
	
}
