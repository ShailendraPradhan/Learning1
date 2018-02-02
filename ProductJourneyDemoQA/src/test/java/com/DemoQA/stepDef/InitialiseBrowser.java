package com.DemoQA.stepDef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class InitialiseBrowser {

	// write steps for all browsers
	//means u have to dynamically call which browser class to use
	public WebDriver initialiseBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver(options);
        return driver  ;
		}
}
