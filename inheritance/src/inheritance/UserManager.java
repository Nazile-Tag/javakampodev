package inheritance;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullan�c� eklendi");
	}
	
	public void updated(User user) {
		System.out.println("Kullan�c� g�ncellendi");
	}
	
	public void deleted(User user) {
		System.out.println("Kullan�c� silindi");
	}
}
