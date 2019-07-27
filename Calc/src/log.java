
public class log {
	 public static void main(String[] args)
	  {
		  long n=1000;
		  log l=new log();
		  System.out.println(l.myLog(n, 2));
	  }
	
	  
	  long myLog(long x, long b) {
		    if (x < b)
		        return 0;  
		    return 1 + myLog(x/b, b);
	  }
}
