//StringBuffer & StringBuilder  (mutable)

package tutor_joes_java_course.String;
public class StringBufferExample {
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Subash chandra bose");
		sb.append(" ");
		sb.append("RS");
		String message = sb.toString();
		System.out.println(message);
		//insert
		System.out.println(sb.insert(6, " computers"));
		//replace
		System.out.println(sb.replace(0, 4, "@@@@"));
		//delete
		System.out.println(sb.delete(0, 4));
		//reverse
		System.out.println(sb.reverse());
		//char at
		System.out.println(sb.charAt(0));
		//length
		System.out.println(sb.length());
		//sub string
		System.out.println(sb.substring(0));
		System.out.println(sb.substring(0,3));
		
		//System.out.println(sb.setCharAt(8, 'S'));
		
		//capacity default memory = 16 (16*2)+2
		System.out.println(sb.capacity());
		
		
	}
}
