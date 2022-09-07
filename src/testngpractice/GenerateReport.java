package testngpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GenerateReport {

	@Test
	public void demo() {
		Reporter.log("Hi",true);//hi will print on both console and report
		Reporter.log("hello",false);//hello will not print on console
	}
}
