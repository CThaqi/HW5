package hw5;

import java.util.ArrayList;

public class Student {

	
	public String name;
	public int StudentId;
	public ArrayList<Course> courses= new ArrayList<Course>();
	Project project= new Project(name, null, null);
	public ArrayList<Exam> exam= new ArrayList<Exam>();
	public Student(String n, int s,Course c) {
		
		this.name = n;
		StudentId = s;
		
	}
	public void is_member_of(Project p) {
		this.project=p;
	}
	public void setName(String n) {
		this.name=n;
	}
	public Project getProjects() {
		return project;
	}
	public String getName() {
		return name;
	}
	
	
	
	
	

}
