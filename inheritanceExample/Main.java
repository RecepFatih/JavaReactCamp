package homework3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Recep Fatih");
		student.setLastName("Cantekin");
		student.setEmail("kodlama.id@gmail.com");
		student.setStudentNumber(508);
		student.setPassaport("abc123");
		
		Instructor recep = new Instructor();
		recep.setFirstName("Recep Fatih");
		recep.setLastName("Cantekin");
		
		//UserUI userUI = new UserUI(new StudentManager());
		//userUI.add("JAVA&REACT", student);
		
		UserUI userUI2 = new UserUI(new StudentManager());
		userUI2.add("JAVA&REACT", recep);
		
		
	}

}
