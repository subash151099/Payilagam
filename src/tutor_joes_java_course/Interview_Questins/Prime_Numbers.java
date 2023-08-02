//Prime Numbers
package tutor_joes_java_course.Interview_Questins;
import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) {
		int count=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter anyone number : ");
		int n=in.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count+=1;
			}
		}
		if(count==2) {
			System.out.println(n+" is Prime number");
		}
		else {
			System.out.println(n+" is Not Prime number");
		}

	}

}
