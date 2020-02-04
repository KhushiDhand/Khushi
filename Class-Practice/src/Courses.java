public class Courses {
    private String subjectName;
    private int studentGrade;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }


    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    Courses(String subjectName, int studentGrade) {
        this.subjectName = subjectName;
        this.studentGrade = studentGrade;
    }

    public void DisplayCourses() {
        System.out.println(this.subjectName);
    }

}