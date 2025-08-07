package day11;

public class Enrollment {

	public static void main(String[] args) {
		
		Student students = new Student();
		
		students.addStudent("wonhee", 1);
		students.addStudent("w", 2);
		students.addStudent("wo", 3);
		students.addStudent("won", 4);
		students.addStudent("wonh", 5);
		
		students.searchStudent(3);
		
		students.dropStudent(3);
		
		
	}

}
