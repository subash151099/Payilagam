//Print Armstrong_Number 100 to 999
package tutor_joes_java_course.Interview_Questins;

public class Armstrong_Number_100_999 {

	public static void main(String[] args) {
		int digit1, digit2, digit3, temp, result;
		
		for(int number=100;number<=999;number++) {
			temp=number;
			digit3=temp%10;
			temp=temp/10;
			
			digit2=temp%10;
			temp=temp/10;
			
			digit1=temp%10;
			temp=temp/10;
			
			result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
			
			if(result==number) {
				System.out.println(number+" is Armstrong number");
			}
		}

	}

}
