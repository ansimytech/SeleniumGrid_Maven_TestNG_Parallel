package utilities;

import org.openqa.selenium.Capabilities;
import utilities.OptionsManager;

public class CapabilityFactory {
	public Capabilities capabilities;
	
	public Capabilities getCapabilities(String browser) {
		if(browser.equals("firefox"))
			capabilities = OptionsManager.getFirefoxOptions();
			else
			capabilities = OptionsManager.getChromeOptions();
		return capabilities;
	}
}
