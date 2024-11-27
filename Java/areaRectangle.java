import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the rectangle area calcualtion program");

        System.out.print("Enter the rectangle's height: ");
        int Height = scanner.nextInt();

        System.out.print("Enter the rectangle's width: ");
        int width = scanner.nextInt();

        System.out.println("The area of this rectangle is: " + (Height * width));
        scanner.close();
    }
    
}
