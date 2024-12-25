class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayDetails() {
        System.out.println("I am " + name + ", and I am " + age + " years old.");
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("My grade is " + grade);
    }

}

public class value {
    public static void main(String[] args) {
        Student odinaka = new Student("Odinaka Nnamani", 24, "A");
        odinaka.displayDetails();   
    }
}