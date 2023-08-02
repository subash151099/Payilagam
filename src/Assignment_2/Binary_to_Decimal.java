//30 Binary to Decimal
package Assignment_2;

public class Binary_to_Decimal {

	    public static int getDecimalNumber(int binaryNumber){
        int decimalNumber = 0;
        int power = 0;
        while(binaryNumber > 0){
       
            int temp = binaryNumber%10;
            decimalNumber += temp*Math.pow(2, power);
            binaryNumber = binaryNumber/10;
            power++;
        }
        return decimalNumber;
    }

    public static void main(String args[]){
        System.out.println("Decimal value is: "+getDecimalNumber(111010));
        System.out.println("Decimal value is: "+getDecimalNumber(001010));
    }

}
