package hw5;

import java.util.ArrayList;

public class TA {
	public ArrayList<Course> courses= new ArrayList<Course>();
	public String name;
	public ArrayList<Exam> exams= new ArrayList<Exam>();
	public TA(String name,Exam exam,int contract){
		this.name=name;
		this.manages(exam);
		
		
	}
	public void teaches(Course course) {
		this.courses.add(course);
	
	}
	public void manages(Exam newExam) {
		exams.add(newExam);
	}

	
	
	@SuppressWarnings("unlikely-arg-type")
	public Course getCourse() {
		return  courses.get(courses.lastIndexOf(courses));
	}
	public void setName(String name) {
		this.name=name;
		
	}
	
}
