//Neon Number
//i/p: 9 ->9*9=81 ->8+1=9 o/p:9  i/p==o/p ->neon number
package Assignment_2;
import java.util.Scanner;
public class Neon_Number {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter anyone number : ");
		int n=in.nextInt();
		int temp=n*n;
		int rem;
        int tot=0;

        while(temp!=0){
            rem=temp%10;
            temp=temp/10;
            tot+=rem;
            
        }
        if(n==tot) {
        	System.out.println(n+" is Neon Number");
        }else {
        	System.out.println(n+" is Not Neon Number");
        }
	}

}
