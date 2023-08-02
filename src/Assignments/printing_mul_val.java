//13 printing  1*2 2*3 3*4 4*5 5*6
package Assignments;

public class printing_mul_val {

	public static void main(String[] args) {
		int range=5,power=2, val;
		for (int i=1;i<=range;i++) {
			val=i*power;
			power++;
			System.out.println(val);
		}

	}

}
