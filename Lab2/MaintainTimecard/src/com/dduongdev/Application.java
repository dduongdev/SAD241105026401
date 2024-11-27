package com.dduongdev;

import java.time.LocalDate;
import java.util.Scanner;

import com.dduongdev.entities.Employee;
import com.dduongdev.entities.TimeEntry;
import com.dduongdev.entities.Timecard;
import com.dduongdev.services.ProjectManagementDatabase;
import com.dduongdev.services.TimecardService;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TimecardService timecardService = new TimecardService();
		ProjectManagementDatabase projectManagementDatabase = new ProjectManagementDatabase();
		Employee employee = new Employee(1, "dduongdev");
		
		System.out.println("Available charge numbers: " + projectManagementDatabase.getAvailableChargeNumbers());
		
		System.out.println("Select charge number: ");
		String selectedChargeNumber = sc.nextLine();
		System.out.println("Enter hours worked: ");
		double hoursWorked = Double.parseDouble(sc.nextLine());
		
		TimeEntry timeEntry = new TimeEntry(LocalDate.now(), selectedChargeNumber, hoursWorked);
		Timecard timecard = timecardService.getCurrentTimecard(employee.getEmployeeId());
		
		timecard.addEntry(timeEntry);
		
		try {
			timecardService.submitTimecard(timecard);
		}
		catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
		
		sc.close();
	}
}
