import java.math.BigDecimal;
import java.util.Scanner;

/**
 * This class deals with logarithm function. It takes two input and calculate logarithm.
 * 
 * @author Muhammad Saad Khan
 * @version 1.0.0
 */

public class Log {
	/**
	 * Main method launches the application.
	 */
	 public static void main(String[] args)
	 {
		 try 
		 {
			 int base;
			 String ask_for_base="Enter the base for logarithm:";
			 base=checkInput(ask_for_base);		 
			 String ask_for_num="Enter the number for which you want to find logarithm:";
			 int num;
			 num=checkInput(ask_for_num);
			 Log l=new Log();
			 double ans=l.calculateLog(num,base);
			 System.out.println("The answer is "+ans);
		 }
		 catch(Exception ex) {
			 System.out.print(ex.getMessage());
		 }
	 }
	 /**
	  * calculateLog is a recursive function. It calculates log and return the result.  
	  *
	  * @param num number for which the logarithm to be find
	  * @param base base for logarithm
	  * @return returns the answer of logarithm
	  */
	 double calculateLog(double num,double base) 
	 {
		 try 
		 {
			 if (num < base) {
				return 0;
			}	
			 //It rounds off the answer and returns it
			 return 1 + calculateLog(num/base, base);
		 }
		 catch(Exception ex) 
		 {
			 return 0;
		 }
	 }
	 /**
	  * checkInput checks input that the user has entered.  
	  *
	  * @param msg: takes message so that the user know what to type
	  * @return input: it returns input that the user has entered
	  */
	 static int checkInput(String msg) 
	 {
		try 
		{
			int input;
			Scanner sc=new Scanner(System.in);
			do 
			{
				System.out.println(msg);
				while (!sc.hasNextInt())
				{
				 System.out.println("That's not a number! Please enter a correct number");
				 sc.next();
				}
				input =sc.nextInt();
				msg="Please enter a postive number";
			}
			while (input <= 0);
			return input;
		}
		catch(Exception ex) 
		{
			return 0;
		}
	 }
}
