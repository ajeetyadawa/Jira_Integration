package TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg2 {
	@Test
	public void positiveTest2() {
	Assert.assertEquals("Ajeet", "Ajit");
		
	}
	@Test
	public void negativeTest2() {
	Assert.assertEquals("Ajeet", "Ajeet");
		
	}
}
