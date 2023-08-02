package Loop;

public class Spilt_Sum {

	public static void main(String[] args) {
		int n=546;
        int rem;
        int tot=0;
        while(n!=0){
            rem=n%10;
            n=n/10;
            System.out.println(rem);
            tot=tot+rem;
        }
        System.out.println(tot);

	}

}
