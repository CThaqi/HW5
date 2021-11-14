package hw5;

import java.util.ArrayList;

public class Department {

	public Department(String name, Professor prof) {
		this.name=name;
		this.chair=prof;
	}
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(ArrayList<Employee> employee) {
		this.employee = employee;
	}
	public Professor getChair() {
		return chair;
	}
	public void setChair(Professor chair) {
		this.chair = chair;
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	public ArrayList<Employee> employee= new ArrayList<Employee>();
	public Professor chair = new Professor();
	public ArrayList<Course> courses= new ArrayList<Course>();
}
