package testngpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {

	@Test  //if the priority not mentioned the default value is 0.If the priority value is same it will run according to alphabetics
	public void calls() {   //this method will execute first bcs here calls() and demo() having 0 priority first calls() then demo()
		Reporter.log("Calls",true);
	}
	
	@Test(priority=1) //after calls() and demo() chats() will execute
	public void chats() {
		Reporter.log("Chatting",true);
	}
	
	@Test
	public void demo() {
		Reporter.log("Settings",true);
	}
	
	@Test(priority=-1)
	public void vcall() {
		Reporter.log("Video call",true);
	}
	
	@Test(priority=-2)
	public void concal() {
		Reporter.log("Concall",true);
	}
}
//output will be concall,videocall,calls,settings,chatting