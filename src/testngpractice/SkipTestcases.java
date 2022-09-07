package testngpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipTestcases {

	@Test(enabled=false)
	public void calls() {
		Reporter.log("hello",true);
	}
	
	@Test
	public void chatts() {
		Reporter.log("hi",true);
	}
}
