//Break Continue
package tutor_joes_java_course;

public class Break_Contine {

	public static void main(String[] args) {
		int range=10;
		for(int i=1;i<=range;i++) {
			if(i==3)
				continue;
			System.out.println(i);
			if(i==8)
				break;
		}

	}

}
