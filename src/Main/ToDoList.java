package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
	private static List <Task> tasks;

     public ToDoList() {
	    tasks = new ArrayList<>();
     }
     
     public void addTask(String title, String description) {
    	 Task task = new Task (title, description);
    	 tasks.add(task);
    	 System.out.println("Task added :" + task.getTitle());
     }
     
     public void viewTask() {
    	    for (Task task : tasks) {
    	        System.out.println("Title: " + task.getTitle());
    	        System.out.println("Description: " + task.getDescription());
    	    }
    	}
     
     public void updateTask(int index,String newTitle, String newDescription) {
    	  if(index >= 0 && index <= tasks.size()) {
    		  Task task = tasks.get(index);
    		  task.setTitle(newTitle);
    		  task.setDescription(newDescription);
    		  System.out.println("Task updated ");
    		  System.out.println(newTitle +": "+ newDescription);
    	  }else {
    		  System.out.println("Invalid index");
    }
     }
     
     public void removeTask(int index) {
    	    if (index >= 0 && index < tasks.size()) {
    	        Task removedTask = tasks.remove(index);
    	        System.out.println("Task removed: " + removedTask.getTitle());
    	    } else {
    	        System.out.println("Invalid index");
    	    }
    	}

     
     public static void main(String[] args) {
		ToDoList todo= new ToDoList();
		Scanner sc = new Scanner(System.in);
		
		 while (true) {
	            System.out.println("1. Add Task");
	            System.out.println("2. Update Task");
	            System.out.println("3. Remove Task");
	            System.out.println("4. View Tasks");
	            System.out.println("5. Exit");
	            System.out.print("Select an option: ");
	            
	            int choice = sc.nextInt();
	            sc.nextLine(); // Consume the newline
	            
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter title: ");
	                    String title = sc.nextLine();
	                    System.out.print("Enter description: ");
	                    String description = sc.nextLine();
	                    todo.addTask(title, description);
	                    break;
	                    
	                case 2:
	                    System.out.print("Enter index of task to update: ");
	                    int updateIndex = sc.nextInt();
	                    sc.nextLine(); // Consume the newline
	                    System.out.print("Enter new title: ");
	                    String newTitle = sc.nextLine();
	                    System.out.print("Enter new description: ");
	                    String newDescription = sc.nextLine();
	                    todo.updateTask(updateIndex, newTitle, newDescription);
	                    break;
	                    
	                case 3:
	                	System.out.println("Enter the index of the task to remove");
	                	int index_remove  = sc.nextInt();
	                	 todo.removeTask(index_remove);
	                    break;
	                    
	                case 4:
	                    todo.viewTask();
	                    break;
	                    
	                case 5:
	                    System.out.println("Exiting the application.");
	                    sc.close();
	                    System.exit(0);
	                    
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	            }
	        }
	}     
}
