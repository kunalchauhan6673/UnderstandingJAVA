import java.util.*;  // pretty much only headerfile you need and java.lang is required too sometimes

public class Main {
   
    public static void main(String[] args) {
        
        // Create a Scanner object for input
        Scanner obj = new Scanner(System.in);  // Scanner is a class and obj is its object, in java we allocate memory to the all variables we create so that they can store some value in them.

        // Prompt the user for student information
        System.out.print("Enter student name: ");
        String name = obj.nextLine();  // we use obj object of scanner class to store all the values

        System.out.print("Enter student age: ");
        int age = obj.nextInt();

        // Consume the newline character left in the input buffer
        obj.nextLine();

        System.out.print("Enter student roll number: ");
        String rollNo = obj.nextLine();

        // Close the Scanner
        obj.close();

        // Print the student information
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNo);
    }
}
