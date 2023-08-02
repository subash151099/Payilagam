//Odd or Even
package tutor_joes_java_course.Array;
import java.util.Scanner;
public class Odd_or_Even {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter limit : ");
		int limit=in.nextInt();
		int []a=new int[limit];
		for(int i=0;i<=limit-1;i++) {
			System.out.println("Enter val : ");
			int val=in.nextInt();
			a[i]=val;
		}
		for(int i=0;i<=limit-1;i++) {
			if(a[i]%2==0) {
				System.out.println("Even Number : "+a[i]);
			}
			else {
				System.out.println("Odd Number : "+a[i]);
			}
			
		}
				

	}

}
