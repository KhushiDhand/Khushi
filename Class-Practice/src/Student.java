import java.util.ArrayList;


public class Student {
    static int StudentNumber = 2009723;
    public String FirstName;
    public String LastName;
    private int StudentID;
    private ArrayList<Courses> courses;


    Student(String firstName) {
        this.FirstName = firstName;
        this.StudentID = (StudentNumber++);
        this.courses = new ArrayList<Courses>();
    }

    public static int getStudentNumber() {
        return StudentNumber;
    }

    public String getFirstName() {
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }

    public void setLastName(String lastName){
        LastName = lastName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    //Method to add the course
    public void AddCourse(Courses course){
        this.courses.add(course);
    }

    //Method to find out the average
    public double AverageMarks(){
        double sum = 0;
        for(int i = 0; i< this.courses.size(); i++){
            sum+= this.courses.get(i).getStudentGrade();
        }
        return (sum/this.courses.size());
    }

    //Displaying all the courses and average marks
    public void DisplayStudentInfo(){
        System.out.println("===============================================");
        System.out.println("Name: " + this.getFirstName());
        System.out.println("Student Number: " + this.getStudentNumber());

        System.out.println("Courses of the student are:");
        for(int i = 0 ; i< courses.size(); i++){

            //Printing out the student courses
            System.out.println("Course Name: --> " + this.courses.get(i).getSubjectName());
            System.out.println("Course Grade: --> " + this.courses.get(i).getStudentGrade()+"%");

        }
        //Displaying the average
        System.out.println("Average: --> " + AverageMarks()+ "%");
        System.out.println("===============================================");
        System.out.println("                         ");
    }

}








