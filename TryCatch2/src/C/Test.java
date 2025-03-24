package C;

import B.Editor;
import B.MyList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyList list = new MyList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add an Editor");
            System.out.println("2. Search Editor by Id");
            System.out.println("3. Update Editor by Id");
            System.out.println("4. Print All");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                continue;
            }

            switch (choice) {
                case 1:
                    Editor e = new Editor();
                    e.input();
                    list.add(e);
                    e.output();
                    break;
                case 2:
                    System.out.print("Enter ID to search: ");
                    String id = sc.nextLine();
                    Editor found = list.search(id);
                    if (found != null) {
                        found.output();
                    } else {
                        System.out.println("Editor not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    id = sc.nextLine();
                    Editor updatedEditor = new Editor();
                    updatedEditor.input();
                    updatedEditor.setId(id);
                    if (list.update(updatedEditor)) {
                        updatedEditor.output();
                    } else {
                        System.out.println("Update failed");
                    }
                    break;
                case 4:
                    list.printAll();
                    break;
                case 5:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid ");
            }
        } while (choice != 5);
    }
}
