package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Nazile");
		student.setLastName("Tağ");
		student.setEmail("nazile@nazile.com");
		student.setSelectedCourses("Java");
		   
		
		String[] courses= {"C#","Java","Temel Programlama"};
		Instructor instructor= new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engin@engin.com");
		instructor.setCourses(courses);
		
		
		InstructorManager userManager= new InstructorManager();
		userManager.add(instructor);
		
		StudentManager studentManager= new StudentManager();
		studentManager.add(student);
		
		System.out.println(student.getSelectedCourses());
		

	}

}
