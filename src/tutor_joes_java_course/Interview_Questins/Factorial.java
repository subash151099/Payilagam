package tutor_joes_java_course.Interview_Questins;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter anyone number: ");
		int fact=in.nextInt();
		int val=1;
		for(int i=1;i<=fact;i++) {
			val*=i;
		}
		System.out.println("Factorial of "+fact+" is "+val);
	}

}
