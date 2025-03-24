
package B;
import A.IList;
import java.util.Scanner;

public class MyList implements IList {
    private Editor[] list = new Editor[100];
    private int count = 0;
    
    public void add() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Editor e = new Editor();
            e.input(sc);
            list[count++] = e;
            System.out.println("Editor added.");
            
            System.out.print("Add another? (no to stop): ");
            if (sc.nextLine().equalsIgnoreCase("no")) break;
        }
    }
    
    public boolean search(String id) {
        for (int i = 0; i < count; i++) {
            if (list[i].getId().equalsIgnoreCase(id)) {
                System.out.println("Editor with ID " + id + " found.");
                return true;
            }
        }
        System.out.println("Editor not found.");
        return false;
    }
    
    public Editor remove(String id) {
        for (int i = 0; i < count; i++) {
            if (list[i].getId().equalsIgnoreCase(id)) {
                Editor removed = list[i];
                System.arraycopy(list, i + 1, list, i, count - i - 1);
                count--;
                System.out.println("Editor with ID " + id + " removed.");
                return removed;
            }
        }
        System.out.println("Editor not found.");
        return null;
    }
    
    public void printAll() {
        if (count == 0) {
            System.out.println("No editors available.");
        } else {
            System.out.println("Printing all editors:");
            for (int i = 0; i < count; i++) {
                list[i].output();
            }
        }
    }
}
