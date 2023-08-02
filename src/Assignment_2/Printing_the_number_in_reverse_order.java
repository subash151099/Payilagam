// 23 Printing the number in reverse order
package Assignment_2;

public class Printing_the_number_in_reverse_order {

	public static void main(String[] args) {
		int n=546;
        int rem;
        int tot=0;
        while(n!=0){
            rem=n%10;
            n=n/10;
            System.out.print(rem);
            tot=(tot*10)+rem;
        }


	}

}
