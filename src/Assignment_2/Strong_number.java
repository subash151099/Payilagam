//35 Strong number
package Assignment_2;

import java.util.Scanner;

public class Strong_number {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter digit : ");
		int n=in.nextInt();
		int temp=n,rem,reverse=0,f,res=0;
		while(n>0) {
			rem=n%10;
			f=1;
			for(int i=1;i<=rem;i++) {
				f*=i;
			}
			res+=f;
			n=n/10;
			
		}
		if(res==temp) {
			System.out.println(temp+" is Strong number");
		}
		else {
			System.out.println(temp+" is Not Strong number");
		}
	
	}
}
