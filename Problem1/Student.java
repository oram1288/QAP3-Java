package QAP3_Java.Problem1;

public class Student extends Person {
    protected String myIdNum; // Student Id Number
    protected double myGPA;   // grade point average

    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        // use the super class’ constructor (Person)
        super(name, age, gender); 
        // initialize what’s new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getter methods
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    // Setter methods
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // toString method
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
