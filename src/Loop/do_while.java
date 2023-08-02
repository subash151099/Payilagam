package Loop;
import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		int tot=20,start=1;
        Scanner attendence = new Scanner(System.in);
        
        
        do{
            System.out.println("Roll number "+start+" Present (or) Absent? ex-P/A");
            char P_A =attendence.next().charAt(0);
            if (P_A=='p'||P_A=='P'){
                System.out.println("Roll number "+start+" Present");
            }
            else if (P_A=='a'||P_A=='a'){
                System.out.println("Roll number "+start+" Absent");
            }
            start++;
        }while(start<=tot);

	}

}
