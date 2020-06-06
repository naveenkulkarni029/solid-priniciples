package org.nbk.solid.principle.context;

import org.nbk.solid.principle.generator.ReportGenerator;
import org.nbk.solid.principle.model.Customer;

public class ReportContext {

    private ReportGenerator reportGenerator;

    
    // Dependency Injection Principle
    public ReportContext(ReportGenerator reportGenerator) {
	super();
	this.reportGenerator = reportGenerator;
    }
    
    // Data Abstraction
    // We are just generating a report. Here we do not know what type of a report will be generated
    public void printReport(Customer customer) {
	reportGenerator.generateReport(customer);
    }
    
    

}
