//While loop
package tutor_joes_java_course;
import java.util.Scanner;
public class While_loop {

	public static void main(String[] args) {
		System.out.println("Enter range: ");
		Scanner n=new Scanner(System.in);
		int range=n.nextInt();
		int i=1;
		while(i<=range) {
			System.out.println(i);
			i++;
		}

	}

}
