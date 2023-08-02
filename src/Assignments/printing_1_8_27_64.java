//printing 1 8 27 64 
package Assignments;

public class printing_1_8_27_64 {

	public static void main(String[] args) {
		int range=4;
		for(int i=1;i<=range;i++) {
			int val=1;
			for(int j=1;j<=i;j++) {
				val*=i;
			}
		System.out.println(val);
		}
	    	      
	}

}
