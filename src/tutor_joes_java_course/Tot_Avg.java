//Basic program for find total and average
package tutor_joes_java_course;
import java.util.Scanner;

public class Tot_Avg {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter Tamil Mark : ");
		float tamil=in.nextFloat();
		
		System.out.println("Enter English Mark : ");
		float english=in.nextFloat();
		
		System.out.println("Enter Tamil Maths Marks : ");
		float maths=in.nextFloat();
		
		System.out.println("Enter Science Mark : ");
		float science=in.nextFloat();
		
		System.out.println("Enter Social Mark : ");
		float social=in.nextFloat();
		
		float tot=tamil + english + maths + science + social;
		float avg=tot/5;
		String result;
		
		System.out.println("Total Marks : "+tot);
		System.out.println("Total Percentage : "+avg+"%");
		
		if(tamil>=35 && english>=35 && maths>=35 && science>=35 && social>=35) {
			result="Pass";
			System.out.println("Result : "+result);
		}else {
			result="Fail";
			System.out.println("Result : "+result);
		}
		

	}

}
