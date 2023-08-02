//18 printing 5! 4! 3! 2! 1!
package Assignments;

public class printing_5fact_to_1fact {

	public static void main(String[] args) {
		int range=1;
		for(int start=5; start>=range;start--) {
			int f=1;
			for(int i=1;i<=start;i++) {
				f*=i;
			}
			System.out.println(f);
		}

	}

}
