package hw5;

import java.util.ArrayList;


public class Course {
	public int id;
	public String name;
	public int maxCapacity;
	public boolean isFull;
	public Professor prof;
	public ArrayList<Student> student= new ArrayList<Student>();
	public ArrayList<Exam> exam= new ArrayList<Exam>();
	public ArrayList<TA> tas= new ArrayList<TA>();
	public Course(int id,String name,int cap, Professor prof) {
		this.id=id;
		this.name=name;
		this.maxCapacity=cap;
		this.prof=prof;
		Exam a= new Exam();
		this.has(a);
	}
	public void has(Exam newExam) {
		this.exam.add(newExam);
	}
	public void Enroll(Student newStudent) {
		student.add(newStudent);
	}
	public void apply(TA ta) {
		 tas.add(ta);
	}
	public void setMaxCap(int max) {
		this.maxCapacity=max;
	}
	public Professor getProf() {
		return prof;
	}

	
	
	
	
	


}
