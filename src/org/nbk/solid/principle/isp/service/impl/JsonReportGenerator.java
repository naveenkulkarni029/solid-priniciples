package org.nbk.solid.principle.isp.service.impl;

import org.nbk.solid.principle.isp.service.ReportGenerator;
import org.nbk.solid.principle.model.Customer;

public class JsonReportGenerator implements ReportGenerator {

    @Override
    public void printReport(Customer customer) {
	System.out.println("JSON REPORT");

    }

}
