package School;

import java.util.ArrayList;
import java.util.List;

import observerPattern.Listenable;

public class Teacher extends Listenable{
	
	private List<Assignment> assignments;
	private String name;
	
	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher(String name) {
		super();
		this.assignments = new ArrayList<>();
		this.name = name;
	}
	
	public void update(List<Assignment> newAssignments) {
		this.assignments.addAll(newAssignments);
		newAssignments.stream().forEach((assignment) -> notifyAllListeners(assignment, this));
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + "Assignments : " + this.assignments +"]";
	}

	public void addStudents(List<Student> group) {
		group.forEach((student) -> addListener(student));
		
	}
	
	public boolean removeStudents(Student student) {
		return removeListener(student);
		
	}

	public void addAssignment(List<Assignment> assignment) {
		this.assignments.addAll(assignment);
		update(assignment);		
	}


}
