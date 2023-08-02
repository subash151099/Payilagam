//5) Finding index of given number  (find value using index)
package Assignment_3;

import java.util.Scanner;

public class Finding_index_of_given_number {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter index : ");
		int n=in.nextInt();
		
		int a[]= {1,2,3,4,5,6,4,8,9,10};
		
		for(int i=0;i<a.length;i++) {
			if(i==n) {
				System.out.println("Value of "+i+" : "+a[i]);
			}
				
		}
		
	}

	
	
}

