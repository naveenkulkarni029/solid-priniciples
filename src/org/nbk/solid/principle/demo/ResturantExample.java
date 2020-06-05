package org.nbk.solid.principle.demo;

import java.util.ArrayList;
import java.util.List;

import org.nbk.solid.principle.generator.ReportGenerator;
import org.nbk.solid.principle.isp.context.ReportContext;
import org.nbk.solid.principle.model.Customer;
import org.nbk.solid.principle.model.Item;
import org.nbk.solid.principle.service.BillingService;
import org.nbk.solid.principle.service.ReportingService;

public class ResturantExample {

    private Customer customer;
    private long gst;

    {

	Item item1 = new Item("Alu Biriyani", 2, 185);
	Item item2 = new Item("Paneer Biriyani", 1, 200);
	Item item3 = new Item("Chicken Biriyani", 2, 250);

	List<Item> items = new ArrayList<>();
	items.add(item1);
	items.add(item2);
	items.add(item3);

	this.customer = new Customer("1", "Naveen", "25");
	this.gst = 18;

	customer.setItems(items);
    }

    public void demoRun() {
	// Single Responsibility Principle
	BillingService billingService = new BillingService();
	double bill = billingService.calculateBill(customer, gst);
	System.out.println("Total Bill amount with GST " + bill);
	customer.setBillAmount(bill);

	System.out.println(customer);

	// Interface Segregation Principle
	// OPEN FOR EXTENSION change the reportType and create new class implementing
	// reportGenerator Interface.
	ReportingService service = new ReportingService();
	ReportGenerator reportGenerator = service.printReport(customer, "JSON");

	// Dependency Injection
	ReportContext context = new ReportContext(reportGenerator);
	context.printReport(customer);

	// LSP --> Concentrated on DUCK Typing Type Comparison between duck and swan
	// cannot multi vendor support of dcm images as the vendors can create there
	// private tags during dicom image acquisition.
    }

}
