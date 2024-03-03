package com.model;

import java.time.LocalDate;

public class TaskModel {
	
	private String title;
	private String description;
	private LocalDate date;
	private Priority priority;
	
	public TaskModel(String title, String description, LocalDate date, Priority priority) {
		this.title = title;
		this.description = description;
		this.date = date;
		this.priority = priority;
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
	
	public Priority getPriority() {
		return this.priority;
	}

	public void setTitle(String newTitle) {
		this.title = newTitle;
	}

	public void setDescription(String newDescription) {
		this.description = newDescription;
	}

	public void setDate(LocalDate newDate) {
		this.date = newDate;
	}
	
	public void setPriority(Priority newPriority) {
		this.priority = newPriority;
	}

}