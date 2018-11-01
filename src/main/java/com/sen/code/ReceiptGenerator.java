package com.sen.code;

import java.util.List;

public class ReceiptGenerator {

	public double generateTotalCostFor(List<Item> items) {
		return items.stream().mapToDouble(item -> item.itemCost.get()).sum();
	}

}
