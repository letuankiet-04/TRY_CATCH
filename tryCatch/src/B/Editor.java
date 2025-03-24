
package B;

import A.Window;
import java.util.Scanner;

public class Editor extends Window {
    private String id;
    private String title;

    public Editor() {
        super();
        this.id = "E000";
        this.title = "Untitled";
    }

    public Editor(int width, int length, String id, String title) {
        super(width, length);
        setId(id);
        setTitle(title);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (!id.matches("E\\d{3}")) {
            throw new IllegalArgumentException("ID must be in format Exxx, where x is a digit.");
        }
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty.");
        }
        this.title = title;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter ID (Exxx): ");
            setId(sc.next());
            sc.nextLine(); 
            System.out.print("Enter title: ");
            setTitle(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    public void output() {
        super.output();
        System.out.println("Editor [ID=" + id + ", Title=" + title + "]");
    }
}
