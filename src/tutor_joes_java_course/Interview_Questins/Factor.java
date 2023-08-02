//Factor
package tutor_joes_java_course.Interview_Questins;
import java.util.Scanner;
public class Factor {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter anyone number : ");
		int n=in.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println("Factor of "+n+" is "+i);
			}
		}

	}

}
