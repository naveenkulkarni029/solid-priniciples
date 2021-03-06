package org.nbk.solid.principle.service;

import java.util.List;

import org.nbk.solid.principle.model.Customer;
import org.nbk.solid.principle.model.Item;

public class BillingService {

    public double calculateBill(Customer customer, long gst) {
	double bill = 0;
	List<Item> items = customer.getItems();
	for (Item item : items) {
	    bill += (item.getPrice()*item.getQuantity());
	}

	bill =bill+(bill * gst) / 100;
	return bill;
    }

}
