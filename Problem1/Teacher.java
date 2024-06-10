package QAP3_Java.Problem1;

public class Teacher extends Person {
    private String subject;   // Subject taught by the teacher
    private double salary;    // Teacher's salary

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        // use the super class’ constructor (Person)
        super(name, age, gender); 
        this.subject = subject;
        this.salary = salary;
    }

    // Getter methods
    public double getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }

    // Setter methods
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // toString method
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: " + salary;
    }
}
