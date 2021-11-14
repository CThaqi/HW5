package hw5;

import java.util.ArrayList;

public class Exam {
	public int max_value;
	
	Course course = new Course(0, null, 0, null);
	public ArrayList<Question> questions= new ArrayList<Question>();
	public ArrayList<Student> student= new ArrayList<Student>();
	public Exam(Course c,Question q) {
		this.questions.add(q);
		this.course=c;
	}	
	public boolean register(Student s) {
		if(student.contains(s)) {
			return true;
		}
		return false;
		
	}
	public void addQuestion(int id,String task,int value) {
		 Question q=new Question(id,task,value);
		 questions.add(q);
	}
	public void setMaxValue(int max) {
			this.max_value=max;
	}
	

}
