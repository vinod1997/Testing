package Main;

/* Develop a basic command-line to-do list application in Java. 
 * The application should allow users to add, view, update, and remove tasks from their to-do list. 
 * Your goal is to write both the application code and test cases to ensure the application functions correctly.*/
public class Task {
	
	private String title;
	private String description;
	
	public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
        return "Title: " + title + "\nDescription: " + description;
    }

	public String setDescription(String description) {
		// TODO Auto-generated method stub
		return this.description = description;
	}

	public String setTitle(String title) {
		// TODO Auto-generated method stub
		return this.title = title;
	}
}
