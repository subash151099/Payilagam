//Switch case
package tutor_joes_java_course;
import java.util.Scanner;
public class Switch_case {

	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);
		System.out.println("Enter anyone number: ");
		int n=number.nextInt();
		String day;
		switch(n){
			case 1:
				day="Sunday";
				System.out.println(day);
				break;
			case 2:
				day="Monday";
				System.out.println(day);
				break;
			case 3:
				day="Tuesday";
				System.out.println(day);
				break;
			case 4:
				day="Wednesday";
				System.out.println(day);
				break;
			case 5:
				day="Thursday";
				System.out.println(day);
				break;
			case 6:
				day="Friday";
				System.out.println(day);
				break;
			case 7:
				day="Saturday";
				System.out.println(day);
				break;
			default:
				System.out.println("Enter correct input");
				break;
		}

	}

}
