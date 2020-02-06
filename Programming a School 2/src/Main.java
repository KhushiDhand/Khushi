import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Students List
        ArrayList<School> list = new ArrayList<School>();
        //Teachers List
        ArrayList<School> series = new ArrayList<School>();

        //Adding 10 students
        Students s1 = new Students("Chu", "Emily", 11);
        Students s2 = new Students("Dhand", "Khushi", 11);
        Students s3 = new Students("Chung", "Olivia", 11);
        Students s4 = new Students("Dang", "Anne", 11);
        Students s5 = new Students("Nguyen", "Tyanna", 11);
        Students s6 = new Students("Huang", "Carmen", 11);
        Students s7 = new Students("Qiu", "Elsa", 11);
        Students s8 = new Students("Craddock", "Jason", 11);
        Students s9 = new Students("Leung", "Tiffany", 11);
        Students s10 = new Students("Bautista", "Christine", 11);

        //Adding 3 teachers
        Teachers t1 = new Teachers("Paul", "Zaremba", "Programming");
        Teachers t2 = new Teachers("Sylvia", "Lau", "E-Commerce");
        Teachers t3 = new Teachers("Randy", "Jung", "Physics");

        //Creating a school
        School sc = new School("Windermere Secondary School");
        School sc1 = new School("Windermere Secondary School");
        //Adding students to the method
        sc.AddStudent(s1);
        sc.AddStudent(s2);
        sc.AddStudent(s3);
        sc.AddStudent(s4);
        sc.AddStudent(s5);
        sc.AddStudent(s6);
        sc.AddStudent(s7);
        sc.AddStudent(s8);
        sc.AddStudent(s9);
        sc.AddStudent(s10);
        //Adding teachers to the method
        sc1.AddTeacher(t1);
        sc1.AddTeacher(t2);
        sc1.AddTeacher(t3);

        //Abstracting students from the method sc to students array
        list.add(sc);
        //Abstracting teachers from the method sc1 to teachers array
        series.add(sc1);

        //Displaying all of the Info
        sc.DisplaySchoolInfo();
        sc1.DisplaySchoolInfo();

        System.out.println("Input 'Y' or 'N' for removing 1 teacher");
        Scanner scan = new Scanner(System.in);
        String userChoice = scan.nextLine();
        if (userChoice.equals("Y")) {
            //Removing Teachers
            sc1.RemoveTeacher(1);
        }
        System.out.println("Input 'Y' or 'N' for removing 2 students");
        String userChoice1 = scan.nextLine();
        if (userChoice1.equals("Y")) {
            //Removing Students
            sc.RemoveStudent(1);
            sc.RemoveStudent(5);
        }

        //Displaying both of the lists after removals
        System.out.println("Input 'Y' or 'N' for displaying all lists");
        String userChoice2 = scan.nextLine();
        if (userChoice2.equals("Y")) {
            sc.DisplaySchoolInfo();
            sc1.DisplaySchoolInfo();

        }
    }
}





