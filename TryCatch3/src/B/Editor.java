
package B;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Editor {
    private String id;
    private String importedDate;

    public Editor() {}

    public Editor(String id, String importedDate) {
        this.id = id;
        this.importedDate = importedDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImportedDate() {
        return importedDate;
    }

    public void setImportedDate(String importedDate) {
        this.importedDate = importedDate;
    }

    public void input(Scanner sc) {
        while (true) {
            System.out.print("Enter ID ");
            id = sc.nextLine();
            if (Pattern.matches("[EB]\\d", id)) break;
            System.out.println("Invalid");
        }

        while (true) {
            System.out.print("Enter Imported Date (dd/mm/yyyy): ");
            importedDate = sc.nextLine();
            if (Pattern.matches("\\d{2}/\\d{2}/\\d{4}", importedDate)) break;
            System.out.println("Invalid ");
        }
    }

    public void output() {
        System.out.println("ID: " + id + ", Imported Date: " + importedDate);
    }
}

