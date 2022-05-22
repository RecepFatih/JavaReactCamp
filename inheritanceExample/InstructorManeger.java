package homework3;

public class InstructorManeger extends BaseManager{
	
	
	public void courseAdd(String courseName,BaseUser instructor) {
		
		System.out.println(courseName + " has been successfully added to the system."
							+ "\nInstructor Name: " + instructor.getFirstName() + instructor.getLastName());
		
	}
	
	public void courseDelete(String courseName, Instructor instructor) {
		
		System.out.println(courseName + " has been successfully deleted from the system."
				+ "\nInstructor Name: " + instructor.getFirstName() + instructor.getLastName());
		
	}

}
