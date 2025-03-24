package C;

import A.Window;
import B.Editor;
import B.MyList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyList list = new MyList(); 
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a Window");  
            System.out.println("2. Add an Editor"); 
            System.out.println("3. Search by Id");  
            System.out.println("4. Print All");     
            System.out.println("5. Exit");         
            System.out.print("Enter your choice: ");
            choice = sc.nextInt(); 
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    
                    Window w = new Window();
                    w.input(); 
                    list.add(w); 
                    w.output();  
                    break;
                case 2:
                   
                    Editor e = new Editor();
                    e.input();  
                    list.add(e); 
                    e.output(); 
                    break;
                case 3:
                   
                    System.out.print("Enter ID to search: ");
                    String id = sc.nextLine(); 
                    Window found = list.search(id); 
                    if (found != null) {
                        System.out.println("Search Result:");
                        found.output();  
                    } else {
                        System.out.println("ID '" + id + "' not found."); 
                    }
                    break;
                case 4:
                   
                    list.printAll();
                    break;
                case 5:
                    
                    System.out.println("Exiting");
                    break;
                default:
                  
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}
