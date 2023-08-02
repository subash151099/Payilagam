//3.Reverse a String
package FrequentlyAskedInterviewPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		String str="subash";
		String rev="";
		
//		Logic-1
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse a String :"+rev);

	}

}
