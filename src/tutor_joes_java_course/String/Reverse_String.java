//Reverse_String
package tutor_joes_java_course.String;

public class Reverse_String {

	public static void main(String[] args) {
		StringBuilder a=new StringBuilder("Hello Guys I am Subash");
		System.out.println(a);
		StringBuilder b=new StringBuilder();
		
		for(int i=a.length()-1;i>=0;i--) {
			b.append(a.charAt(i));
		}
		System.out.println(b);
	}

}
