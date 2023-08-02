//26 Smallest Divisor of an integer
package Assignment_2;

public class Smallest_Divisor_of_an_integer {

	void SmallDivisor(int n){
		int val=0;
		for(int i=n;i>=2;i--) {
			if(n%i==0) {
				val=i;
			}
		}
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		Smallest_Divisor_of_an_integer divisor=new Smallest_Divisor_of_an_integer();
		divisor.SmallDivisor(25);
	}

}
