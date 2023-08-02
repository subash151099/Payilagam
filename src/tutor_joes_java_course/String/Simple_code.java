//find ascii values
package tutor_joes_java_course.String;

public class Simple_code {

	public static void main(String[] args) {
		StringBuilder a=new StringBuilder("SubasH@123  #&");
		System.out.println(a);
		int caps=0;
		int small=0;
		int space=0;
		int num=0;
		
		
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>=65 && a.charAt(i)<=90) {
				caps++;
			}
			if(a.charAt(i)>=97 && a.charAt(i)<=122) {
				small++;
			}
			if(a.charAt(i)>=48 && a.charAt(i)<=57) {
				num++;
			}
			if(a.charAt(i)==32) {
				space++;
			}
			
		}
		
		System.out.println("Total Caps letters : "+caps);
		System.out.println("Total Small letters : "+small);
		System.out.println("Total Numbers : "+num);
		System.out.println("Total empty Spaces : "+space);
		int spl=a.length()-(caps+small+space+num);
		System.out.println("Total Special chars : "+spl);
	}

}
