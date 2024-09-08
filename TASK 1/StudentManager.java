import java.util.ArrayList;
import java.util.Scanner;

class Student {

    // Field Declaration

    String name;
    int age;

    // Constructor

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class StudentManager {

    // Main method

    public static void main(String[] args) {

        // Creating a list of students

        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding students

        students.add(new Student("HARISH PALASPAGAR", 20));
        students.add(new Student("JAYWANT MHALA", 22));
        students.add(new Student("RAHUL KUMAR", 21));

        // Printing students

        System.out.println("STUDENT LIST :");
        for (Student student : students) {
            System.out.println("NAME : " + student.name + ", AGE : " + student.age);
        }

        // Removing a student by name

        System.out.print("ENTER THE NAME OF THE STUDENT TO BE REMOVED : ");
        String removeName = scanner.nextLine();
        students.removeIf(student -> student.name.equalsIgnoreCase(removeName));

        // Printing updated students

        System.out.println("UPDATED STUDENT LIST :");
        for (Student student : students) {
            System.out.println("NAME : " + student.name + ", AGE: " + student.age);
        }

        scanner.close();
    }
}
