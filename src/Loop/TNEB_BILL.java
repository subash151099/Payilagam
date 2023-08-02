//Mini-Project-1 Payilagam  [author: Subash<subash15101999@gmail.com>]
//Tamilnadu EB bill calculator using Java
//01-07-2023
//reference: https://www.biob.in/2021/06/tneb.html
package Loop;
import java.util.Scanner;
public class TNEB_BILL {

	public static void main(String[] args) {
		Scanner tot_unit = new Scanner(System.in);
		System.out.println("தமிழ் நாடு மின் உற்பத்தி மற்றும் பகிர்மான கழகம்");
		System.out.println("மின் கட்டண கணக்கீடு");
		System.out.println("பயன்படுத்தப்பட்ட  மொத்த மின் அளவை உள்ளிடவும்");
		float unit=tot_unit.nextFloat();
        float price=0,temp1,temp2,temp3,temp4,temp5,temp6;
        if(unit>=0&&unit<=100){
        	//0.00
        	//System.out.println("Total Units: "+unit+" ,Bill Amount: ₹"+price);
        	System.out.println("பயன்படுத்தப்பட்ட  மொத்த மின் அளவு: "+unit+" ,மின் கட்டண தொகை: ₹"+price);
        }
        else if(unit>=101&&unit<=200){
        	//2.25
        	temp1=unit-100;
        	price+=temp1*2.25f;
        	//System.out.println("Total Units: "+unit+" ,Bill Amount: ₹"+price);
        	System.out.println("பயன்படுத்தப்பட்ட  மொத்த மின் அளவு: "+unit+" ,மின் கட்டண தொகை: ₹"+price);
        }
        else if(unit>=201&&unit<=400){
        	//4.50
        	temp1=unit-200;
        	temp2=200-100;
        	price+=(temp2*2.25f)+(temp1*4.50f);
        	//price+=temp1*4.50f;
        	//System.out.println("Total Units: "+unit+" ,Bill Amount: ₹"+price);
        	System.out.println("பயன்படுத்தப்பட்ட  மொத்த மின் அளவு: "+unit+" ,மின் கட்டண தொகை: ₹"+price);
        }
        else if(unit>=401&&unit<=500){
        	//6.00
        	temp1=unit-400;
        	temp2=400-200;
        	temp3=200-100;
        	price+=(temp1*6.00f)+(temp2*4.50f)+(temp3*2.25f);
        	//price+=temp2*4.50f;
        	//price+=temp3*2.25f;
        	//System.out.println("Total Units: "+unit+" ,Bill Amount: ₹"+price);
        	System.out.println("பயன்படுத்தப்பட்ட  மொத்த மின் அளவு: "+unit+" ,மின் கட்டண தொகை: ₹"+price);
        }
        else if(unit>=501&&unit<=600){
        	//8.00
        	temp1=unit-500;
        	temp2=500-400;
        	temp3=400-100;
        	price+=(temp1*8.00f)+(temp2*6.00f)+(temp3*4.50f);
        	//price+=temp2*6.00f;
        	//price+=temp3*4.50f;
        	//System.out.println("Total Units: "+unit+" ,Bill Amount: ₹"+price);
        	System.out.println("பயன்படுத்தப்பட்ட  மொத்த மின் அளவு: "+unit+" ,மின் கட்டண தொகை: ₹"+price);
        }
        else if(unit>=601&&unit<=800){
        	//9.00
        	temp1=unit-600;
        	temp2=600-500;
        	temp3=500-400;
        	temp4=400-100;
        	price+=(temp1*9.00f)+(temp2*8.00f)+(temp3*6.00f)+(temp4*4.50f);
        	//price+=temp2*8.00f;
        	//price+=temp3*6.00f;
        	//price+=temp4*4.50f;
        	//System.out.println("Total Units: "+unit+" ,Bill Amount: ₹"+price);
        	System.out.println("பயன்படுத்தப்பட்ட  மொத்த மின் அளவு: "+unit+" ,மின் கட்டண தொகை: ₹"+price);
        }
        else if(unit>=801&&unit<=1000){
        	//10.00
        	temp1=unit-800;
        	temp2=800-600;
        	temp3=600-500;
        	temp4=500-400;
        	temp5=400-100;
        	price+=(temp1*10.00f)+(temp2*9.00f)+(temp3*8.00f)+(temp4*6.00f)+(temp5*4.50f);
        	//price+=temp2*9.00f;
        	//price+=temp3*8.00f;
        	//price+=temp4*6.00f;
        	//price+=temp5*4.50f;
        	//System.out.println("Total Units: "+unit+" ,Bill Amount: ₹"+price);
        	System.out.println("பயன்படுத்தப்பட்ட  மொத்த மின் அளவு: "+unit+" ,மின் கட்டண தொகை: ₹"+price);
        }
        else if(unit>1000){
        	//11.00
        	temp1=unit-1000;
        	temp2=1000-800;
        	temp3=800-600;
        	temp4=600-500;
        	temp5=500-400;
        	temp6=400-100;
        	price+=(temp1*11.00f)+(temp2*10.00f)+(temp3*9.00f)+(temp4*8.00f)+(temp5*6.00f)+(temp6*4.50f);
        	//price+=temp2*10.00f;
        	//price+=temp3*9.00f;
        	//price+=temp4*8.00f;
        	//price+=temp5*6.00f;
        	//price+=temp6*4.50f;
        	//System.out.println("Total Units: "+unit+" ,Bill Amount: ₹"+price);
        	System.out.println("பயன்படுத்தப்பட்ட  மொத்த மின் அளவு: "+unit+" ,மின் கட்டண தொகை: ₹"+price);
        }
        else {
        	//enter correct unit
        	//System.out.println("enter correct unit");
        	System.out.println("சரியான மின் அளவை உள்ளிடவு");
        }
        System.out.println("மின்சிக்கன‌ம் தேவை இக்கணம்....");
	}

}
