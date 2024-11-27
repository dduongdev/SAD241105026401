package com.dduongdev.entities;

import java.time.LocalDate;

public class TimeEntry {
	private LocalDate date;
	private String chargeNumber;
	private double hours;
	
	public TimeEntry(LocalDate date, String chargeNumber, double hours) {
        this.date = date;
        this.chargeNumber = chargeNumber;
        this.hours = hours;
    }

    // Getters and setters
    public LocalDate getDate() { return date; }
    public String getChargeNumber() { return chargeNumber; }
    public double getHours() { return hours; }
    public void setHours(double hours) { this.hours = hours; }
}
