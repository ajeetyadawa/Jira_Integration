package TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngTest {

	@Test
	public void positiveTest1() {
	Assert.assertEquals("Ajeet", "Ajit");
		
	}
	@Test
	public void negativeTest1() {
	Assert.assertEquals("Ajeet", "Ajeet");
		
	}
	
	
	
}
