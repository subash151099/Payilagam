//Two_Dimensional_array
//    j[0] j[1] j[2]
//i[0] 10   20   30
//i[1] 40   50   60
//i[2] 70   80   90
package tutor_joes_java_course.Array;

public class Two_Dimensional_array {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+a[i][j]);
			}
		System.out.println("");
		}

	}

}
