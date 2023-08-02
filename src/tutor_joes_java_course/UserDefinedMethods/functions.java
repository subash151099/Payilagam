package tutor_joes_java_course.UserDefinedMethods;

//Default method
class Methods{
	//No return type without argument
	public void add() {
		int a=10;
		int b=20;
		System.out.println("Addition : "+(a+b));
	}
	
	//No return with argument
	public void sub(int a,int b) {
		System.out.println("Subtraction : "+(a-b));
	}
	
	//Return type without argument
	public int mul() {
		int a=10;
		int b=20;
		return (a*b);
	}
	
	//Return type with argument
	public double div(double a,double b) {
		return (a/b);
	}
		
	public int Fact(int a) {
		if(a==1) {
			return 1;
		}
		else {
			return(a*Fact(a-1));
		}
	}
	
}


public class functions {
	public static void main(String[] args) {
		Methods m=new Methods();
		m.add();
		m.sub(5, 3);
		System.out.println("Multiplication : "+m.mul());
		System.out.println("Division : "+m.div(10,5));
		System.out.println("Factorial using Recursion : "+m.Fact(4));
	}
}
