//Static method use without object similar to math build in function
package tutor_joes_java_course.UserDefinedMethods;
//static function
class Interview{
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
}


public class StaticMethod {

	public static void main(String[] args) {
		System.out.println("Factorial : "+Interview.factorial(5));
	}

}
