//4) Linear Search
package Assignment_3;
import java.util.Scanner;
public class Linear_Search {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value : ");
		int n=in.nextInt();
		
		int a[]= {1,2,3,4,5,6,4,8,9,10};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				System.out.println("Array location : "+i);
			}
				
		}
		
	}

}
