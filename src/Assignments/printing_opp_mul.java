//19 printing 1*10 2*9 3*8 4*7
package Assignments;

public class printing_opp_mul {

	public static void main(String[] args) {
		int range=20,val;
		for(int i=1;i<=range;i++) {
			val=i*range;
			range--;
			System.out.println(val);
		}

	}

}
