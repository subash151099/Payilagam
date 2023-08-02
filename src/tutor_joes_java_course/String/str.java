//String
//String is a java object
//It is use to represents a Sequence of characters
//java.lang.String class is use to create and manipulate Strings
//By default string is immutable
// String there are three types 1,default String 2.BufferString 3.BuildString

package tutor_joes_java_course.String;
import java.lang.String;


public class str {

	public static void main(String[] args) {
		String a = "Subash bose";
		String b = " Bose ";
		//Hash code
		System.out.println("A Hash Code : "+a.hashCode());
		System.out.println("A Hash Code : "+a.hashCode());
		//==
		System.out.println("Equals : "+a.equals(b));
		//ignore ==
		System.out.println("Equals Ignore : "+a.equalsIgnoreCase(b));
		//length
		System.out.println("Length : "+a.length());
		//char At
		System.out.println("Char At : "+a.charAt(0));
		//to Upper and lower
		System.out.println("To Upper : "+a.toUpperCase());
		System.out.println("To Lower : "+a.toLowerCase());
		//replace
		System.out.println("Replace : "+a.replace("bose","RS"));
		//contains -in
		System.out.println("Contains : "+a.contains("bose")); //true
		//is empty
		System.out.println("Is Empty : "+a.isEmpty()); //false
		//ends with and starts with
		System.out.println("Ens With : "+a.endsWith("se"));
		System.out.println("Starts with : "+a.startsWith("Su"));
		//substring
		System.out.println("Substring : "+a.substring(5));
		System.out.println("Substring : "+a.substring(0,5));
		//char array
		char[] carray=a.toCharArray();
		for(char c: carray) {
			System.out.println(c);
		}
		//trim -remove unwanted spaces
		System.out.println("Trim : "+b.trim());
		
	}

}


