//Prime Numbers 1 to 999
package tutor_joes_java_course.Interview_Questins;

public class Prime_Numbers_1_999 {

	public static void main(String[] args) {
		int count=0;
		for(int number=1;number<=999;number++) {
			for(int i=1;i<=number;i++) {
				if(number%i==0) {
					count++;
				}
			}	
			if(count==2) {
				System.out.println(number+" is Prime number");
			}
			count=0;
		}
	}
}
