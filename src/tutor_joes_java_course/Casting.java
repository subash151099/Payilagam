//Casting - 1.widening, 2.narrowing
package tutor_joes_java_course;
import java.lang.*;
public class Casting {

	public static void main(String[] args) {
		// 1.Widening  small-High
		//byte -> short -> char -> int -> long -> float -> double
		
		//Narowing casting high-small
		//double -> float -> long -> int -> char -> short -> byte
		
		//1
		int number=10;
		float a=number;
		System.out.println(a);
		
		//2
		double n=10.56745;
		int b=(int)n;
		System.out.println(b);

	}

}
