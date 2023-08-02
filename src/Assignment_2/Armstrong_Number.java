//32 Arm
package Assignment_2;
import java.util.Scanner;
public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter three digit : ");
		int number=in.nextInt();
		int temp=number;
		int digit1, digit2, digit3;
		
		digit3=temp%10;
		temp=temp/10;
		
		digit2=temp%10;
		temp=temp/10;
		
		digit1=temp%10;
		temp=temp/10;
		
		int val=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
		
		if(val==number) {
			System.out.println("This number is Armstrong number");
		}
		else {
			System.out.println("This number is Not Armstrong number");
		}

	}

}