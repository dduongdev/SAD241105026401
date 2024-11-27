package com.dduongdev.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.dduongdev.entities.TimeEntry;
import com.dduongdev.entities.Timecard;

public class TimecardService {
	private static final double MAX_HOURS_PER_WEEK = 40;
	private static final List<Timecard> timecards = new ArrayList<>();
	
	public Timecard getCurrentTimecard(int employeeId) {
		Optional<Timecard> timecard = timecards.stream()
				.filter(t -> t.getEmployeeId() == employeeId && t.getEndDate().isBefore(LocalDate.now()) && t.getStatus() == "draft")
				.findFirst();
		if (timecard.isPresent()) {
			return timecard.get();
		}
		
		LocalDate startDate = LocalDate.now();
		LocalDate endDate = startDate.plusDays(6);
		Timecard newTimecard = new Timecard(startDate, endDate, employeeId);
		return newTimecard;
	}
	
	public void submitTimecard(Timecard timecard) throws Exception {
		if ("submitted".equals(timecard.getStatus())) {
			throw new Exception("Timecard already submitted.");
		}
		
		double totalHours = timecard.getTimeEntries().stream().mapToDouble(TimeEntry::getHours).sum();
		if (totalHours > MAX_HOURS_PER_WEEK) {
			throw new Exception("Exceeded maximum allowed hours for the week.");
		}
		
		timecard.setSubmissionDate(LocalDate.now());
        timecard.lock();
        System.out.println("Timecard submitted successfully.");
	}
}
