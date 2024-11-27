package com.dduongdev.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Timecard {
	private LocalDate startDate;
	private LocalDate endDate;
	private LocalDate submissionDate;
	private String status;
	private List<TimeEntry> timeEntries;
	private int employeeId;
	
	public Timecard(LocalDate startDate, LocalDate endDate, int employeeId) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.employeeId = employeeId;
		this.status = "draft";
		this.timeEntries = new ArrayList<TimeEntry>();
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalDate getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(LocalDate submissionDate) {
		this.submissionDate = submissionDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public List<TimeEntry> getTimeEntries() {
		return timeEntries;
	}
	
	public void addEntry(TimeEntry timeEntry) {
		timeEntries.add(timeEntry);
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public void lock() {
		this.status = "submitted";
	}
}
