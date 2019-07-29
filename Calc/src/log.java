import java.math.BigDecimal;
import java.util.Scanner;

public class log {
	 public static void main(String[] args)
	  {
		 
		 Scanner sc=new Scanner(System.in);
		 int base;
		 String show="Enter the base for logarithm:";
		 base=checkInput(show);		 
		 String show_msg="Enter the number for which you want to find logarithm:";
		 int num;
		 num=checkInput(show_msg);
		 log l=new log();
		 double ans=l.calculateLog(num,base);
		 System.out.println("The answer is "+ans);
	  }
	
	  
	 double calculateLog(double x,double b) {
		    if (x < b)
		        return 0;  
		    return 1 + calculateLog(x/b, b);
	  }

	  
	static int checkInput(String show) {
		int input;
		 Scanner sc=new Scanner(System.in);
		 do {
			 System.out.println(show);
			    while (!sc.hasNextInt()) {
			        System.out.println("That's not a number! Please enter a correct number");
			        sc.next(); 
			    }
			    input = sc.nextInt();
			    show="Please enter a postive number";
			} while (input <= 0);
		 return input;
	  }
	 
}
