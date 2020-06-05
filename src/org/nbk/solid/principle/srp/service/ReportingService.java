package org.nbk.solid.principle.srp.service;

import org.nbk.solid.principle.srp.model.Customer;

public class ReportingService {
    
	public void printReport(Customer customer,String reportType)
	{
		if(reportType.equalsIgnoreCase("CSV"))
		{
			System.out.println("Print CSV report");
		}
		if(reportType.equalsIgnoreCase("XML"))
		{
			System.out.println("Print XML report");
		}
		
		if(reportType.equalsIgnoreCase("JSON"))
		{
			System.out.println("Print JSON report");
		}
		
	}
}
