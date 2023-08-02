//2.Reverse a number
package FrequentlyAskedInterviewPrograms;

public class ReverseANumber {

	public static void main(String[] args) {
		int num=1234;
//		Logic-1
		int rev=0,rem=0;
		while(num!=0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println("Reverse Number is:"+rev);
		
//		Logic-2
		int num2=12345;
		StringBuffer sb=new StringBuffer(String.valueOf(num2));
		StringBuffer val=sb.reverse();
		System.out.println("Reverse Number is:"+val);
		
//		Logic-3
		int num3=123456;
		StringBuilder sbl=new StringBuilder();
		sbl.append(num3);
		StringBuilder rev3=sbl.reverse();
		System.out.println("Reverse Number is:"+rev3);
	}

}
