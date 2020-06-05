package org.nbk.solid.principle.isp.context;

import org.nbk.solid.principle.isp.service.ReportGenerator;
import org.nbk.solid.principle.model.Customer;

public class ReportContext {

    private ReportGenerator reportGenerator;

    public ReportContext(ReportGenerator reportGenerator) {
	super();
	this.reportGenerator = reportGenerator;
    }
    
    public void printReport(Customer customer) {
	reportGenerator.printReport(customer);
    }
    
    

}
