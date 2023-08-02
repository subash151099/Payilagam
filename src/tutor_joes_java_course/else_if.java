//else if
package tutor_joes_java_course;

public class else_if {

	public static void main(String[] args) {
		float mark=88.90f;
		if(mark>=90 && mark<=100) {
			System.out.println("Grade - A");
		}
		else if(mark>=80 && mark<=89) {
			System.out.println("Grade - B");
		}
		else if(mark>=70 && mark<=79) {
			System.out.println("Grade - C");
		}
		else if(mark>=60 && mark<=69) {
			System.out.println("Grade - D");
		}
		else {
			System.out.println("Grade - E");
		}

	}

}
