package C;

import A.IList;
import B.Editor;
import B.MyList;
import java.util.Scanner;

// Class Test containing the main menu-driven program
public class Test {
    public static void main(String[] args) {
        MyList list = new MyList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add an Editor");
            System.out.println("2. Search Editor by Id");
            System.out.println("3. Update Editor by Id");
            System.out.println("4. Print All");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    Editor e = new Editor();
                    e.output();
                    list.add(e);
                    break;
                case 2:
                    System.out.print("Enter ID to search: ");
                    String id = sc.nextLine();
                    int index = list.search(id);
                    if (index != -1) {
                        System.out.println("Editor found:");
                        list.printAll();
                    } else {
                        System.out.println("Editor not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    id = sc.nextLine();
                    Editor updatedEditor = new Editor();
                    updatedEditor.setId(id);
                    if (list.update(updatedEditor)) {
                        System.out.println("Editor updated successfully.");
                    } else {
                        System.out.println("Editor not found.");
                    }
                    break;
                case 4:
                    list.printAll();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }
}
