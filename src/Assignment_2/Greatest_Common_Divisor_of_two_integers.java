     //27 Greatest Common Divisor of two integers
package Assignment_2;

public class Greatest_Common_Divisor_of_two_integers {

	public static void main(String[] args) {
		int a=120,b=80;
		int greater=0;
		if(a>b) {
			greater=a;
		}else if(a<b){
			greater=b;
		}
		else if(a==b){
			greater=a;
		}
		int val=0;
		for(int i=1;i<=greater;i++) {
			if(a%i==0 && b%i==0) {
				val=i;
			}
		}
		System.out.println(val);
	}

}
