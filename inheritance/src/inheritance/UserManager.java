package inheritance;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullanıcı eklendi");
	}
	
	public void updated(User user) {
		System.out.println("Kullanıcı güncellendi");
	}
	
	public void deleted(User user) {
		System.out.println("Kullanıcı silindi");
	}
}
