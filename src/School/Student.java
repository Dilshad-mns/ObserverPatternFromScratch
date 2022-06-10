package School;

import java.util.ArrayList;
import java.util.List;

import observerPattern.Listenable;
import observerPattern.Listener;

public class Student implements Listener {
	
	List<Assignment> assignments;
	String name;
	
	public Student(String name) {
		this.name = name;
		this.assignments = new ArrayList<>();
	}

	@Override
	public void update(Object obj, Listenable listenable) {
		this.assignments.add((Assignment)obj);
		System.out.println("Teacher : "+ ((Teacher)listenable).getName() + " updated Assignment "+ ((Assignment)obj).getTitle() + " to Student : "+ this.name);
	}

	public void show() {
		System.out.println("Student : "+this.name);
		System.out.println("Assignments : "+this.assignments);
	}
}
