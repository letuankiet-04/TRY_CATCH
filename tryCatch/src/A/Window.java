package A;

import java.util.Scanner;

public class Window {
    private int width;
    private int length;

    public Window() {
        this.width = 10;
        this.length = 10;
    }

    public Window(int width, int length) throws IllegalArgumentException {
        setWidth(width);
        setLength(length);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 10 || width > 100) {
            throw new IllegalArgumentException("Width must be between 10 and 100.");
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 10 || length > 100) {
            throw new IllegalArgumentException("Length must be between 10 and 100.");
        }
        this.length = length;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter width: ");
            setWidth(sc.nextInt());
            System.out.print("Enter length: ");
            setLength(sc.nextInt());
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    public void output() {
        System.out.println("Window [Width=" + width + ", Length=" + length + "]");
    }
}
