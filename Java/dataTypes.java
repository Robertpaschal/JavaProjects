import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        int age = 25;
        double height = 5.9;
        char grade = 'A';
        boolean isLearning = true;
        String name = "Java Learner";
        final double PI = 3.14159;
        int a = 10, b = 5;
        boolean condition1 = true, condition2 = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String InputName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int InputAge = scanner.nextInt();

        System.out.println("Hello, " + InputName + "! You're " + InputAge + " years old.");
        scanner.close();

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Learning: " + isLearning);
        System.out.println("Name: " + name);
        System.out.println("Value of PI: " + PI);
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println(condition1 && condition2);
        System.out.println(condition1 || condition2); 
        System.out.println(!condition1);
    }
}
