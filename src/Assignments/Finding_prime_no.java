//14 Finding prime no.
package Assignments;

public class Finding_prime_no {

	public static void main(String[] args) {
		int n=7,f=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				f++;
			}
		}
		if(f==2) {
			System.out.println(n+" is a Prime number");
		}else {
			System.out.println(n+" is a Not Prime number");
		}
	}

}
