package org.nbk.solid.principle.service;

import org.nbk.solid.principle.generator.ReportGenerator;
import org.nbk.solid.principle.model.Customer;
import org.nbk.solid.principle.reports.impl.CSVReport;
import org.nbk.solid.principle.reports.impl.JsonReport;
import org.nbk.solid.principle.reports.impl.PDFReport;

public class ReportingService {

    private ReportGenerator reportGenerator;

    public ReportGenerator printReport(Customer customer, String reportType) {
	if (reportType.equalsIgnoreCase("CSV")) {
	    reportGenerator = new CSVReport();
	}
	if (reportType.equalsIgnoreCase("PDF")) {
	    reportGenerator = new PDFReport();
	}

	if (reportType.equalsIgnoreCase("JSON")) {
	    reportGenerator = new JsonReport();
	}

	return reportGenerator;
    }
}
