//Jagged Array
package tutor_joes_java_course.Array;

public class Jagged_Array {

	public static void main(String[] args) {
		int a[][]={{1,2,3,4},{1,2,3},{1,2,3,4}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println("");
		}

	}

}
