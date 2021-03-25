package TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg2 {
	@Test
	public void positiveTest2() {
	Assert.assertEquals("Luxoft", "Luxoft");
		
	}
	@Test
	public void negativeTest2() {
	Assert.assertEquals("LUXFT", "Luxoft");
		
	}
}
