package web.uiautomation;

import org.testng.Assert;
import org.testng.annotations.Test;


public class FirefoxTest extends BaseTest {
	
	 @Test
	    public void GSAMPLE4() {
	        System.out.println("Google4 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
	        getDriver().navigate().to("http://www.google.com");
	        System.out.println("Google4 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: "+ Thread.currentThread().getId());
	        Assert.assertEquals(getDriver().getTitle(), "Google");
	        System.out.println("Google4 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
	    }

}
