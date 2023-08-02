package Loop;
import java.util.Scanner;
public class Lower2Upper_ascii {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
	    System.out.println("Enter anyone character");
	    char alpha=inp.next().charAt(0);
	    int num = (int)alpha;
	    if (num>=97&&num<=122){
	    	int temp=num-32;
	    	System.out.println((char)temp);
	    }
	    else if (num>=65&&num<=90){
	        System.out.println((char)num);
	    }
	    else{
	        System.out.println("Enter anyone alphabet character");
	    }

	}

}
