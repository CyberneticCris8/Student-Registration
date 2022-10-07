package registration;

public class Course {

	private String department;
	private String courseName;
	
	private int maxSize;
	private Student[] roster;
	private Faculty instructor;
	private int currentEnroll;
	
	public Course(String department, String courseName, int maxSize) {
		
		this.department = department;
		this.courseName = courseName;
		
		this.maxSize = maxSize;
		this.roster = new Student[maxSize];
		this.currentEnroll = 0;
	}
	public String toString() {
		return "Course: department =" + department + ", courseName = " + courseName + ", maxSize = " + maxSize + ", currentEnroll = " + currentEnroll + (instructor != null ? ", " + instructor :"");
		
	}
	public void assignInstructor(Faculty faculty) {
		if (faculty.getDepartment().equals(this.department)) {
			instructor = faculty;
			System.out.println(faculty.getName() + "has been assigned to teach this course.");
		} else {
			System.out.println(faculty.getName() + "cannot be assigned to this course. Only faculties from " + this.department + "department can be assigned to teach this course.");
			
		}
	}
	public void displayRoster() {
		if (currentEnroll > 0) {
			for(int i = 0; i < currentEnroll; i ++) {
			System.out.println(roster[i]);	
			}
		} else {
			System.out.println("No student is currently enrolled.");
			
		}
	}
	public void addStudent(Student student) {
		if(currentEnroll < maxSize) {
			for(int i = 0; i < currentEnroll; i ++) {
				if(student.equals(roster[i])) {
					System.out.println(student.getName() + " is already in this class.");
					return;
				}
			}
			roster[currentEnroll++] = student;
			
		} else {
			System.out.println(student.getName() + " cannot be added to the roster. Class is full.");
	}
}
}
