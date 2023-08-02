//Group switch
package tutor_joes_java_course;
import java.util.Scanner;
public class Group_case {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter anyone day: ");
		String day=n.next();
		switch(day) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			System.out.println("Working day");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("Holliday");
			break;
		
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println("Working day");
			break;
		case "saturday":
		case "sunday":
			System.out.println("Holliday");
			break;
		default:
			System.out.println("Enter correct day");
			break;
		}

	}

}
