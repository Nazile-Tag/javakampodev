package inheritance;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullanýcý eklendi");
	}
	
	public void updated(User user) {
		System.out.println("Kullanýcý güncellendi");
	}
	
	public void deleted(User user) {
		System.out.println("Kullanýcý silindi");
	}
}
