package failedrerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Faileddemo1 {

	@Test
	public void testcase1() {

		System.out.println("Test case 1");

	}

	@Test
	public void testcase2() {

		System.out.println("Test case 2");
        Assert.assertTrue(false);
	}

	@Test
	public void testcase3() {

		System.out.println("Test case 3");

	}

}
