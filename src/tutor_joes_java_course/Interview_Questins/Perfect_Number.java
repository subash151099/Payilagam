//Perfect number
package tutor_joes_java_course.Interview_Questins;
import java.util.Scanner;
public class Perfect_Number {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=in.nextInt();
		int val=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				val+=i;
			}
		}
		if(val==n) {
			System.out.println(n+" is Perfect number");
		}
		else {
			System.out.println(n+" is Not Perfect number");
		}
	}

}
