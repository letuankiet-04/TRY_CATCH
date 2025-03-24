package B;

import java.util.Scanner;

public class Editor {
    private String id;
    private String title;
    private int width;
    private int length;
    private String version;

    public Editor() {
        this.id = "EDT0";
        this.title = "Untitled";
        this.width = 10;
        this.length = 10;
        this.version = "1.0.0";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        try {
            if (id.startsWith("EDT") && id.length() == 4 && Character.isDigit(id.charAt(3))) {
                this.id = id;
            } else {
                System.out.println("Invalid ");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        try {
            if (!title.trim().isEmpty()) {
                this.title = title;
            } else {
                System.out.println("empty.");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width >= 10 && width <= 100) {
            this.width = width;
        } else {
            System.out.println("Width between 10 and 100.");
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length >= 10 && length <= 100) {
            this.length = length;
        } else {
            System.out.println("Length between 10 and 100.");
        }
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        try {
            String[] parts = version.split("\\.");
            if (parts.length == 3 && parts[0].length() == 1 && parts[1].length() == 1 && parts[2].length() == 1) {
                Integer.parseInt(parts[0]);
                Integer.parseInt(parts[1]);
                Integer.parseInt(parts[2]);
                this.version = version;
            } else {
                System.out.println("Invalid");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        setId(sc.nextLine());
        System.out.print("Enter Title: ");
        setTitle(sc.nextLine());
        System.out.print("Enter Width: ");
        setWidth(sc.nextInt());
        System.out.print("Enter Length: ");
        setLength(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Version: ");
        setVersion(sc.nextLine());
    }

    public void output() {
        System.out.println("Editor [ID=" + id + ", Title=" + title + ", Width=" + width + ", Length=" + length + ", Version=" + version + "]");
    }
}
