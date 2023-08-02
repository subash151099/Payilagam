//For loop
package tutor_joes_java_course;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		System.out.println("Enter range: ");
		Scanner n=new Scanner(System.in);
		int range=n.nextInt();
		for(int i=1;i<=range;i++) {
			System.out.println(i);
		}

	}

}
