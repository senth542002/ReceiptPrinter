package com.sen.code;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReceiptGeneratorSpec {
	
	ReceiptGenerator receiptGenerator;
	List<Item> items = new ArrayList<>();
	
	@Before
	public void initialize() {		
		receiptGenerator = new ReceiptGenerator();
	}

	@Test
	public void generatesReceiptForOneBook() {
		Item item = new Item("Book", 5.0, 1, false);
		items.add(item);
		double totalCost = receiptGenerator.generateTotalCostFor(items);
		Assert.assertEquals(5.5, totalCost, 0);
	}
	
	@Test
	public void generatesReceiptForOneImportedBook() {
		Item item = new Item("Book", 5.0, 1, true);
		items.add(item);
		double totalCost = receiptGenerator.generateTotalCostFor(items);
		Assert.assertEquals(6.0, totalCost, 0);
	}
	
	@Test
	public void generatesTotalCostForTwoImportedBooks() throws Exception {
		Item item = new Item("Book", 5.0, 2, true);
		items.add(item);
		double totalCost = receiptGenerator.generateTotalCostFor(items);
		Assert.assertEquals(12.0, totalCost, 0);
	}
	
	@Test
	public void generatesTotalCostForOneCDAndOneBook() throws Exception {
		Item book = new Item("Book", 5.0, 1, true);
		Item cd = new Item("CD", 5.0, 1, true);
		items.add(book);
		items.add(cd);
		
		double totalCost = receiptGenerator.generateTotalCostFor(items);
		Assert.assertEquals(12.0, totalCost, 0);
	}

}
