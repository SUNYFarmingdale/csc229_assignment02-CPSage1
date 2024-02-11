package com.mycompany.csc229_211review_lab02hw;
import java.util.Scanner;
/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {

	public static void main(String[] args) {
		// ToDo 5: Fix the error
		// Fixed the Student class with proper arguments

		// ToDo 6: Fix the constructor of Student class
		//Check out the Student Class
		Student std1 = new Student("Bob Parr", (short) 20);

		// ToDo 8: Set the GPA of the student using the scanner and user
		// input and then print the output.
		Scanner scanner = new Scanner(System.in);

		// This section tells the user to input the student's GPA

		System.out.print("Enter student's GPA: ");
		// sets the GPA for the student object, and then prints it out
		double gpa = scanner.nextDouble();
		// the students information(name, age, and GPA).
		std1.setGpa(gpa);

		// ToDo 9: Add comments and explain your code



		System.out.println(std1);

		// ToDo 10: Submit using a pull request.
	}
}