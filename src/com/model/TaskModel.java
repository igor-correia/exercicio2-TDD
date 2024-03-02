package com.model;

import java.time.LocalDate;

public class TaskModel {
	
	private String title;
	private String description;
	private LocalDate date;
	
	public TaskModel(String title, String description, LocalDate date) {
		this.title = title;
		this.description = description;
		this.date = date;
	}
	
	public String getTitle() {
		return this.title;
	}

	public String getDescription() {
		return this.description;
	}
	
	public LocalDate getDate() {
		return this.date;
	}

}