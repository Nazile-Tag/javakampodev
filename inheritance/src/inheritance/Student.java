package inheritance;

public class Student extends User {
	private String selectedCourses;
	
	public Student() {
		
	}

	public Student(String selectedCourses) {
		super();
		this.selectedCourses = selectedCourses;
	}

	public String getSelectedCourses() {
		return selectedCourses;
	}

	public void setSelectedCourses(String selectedCourses) {
		this.selectedCourses = selectedCourses;
	}
}
