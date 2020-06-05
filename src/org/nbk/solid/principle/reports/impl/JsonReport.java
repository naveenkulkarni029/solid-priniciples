package org.nbk.solid.principle.reports.impl;

import org.nbk.solid.principle.generator.ReportGenerator;
import org.nbk.solid.principle.model.Customer;

public class JsonReport implements ReportGenerator {

    @Override
    public void generateReport(Customer customer) {
	System.out.println("JSON REPORT");

    }

}
