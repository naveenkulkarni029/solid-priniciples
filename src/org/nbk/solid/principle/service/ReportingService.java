package org.nbk.solid.principle.service;

import org.nbk.solid.principle.generator.ReportGenerator;
import org.nbk.solid.principle.generator.impl.CSVReportGenerator;
import org.nbk.solid.principle.generator.impl.JsonReportGenerator;
import org.nbk.solid.principle.generator.impl.PDFReportGenerator;
import org.nbk.solid.principle.isp.context.ReportContext;
import org.nbk.solid.principle.model.Customer;

public class ReportingService {

    private ReportGenerator reportGenerator;

    public void printReport(Customer customer, String reportType) {
	if (reportType.equalsIgnoreCase("CSV")) {
	    reportGenerator = new CSVReportGenerator();
	}
	if (reportType.equalsIgnoreCase("PDF")) {
	    reportGenerator = new PDFReportGenerator();
	}

	if (reportType.equalsIgnoreCase("JSON")) {
	    reportGenerator = new JsonReportGenerator();
	}

	ReportContext context = new ReportContext(reportGenerator);
	context.printReport(customer);
    }
}
