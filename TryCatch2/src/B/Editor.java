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

    public Editor(String id, String title, int width, int length, String version) {
        setId(id);
        setTitle(title);
        setWidth(width);
        setLength(length);
        setVersion(version);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        try {
            if (id.startsWith("EDT") && id.length() == 4 && Character.isDigit(id.charAt(3))) {
                this.id = id;
            } else {
                System.out.println("Invalid ID format. Must be EDTx where x is a digit.");
            }
        } catch (Exception e) {
            System.out.println("Error setting ID.");
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
                System.out.println("Title cannot be empty.");
            }
        } catch (Exception e) {
            System.out.println("Error setting title.");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width >= 10 && width <= 100) {
            this.width = width;
        } else {
            System.out.println("Width must be between 10 and 100.");
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length >= 10 && length <= 100) {
            this.length = length;
        } else {
            System.out.println("Length must be between 10 and 100.");
        }
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        String[] parts = version.split("\\.");
        if (parts.length == 3 && parts[0].matches("\\d") && parts[1].matches("\\d") && parts[2].matches("\\d")) {
            this.version = version;
        } else {
            System.out.println("Invalid version format. Must be x.x.x with digits.");
        }
    }

    public void output() {
        System.out.println("Editor [ID=" + id + ", Title=" + title + ", Width=" + width + ", Length=" + length + ", Version=" + version + "]");
    }
}
