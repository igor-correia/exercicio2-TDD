package com.model;

public class TaskModel {
	
	private String title;
	private String description;
	
	public TaskModel(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	public String getTitle() {
		return this.title;
	}

	public String getDescription() {
		return this.description;
	}

}