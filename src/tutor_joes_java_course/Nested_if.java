//Nested if statement
package tutor_joes_java_course;
import java.util.Scanner;
public class Nested_if {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Your Gender ex: M/F : ");
		char gender=in.next().charAt(0);
		
		System.out.println("Enter Your Age : ");
		int age=in.nextInt();
		
		System.out.println("Enter Your Marital Status M/U : ");
		char marital=in.next().charAt(0);
		
		if(marital=='M' || marital=='m') {
			System.out.println("You are eligible for Insurence");
		}
		else if (marital=='U' || marital=='u') {
			if(age>=30 && (gender=='M' || gender=='m')) {
				System.out.println("You are eligible for Insurence");
			}
			else if(age>=25 && (gender=='F' || gender=='f')) {
				System.out.println("You are eligible for Insurence");
			}
			else {
				System.out.println("You are not eligible for insurence");
			}
		}
		else {
			System.out.println("Enter correct Details");
		}

	}

}
