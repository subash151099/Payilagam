//11 printing only multiples of 3 and 5
package Assignments;

public class printing_only_multiples_of_3_and_5 {

	public static void main(String[] args) {
		int range=100;
		for(int i=1;i<=range;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("Multiples of 3 and 5 : "+i);
			}
		}

	}

}
