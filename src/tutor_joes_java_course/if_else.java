//find leap year using if else
package tutor_joes_java_course;

public class if_else {

	public static void main(String[] args) {
		int year=2020;
		if(year%4==0||(year%100==0 && year%400==0)) {
			System.out.println(year+" is leap year");
		}else {
		System.out.println(year+" is Not leap year");
		}
	}

}
