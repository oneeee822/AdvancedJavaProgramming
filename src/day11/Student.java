package day11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Student {
	
	private String Name;
	private int StudentId;
	Collection<Student> course = new ArrayList<Student>();
	
	public Student() {
		
	}
	
	public Student(String name, int studentId) {
		Name = name;
		StudentId = studentId;
	}


	public String getName() {
		return Name;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void addStudent(String name, int studentId) {
		this.course.add(new Student(name, studentId));
	}
	
	public void searchStudent(int studentId) {
		
		for(Student s : this.course) {
			if(s.getStudentId() == studentId) 
				 System.out.println(s.getName() + " "+ s.getStudentId());
		}
		
	}
	
	public void dropStudent(int studentId) {
		Iterator<Student> it = this.course.iterator();
		
		while(it.hasNext()) {
			Student student = it.next();
			if(student.getStudentId() == studentId) {
				it.remove();
			}
		}
		
		course.forEach(student -> System.out.println(student.getName() +" " + student.getStudentId()));
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	

}
