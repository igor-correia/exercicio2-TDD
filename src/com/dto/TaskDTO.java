package com.dto;

import java.time.LocalDate;
import com.model.Priority;

public class TaskDTO {

	private String title;
	private String description;
	private LocalDate date;
	private Priority priority;
	
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

}
