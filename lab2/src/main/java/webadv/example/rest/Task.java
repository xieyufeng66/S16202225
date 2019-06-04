package webadv.example.rest;

public class Task {
  int id;
  String message;
public int getId() {
	return id;
}
public Task(int id, String message) {
	super();
	this.id = id;
	this.message = message;
}
public void setId(int id) {
	this.id = id;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
}
