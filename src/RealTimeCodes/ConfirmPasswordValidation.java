//Confirm Password Validation
package RealTimeCodes;
import java.util.Scanner;
public class ConfirmPasswordValidation extends PasswordValidation{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ConfirmPasswordValidation CP=new ConfirmPasswordValidation();
		
		System.out.println("Enter Password : ");
		String check=in.next();
		String res=CP.Validate(check);
		
		System.out.println("Enter Confirm Password : ");
		String cp=in.next();
		
		if(res.equals(cp)) {
			System.out.println("Confirm Password is Correct!");
		}
		else {
			System.out.println("Confirm Password is Wrong..");
		}
		
	}
	
}
