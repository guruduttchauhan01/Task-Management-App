package com.guru.Task_Management_App.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Task {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String title;
	 private String description;
	 private LocalDate dueDate;
	 private String status;
	
	 // Getters and Setters
	 public Long getId() {
	     return id;
	 }
	
	 public void setId(Long id) {
	     this.id = id;
	 }
	
	 public String getTitle() {
	     return title;
	 }
	
	 public void setTitle(String title) {
	     this.title = title;
	 }
	
	 public String getDescription() {
	     return description;
	 }
	
	 public void setDescription(String description) {
	     this.description = description;
	 }
	
	 public LocalDate getDueDate() {
	     return dueDate;
	 }
	
	 public void setDueDate(LocalDate dueDate) {
	     this.dueDate = dueDate;
	 }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	 
	 
}

