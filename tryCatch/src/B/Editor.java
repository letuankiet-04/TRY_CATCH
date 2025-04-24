
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
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        try {
            if (!id.matches("E\\d{3}")) {
                System.out.println("ID: ");
                return;
            }
            this.id = id;
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        try {
            if (title == null || title.trim().isEmpty()) {
                System.out.println("Title cannot be empty.");
                return;
            }
            this.title = title;
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        setId(sc.next());
        sc.nextLine(); 
        System.out.print("Enter title: ");
        setTitle(sc.nextLine());
    }

    @Override
    public void output() {
        super.output();
        System.out.println("ID = " + id + ", Title = " + title );
    }
}
