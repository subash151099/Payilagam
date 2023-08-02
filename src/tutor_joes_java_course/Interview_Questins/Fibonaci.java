//Fibonaci series
package tutor_joes_java_course.Interview_Questins;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter limit : ");
		int n=in.nextInt();
		int a=-1,b=1,c;
		for(int i=1;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		

	}

}
