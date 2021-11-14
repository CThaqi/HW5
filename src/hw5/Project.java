package hw5;

import java.util.ArrayList;

public final class Project {
	String name;
	
	public ArrayList<Student> members= new ArrayList<Student>();
	
	public Course course;
	public Project(String name,ArrayList<Student> members,Course course) {
		this.name=name;
		this.members=members;
		this.course=course;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public void addNewMember(Student s) {
		members.add(s);
	}
	public ArrayList<Student> getMembers() {
		return members;
	}
	
	public Course getCourse() {
		return course;
	}
	

}
