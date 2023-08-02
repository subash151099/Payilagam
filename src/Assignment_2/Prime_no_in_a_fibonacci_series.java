//38 Prime no.s in a fibonacci series
package Assignment_2;
import java.util.Scanner;
public class Prime_no_in_a_fibonacci_series {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter input : ");
		int n=in.nextInt();
		int a=-1,b=1,c;
		for(int i=1;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			
			int count=0;
			for(int j=1;j<=c;j++) {
				if(c%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(c+" is a Prime number");
			}
			else {
				System.out.println(c+" is Not  Prime number");
			}
		}
		

	}

}
