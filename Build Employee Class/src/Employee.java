public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    //ID
    public int getId() {
        return id;
    }

    //First Name
    public String getFirstName() {
        return firstName;
    }

    //LastName
    public String getLastName() {
        return lastName;
    }

    //Name
    public String getName() {
        return firstName + " " + lastName;
    }

    //Salary
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public double raiseSalary(int percent) {
        return (salary) + (salary * percent / 100);
    }

    public String toString() {
        return "Employee[id= " + this.id + ", name=  " + this.firstName + " " + this.lastName + ", salary= " + this.salary + "]";
    }
}