
package A;

import java.util.Scanner;

public class Window {
    private int width;
    private int length;

    public Window() {
        this.width = 10;
        this.length = 10;
    }

    public Window(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        try {
            if (width < 10 || width > 100) {
                System.out.println("Width between 10 and 100.");
                return;
            }
            this.width = width;
        } catch (Exception e) {
            System.out.println("Invalid input ");
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        try {
            if (length < 10 || length > 100) {
                System.out.println("Length  between 10 and 100.");
                return;
            }
            this.length = length;
        } catch (Exception e) {
            System.out.println("Invalid ");
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter width: ");
            setWidth(sc.nextInt());
            System.out.print("Enter length: ");
            setLength(sc.nextInt());
        } catch (Exception e) {
            System.out.println("Please enter integer.");
            sc.nextLine();
        }
    }

    public void output() {
        System.out.println(width +","+ length);
    }
}
