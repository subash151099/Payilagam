//34 no. of digits
package Assignment_2;

public class no_of_digits {

	public static void main(String[] args) {
        int n=546098;
        int rem;
        int tot=0;
        int loop_time=0;
        while(n!=0){
            rem=n%10;
            n=n/10;
            tot=tot+rem;
            loop_time++;
            
        }
        System.out.println("Total digits : "+loop_time);
    }

}
