//do while
package tutor_joes_java_course;

import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		System.out.println("Enter range: ");
		Scanner n=new Scanner(System.in);
		int range=n.nextInt();
		int i=1;
		do{
			System.out.println(i);
			i++;
		}while(i<=range);

	}

}
