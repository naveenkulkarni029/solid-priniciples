package org.nbk.solid.principle.isp.context;

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
    public void printReport(Customer customer) {
	reportGenerator.generateReport(customer);
    }
    
    

}
