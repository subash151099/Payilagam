//Get input from user
package tutor_joes_java_course;
import java.util.Scanner;

public class Get_input {

	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a =var.nextInt();
		int b =var.nextInt();
		int c=(a*a)*(b*b)*(2*a*b);
		System.out.println(c);

	}

}
