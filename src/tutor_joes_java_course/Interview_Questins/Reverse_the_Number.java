//Reverse the Number
package tutor_joes_java_course.Interview_Questins;

import java.util.Scanner;

public class Reverse_the_Number {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter digit : ");
		int n=in.nextInt();
		int reverse=0,rem;
		while(n!=0) {
			rem=n%10;
			reverse=(reverse*10)+rem;
			n=n/10;
		}
		System.out.println(reverse);
	}

}
