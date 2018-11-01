package com.sen.code;

public class TaxCalculator {

	public double calculateTaxes(Item item) {
		return TaxStrategies.taxStrategies.values().stream().mapToDouble(strategy -> strategy.apply(item)).sum();
	}

}
