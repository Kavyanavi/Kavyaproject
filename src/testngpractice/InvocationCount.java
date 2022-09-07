package testngpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount=5)
	public void call() {
		Reporter.log("hello",true);
	}
	
	@Test(invocationCount=2,priority=1)
	public void chat() {
		Reporter.log("hi",true);
	}
}
