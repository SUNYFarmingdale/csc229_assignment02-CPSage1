package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
// ToDo 1: Make this class a child of Person
public class Student extends Person {

    // Field for GPA
    // ToDo 3: Add a field for GPA and create setter and getter
    private double gpa;

    // ToDo 2: Fix the resulting errors

    // The Constructor
    // ToDo 6: Fix the constructor of Student class
    public Student(String name, short age) {
        super(name, age);
    }

    // Implementing the getAddress from the Person class
    @Override
    public String getAddress() {
        return "";
    }

    // Implementing the setAddress from the Person class
    @Override
    public void setAddress(String address) {
    }
    // ToDo 3: Add a field for GPA and create setter and getter
    // Getter for GPA
    public double getGpa() {
        return gpa;
    }

    // Setter for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    // ToDo 7: Add a toString method for Student class
    // ToString method to show the students information
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", GPA=" + gpa +
                '}';
    }
}// ToDo 4: Add comments to your code