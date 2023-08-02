//Password validation
//A password is considered valid if all the following constraints are satisfied:
//
//    It contains at least 8 characters and at most 20 characters.
//    It contains at least one digit.
//    It contains at least one upper case alphabet.
//    It contains at least one lower case alphabet.
package RealTimeCodes;
import java.util.Scanner;

public class PasswordValidation {
	public static String Validate(String Pass) {
		int digit=0, upper=0, lower=0;
		if(Pass.length()>=8 && Pass.length()<=20) {
			for(int i=0;i<Pass.length();i++) {
				if(Pass.charAt(i)>=65 && Pass.charAt(i)<=90) {
					upper++;
				}
				else if(Pass.charAt(i)>=97 && Pass.charAt(i)<=122) {
					lower++;
				}
				else if(Pass.charAt(i)>=48 && Pass.charAt(i)<=57) {
					digit++;
				}
			}
		}
		
		if(digit>0 && upper>0 && lower>0)
		return Pass;
		else {
			return "Enter Valid password";
		}
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PasswordValidation Password=new PasswordValidation();
		System.out.println("Enter Password : ");
		String check=in.next();
		System.out.println(Password.Validate(check));
		
	}

}
