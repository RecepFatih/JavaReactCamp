package homework3;

public class UserUI {
	
	private BaseManager baseManager;
	
	public UserUI(BaseManager baseManager) {
		this.baseManager = baseManager;
		
	}
	
	public void add(String courseName,  BaseUser baseUser) {
		
		this.baseManager.courseAdd(courseName, baseUser);
		
	}
	
	public void delete(String courseName,  BaseUser baseUser) {
		
		baseManager.courseDelete(courseName, baseUser);
		
	}
	
	public void view(String courseName,BaseUser baseUser) {
		
		baseManager.view(courseName);
		
	}

}
