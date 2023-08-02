package Mini_project_2;
import java.util.Scanner;

public class Calc_Employee_Salary {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Hours Obj=new Hours();
		System.out.println("Enter total working hours per week : ");
		float hrs=in.nextFloat();
		System.out.println("Enter Salary amount per hour - Rs : ");
		float amt=in.nextFloat();
		Obj.hours(hrs,amt);
	}

}
