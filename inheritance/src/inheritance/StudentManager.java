package inheritance;

public class StudentManager extends UserManager {
	
	public void add(Student student) {
		System.out.println("��renci eklendi");
	}
	
	public void updated(Student student) {
		System.out.println("��renci g�ncellendi");
	}
	
	public void deleted(Student student) {
		System.out.println("��renci silindi");
	}
}
