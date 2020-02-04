import java.util.ArrayList;

public class Students {
    private static int StudentNumber = 2009723;
    private String LastName;
    private String FirstName;
    private int grade;

//Constructor
    Students(String lastName, String firstName, int grade) {
        this.LastName = lastName;
        this.FirstName = firstName;
        this.grade = grade;
        //Adding StudentNumber by 1
        this.StudentNumber = (StudentNumber++);
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.StudentNumber = studentNumber;
    }

}
