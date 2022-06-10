package School;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Syllabus {
	public static void main(String ...args) {
		Teacher teacher1 = new Teacher("Alpha");
		Teacher teacher2 = new Teacher("Beta");
		
		Student student1 = new Student("Rajesh");
		Student student2 = new Student("Adhi");
		Student student3 = new Student("Ramya");
		
		List<Student> group1 = new ArrayList<>();
	    List<Student> group2 = new ArrayList<>();
	    
	    group1.addAll(Arrays.asList(student1, student2));
	    group2.addAll(Arrays.asList(student2, student3));
//	    group3.addAll(Arrays.asList(student3, student1));
	    
	    List<Assignment> assignment1 = Arrays.asList(new Assignment("A"), new Assignment("C"));
	    List<Assignment> assignment2 = Arrays.asList(new Assignment("B"), new Assignment("D"));
	    
	    teacher1.addStudents(group1);
	    teacher2.addStudents(group2);
	    
	    teacher1.addAssignment(assignment1);
	    teacher2.addAssignment(assignment2);
	    
	    student1.show();
	    student2.show();
	    student3.show();
	}
}
