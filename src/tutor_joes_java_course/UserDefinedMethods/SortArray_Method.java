//Returning array from method
package tutor_joes_java_course.UserDefinedMethods;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray_Method {
	public static int[] SortArray() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter limit : ");
		int limit=in.nextInt();
		int[] a=new int[limit];
		for(int i=0;i<limit;i++) {
			System.out.println("Enter value "+i+" : ");
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		return a;
	}
	
	public static void main(String[] args) {
		int b[]=SortArray();
		for(int i:b) {
			System.out.println(i);
		}
	}
}
