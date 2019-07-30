import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * This class deals with JUNIT testing. It compares the expected result with the calculated result.
 * 
 * @author Muhammad Saad Khan
 * @version 1.0.0
 */
class CheckResult {
	/**
	 * This test function tests the function with base 2
	 */
	@Test
	void test() {
		 Log l=new Log();
		 double ans=l.calculateLog(1024,2);
		 assertEquals(10.0, ans);
	}
	/**
	 * This test function tests the function with base 4
	 */
	@Test
	void test2() {
		 Log l=new Log();
		 double ans=l.calculateLog(16,4);
		 assertEquals(2.0, ans);
	}
	/**
	 * This test function tests the function with base 4
	 */
	@Test
	void test3() {
		 Log l=new Log();
		 double ans=l.calculateLog(1000,10);
		 assertEquals(3.0, ans);
	}
}
