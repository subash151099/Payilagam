//Upto Rs. 25,000   5%
//25,001 - 50,000   7.5%
//50,001 - 1,00,000   10.0%
//More than 1,00,000   15.0%
package Payilagam_MiniProject2;
import java.util.Scanner;

class Cal{
	public static void calculation() {
		  Scanner in=new Scanner(System.in);
		  System.out.println("Enter Customer Name : ");
	  	  String name=in.next();
	  	  System.out.println("Enter Customer Contact : ");
	  	  String contact =in.next();
	  	  
	      System.out.println("Enter Total No. of Products : ");
	      int count=in.nextInt();
	      float total_amt=0,dis_percent=0,dis_amt=0,Final_price=0;
	      
	      for(int i=1;i<=count;i++){
	          System.out.println(i+". Enter Product amount : Rs.");
	          float n=in.nextInt();
	          if(n>=1 && n<=25000.0f){
	              float dis=(n*5.0f)/100;
	              Final_price+=(n-dis);
	              total_amt+=n;
	              dis_percent+=5.0f;
	              dis_amt+=dis;
	          }
	          else if(n>=25001.0f && n<=50000.0f){
	              float dis=(n*7.5f)/100;
	              Final_price+=(n-dis);
	              total_amt+=n;
	              dis_percent+=7.5f;
	              dis_amt+=dis;
	          }
	          else if(n>=50001.0f && n<=100000.0f){
	              float dis=(n*10.0f)/100;
	              Final_price+=(n-dis);
	              total_amt+=n;
	              dis_percent+=10.0f;
	              dis_amt+=dis;
	          }
	          else if(n>100000.0f){
	              float dis=(n*15.0f)/100;
	              Final_price+=(n-dis);
	              total_amt+=n;
	              dis_percent+=15.0f;
	              dis_amt+=dis;
	          }
	      }
	      System.out.println("Customer Name : "+name);
	  	  System.out.println("Customer Contact : "+contact);
	      System.out.println("Total Amount : Rs."+total_amt);
	      System.out.println("Total Discount : "+dis_percent+"%");
	      System.out.println("Total Discount Amount : Rs."+dis_amt);
	      System.out.println("Final Price : Rs."+Final_price);
	}
}



public class ElectronicShop{
  public static void main(String[] args){
	  Cal discount=new Cal();
	  discount.calculation();
  }
}
