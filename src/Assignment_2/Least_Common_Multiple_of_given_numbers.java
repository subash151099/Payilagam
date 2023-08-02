//28 Least Common Multiple of given numbers
package Assignment_2;
import java.util.Scanner;
public class Least_Common_Multiple_of_given_numbers {
	public static void main(String args[]){
	      int a, b, max, step, lcm = 0;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter first number : ");
	      a = sc.nextInt();
	      System.out.println("Enter second number : ");
	      b = sc.nextInt();

	      if(a > b){     //a=10, b=11   
	         max = step = a;    
	      }
	      else{
	         max = step = b;    //11=11=11
	      }

	      while(a!= 0) {  //10!=0
	         if(max % a == 0 && max % b == 0) {   //11%10==0   && 11%11==0
	            lcm = max;    //lcm=0  lcm=11
	            break;
	         }
	         max += step;    //11+=11
	      }
	      System.out.println("LCM of given numbers is : "+lcm);
	   }
	
}
