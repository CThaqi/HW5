package hw5;

import java.util.ArrayList;

public class Professor extends Employee {
	public ArrayList<Course> courses= new ArrayList<Course>();
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	public ArrayList<Exam> getExam() {
		return exam;
	}
	public void setExam(ArrayList<Exam> exam) {
		this.exam = exam;
	}
	public ArrayList<Exam> exam= new ArrayList<Exam>();

	public void publish_course() {
		
	}
	public void assign_TA() {
		
	}
	public void addNewCourse() {
	Course newCourse= new Course(eld, name, eld, null);
	courses.add(newCourse);
	}

}
