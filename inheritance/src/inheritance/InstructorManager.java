package inheritance;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println("E�itmen eklendi");
	}
	
	public void updated(Instructor insructor) {
		System.out.println("E�itmen g�ncellendi");
	}
	
	public void deleted(Instructor insructor) {
		System.out.println("E�itmen silindi");
	}
}
