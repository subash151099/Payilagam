//37 Spy number
package Assignment_2;
import java.util.Scanner;
public class Spy_number {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter input : ");
		int n=in.nextInt();
        int tot=0,rem,mul=1,add=0,temp=n;

        while(n!=0){
            rem=n%10;
            n=n/10;
            mul*=rem;
            add+=rem;
        }
        if(mul==add) {
        	System.out.println(temp+" is Spy Number");
        }else {
        	System.out.println(temp+" is Not Spy Number");
        }
		
	}

}
