import java.util.Scanner;
// Create a class named Student with the following properties:
// s_Name (String), s_Roll (int), sub1(double), sub2(double), sub3(double), sub4(double), avg(double)
// Take a student's data from command line except avg. Compute the average marks percentage for the student and show all data of the student including average percentage.

class Student {
    String s_Name;
    int s_Roll;
    Double sub1;
    Double sub2;
    Double sub3;
    Double sub4;
    Double avg;

    public void showData() {
        avg = (sub1 + sub2 + sub3 + sub4) / 4;
        System.out.println("Student's name: " + s_Name);
        System.out.println("Student's roll: " + s_Roll);
        System.out.println("Student's marks of subject 1: " + sub1);
        System.out.println("Student's marks of subject 2: " + sub2);
        System.out.println("Student's marks of subject 3: " + sub3);
        System.out.println("Student's marks of subject 4: " + sub4);
        System.out.println("Student's average marks: " + avg);
    }
}

public class Main {
    public static void main(String a[]) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student's name: ");
        s1.s_Name = sc.nextLine();
        System.out.println("Enter the Student's Roll: ");
        s1.s_Roll = sc.nextInt();
        System.out.println("Enter the Student's subject 1 marks: ");
        s1.sub1 = sc.nextDouble();
        System.out.println("Enter the Student's subject 2 marks: ");
        s1.sub2 = sc.nextDouble();
        System.out.println("Enter the Student's subject 3 marks: ");
        s1.sub3 = sc.nextDouble();
        System.out.println("Enter the Student's subject 4 marks: ");
        s1.sub4 = sc.nextDouble();
        s1.showData();
    }
}