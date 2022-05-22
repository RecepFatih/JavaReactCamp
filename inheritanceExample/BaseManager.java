package homework3;

public class BaseManager {
	
	public void courseAdd(String courseName, BaseUser baseUser) {
		System.out.println(courseName + " was successfully added to " + 
							baseUser.getFirstName() + " " + baseUser.getLastName());
	}
	
	public void courseDelete(String courseName, BaseUser baseUser) {
		System.out.println(courseName + " was successfully deleted from " + 
				baseUser.getFirstName() + " " + baseUser.getLastName());
	}
	
	public void view(String courseName) {
		System.out.println("The selected course was displayed. " + courseName);
	}
	
}
