package com.example.demo;

public class Task {
  private int id;
  public Task(int id, String description) {
	
	this.id = id;
	this.description = description;
}
private String description;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
  
}
