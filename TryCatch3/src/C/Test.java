
package C;

import B.MyList;
import B.Editor;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyList myList = new MyList();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("A. Add");
            System.out.println("B. Search Editor by ID");
            System.out.println("C. Remove an Editor and display removed Editor");
            System.out.println("D. Print All");
            System.out.println("E. Exit");
            System.out.print("Choose an option: ");
            String choice = sc.nextLine().toUpperCase();
            
            try {
                switch (choice) {
                    case "A":
                        myList.add();
                        myList.printAll();
                        break;
                    case "B":
                        System.out.print("Enter ID to search: ");
                        String searchId = sc.nextLine();
                        myList.search(searchId);
                        break;
                    case "C":
                        System.out.print("Enter ID to remove: ");
                        String removeId = sc.nextLine();
                        Editor removed = myList.remove(removeId);
                        if (removed != null) {
                            System.out.println("Removed Editor:");
                            removed.output();
                        }
                        myList.printAll();
                        break;
                    case "D":
                        System.out.println("All Editors:");
                        myList.printAll();
                        break;
                    case "E":
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }
    }
}
