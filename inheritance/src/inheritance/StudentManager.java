package inheritance;

public class StudentManager extends UserManager {
	
	public void add(Student student) {
		System.out.println("öğrenci eklendi");
	}
	
	public void updated(Student student) {
		System.out.println("öğrenci güncellendi");
	}
	
	public void deleted(Student student) {
		System.out.println("öğrenci silindi");
	}
}
