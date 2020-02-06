import java.util.ArrayList;

public class Teachers {
    private String Firstname;
    private String LastName;
    private String course;


    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

//Constructor
    public Teachers(String firstname, String lastName, String course) {
        Firstname = firstname;
        LastName = lastName;
        this.course = course;

    }





}