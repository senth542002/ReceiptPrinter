package com.sen.code;

import java.util.function.Supplier;

public class Item{
	
	private String name;
	private double price;
	private int numberOfItems;
	private boolean isImported = false;
	private double priceCost;
	private TaxCalculator taxCalculator = new TaxCalculator();
	
	public Item(String name, double price, int numberOfItems, boolean isImported) {
		this.name = name;
		this.price = price;
		this.numberOfItems = numberOfItems;
		this.isImported = isImported;
		this.priceCost = this.price * this.numberOfItems;
	}

	public Supplier<Double> itemCost = () -> (this.priceCost) + taxCalculator.calculateTaxes(this);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public boolean isImported() {
		return isImported;
	}

	public double getPriceCost() {
		return priceCost;
	}
}


