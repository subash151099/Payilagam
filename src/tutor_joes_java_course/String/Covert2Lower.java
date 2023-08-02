//Covert to Lower
package tutor_joes_java_course.String;

public class Covert2Lower {

	public static void main(String[] args) {
		StringBuilder a=new StringBuilder("I AM SUBASH FROM KALLAKURICHI");
		System.out.println(a);
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>=65 && a.charAt(i)<=90) {
				int c=(int)a.charAt(i)+32;
				a.setCharAt(i, (char)c);
			}
		}
		System.out.println(a);

	}

}
