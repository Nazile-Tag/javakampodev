package inheritance;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println("Eðitmen eklendi");
	}
	
	public void updated(Instructor insructor) {
		System.out.println("Eðitmen güncellendi");
	}
	
	public void deleted(Instructor insructor) {
		System.out.println("Eðitmen silindi");
	}
}
