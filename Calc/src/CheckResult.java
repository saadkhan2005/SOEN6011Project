import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CheckResult {

	@Test
	void test() {
		 log l=new log();
		 double ans=l.calculateLog(1024,2);
		 assertEquals(10.0, ans);
	}

}
