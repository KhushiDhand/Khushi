import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
//Students

        ArrayList<Student> list = new ArrayList<Student>();
        String userChoice1 = "Y";
        while (userChoice1.endsWith(("Y"))) {

            System.out.println("Enter a student name");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            Student temp = new Student(name);

            //Creation of the courses
            Courses c1 = new Courses("English", 89);
            Courses c2 = new Courses("Maths", 90);

            //An example of displaying the course object
            System.out.println("An example of a course object being printed:");
            c1.DisplayCourses();

            //Adding courses to the Temp student object
            temp.AddCourse(c1);
            temp.AddCourse(c2);
            list.add(temp);

            temp.DisplayStudentInfo();

            //Method to add the students
            System.out.println("Input Y or N to add another student");
            userChoice1 = scan.nextLine();
            for (int k = 0; k <= 2; k++) {
                if (userChoice1.endsWith("Y")) {
                    continue;
                } else {
                    break;
                }
            }
        }

    }
}
