package failedrerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Failedemo2 {

	@Test
	public void testcase4() {

		System.out.println("Test case 1");

	}

	@Test
	public void testcase5() {

		System.out.println("Test case 2");
         Assert.assertTrue(false);
	}

	@Test
	public void testcase6() {

		System.out.println("Test case 3");

	}
	
	
	
	
	
	
	
	
}
