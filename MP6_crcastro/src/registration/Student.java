package registration;

public class Student extends Person {
	private String major;
	private double gpa;
	
	public Student(String name, int age, String email, String major, double gpa) {
		super(name, age, email);
		this.major = major;
		this.gpa = gpa;
	}
	public String toString() {
		return "Student: " + super.toString() + "major = " + major + ", gpa = " + gpa;
		
	}
	public void registerCourse(Course course) {
		course.addStudent(this);
	}
	
	
}
