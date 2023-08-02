package Loop;

public class Palindrome {

	public static void main(String[] args) {
		int n=121;
		int temp=n;
        int rem;
        int tot=0;
        while(n!=0){
            rem=n%10;
            n=n/10;
            System.out.println(rem);
            tot=(tot*10)+rem;
        }
        System.out.println(tot);
        if(tot==temp) {
        	System.out.println(tot+" is Palindrome");
        }else{
        	System.out.println(tot+" is Not Palindrome");
        }

	}

}
