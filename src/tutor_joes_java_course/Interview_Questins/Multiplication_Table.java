//Multiplication Table
package tutor_joes_java_course.Interview_Questins;
import java.util.Scanner;
public class Multiplication_Table {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter table number : ");
		int number=in.nextInt();
		System.out.println("Enter table limit : ");
		int limit=in.nextInt();
		
		for(int i=1;i<=limit;i++) {
			System.out.println(i+" X "+number+" = "+i*number);
		}

	}

}
