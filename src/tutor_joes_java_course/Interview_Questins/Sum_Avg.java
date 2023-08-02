//Sum and Average of n numbers
package tutor_joes_java_course.Interview_Questins;

import java.util.Scanner;

public class Sum_Avg {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter limit");
		int limit=in.nextInt();
		int n=0;
		for(int i=1;i<=limit;i++) {
			System.out.println("Enter value : ");
			int number=in.nextInt();
			n+=number;
		}
		System.out.println("Total : "+n);
		System.out.println("Average : "+n/limit);
	}

}
