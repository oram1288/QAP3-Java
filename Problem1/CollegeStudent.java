package QAP3_Java.Problem1;

public class CollegeStudent extends Student{
    private String major;  // Major of the student
    private int year;    // Current level in college

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        // use the super class’ constructor (Student)
        super(name, age, gender, idNum, gpa);  
        this.year = year;
        this.major = major;
    }

    // Getter methods
    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    // Setter methods
    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // toString method
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
