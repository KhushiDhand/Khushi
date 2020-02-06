import java.util.ArrayList;

public class School {
    //Contains Array Lists
    private ArrayList<Teachers> teachers;
    private ArrayList<Students> students;
    private String schoolName;

    //Constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.teachers  = new ArrayList<Teachers>();
        this.students = new ArrayList<Students>();
    }
    public void AddStudent(Students obj){
        this.students.add(obj);
    }
    public void AddTeacher(Teachers obj){
        this.teachers.add(obj);
    }

    public ArrayList<Teachers> getTeachers() {
        return teachers;
    }
    public void RemoveTeacher(int index){
        this.teachers.remove(index);
    }
    public void RemoveStudent(int index){
        this.students.remove(index);
    }

    public void setTeachers(ArrayList<Teachers> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }

    //Displaying information about students and teachers
    public void DisplaySchoolInfo() {
        System.out.println("School Name: " + schoolName);

        for(int i = 0; i< teachers.size(); i++){
            System.out.print("Name: " + this.teachers.get(i).getFirstname());
            System.out.println(" " + this.teachers.get(i).getLastName());
            System.out.println("Subject: " + this.teachers.get(i).getCourse());
            System.out.println("------------------------------------------------------");
        }

        for(int i = 0; i< students.size(); i++){
            System.out.print("Name: " + this.students.get(i).getFirstName());
            System.out.println(" " + this.students.get(i).getLastName());
            System.out.println("Grade: " + this.students.get(i).getGrade());
            System.out.println("------------------------------------------------------");
        }
        System.out.println("=======================================================");
    }
}
