package com.DemoQA.stepDef;
import java.awt.Desktop.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver;

	@Given("^Initialise the Webdriver$")
	public void initialise_the_Webdriver() throws Throwable {
		driver = new InitialiseBrowser().initialiseBrowser();
	}
	@Given("^Site \"([^\"]*)\" is up$")
	public void site_is_up(String arg1) throws Throwable {
		driver.get("http://www.Shop.demoqa.com");
		driver.manage().window().maximize();
	}
	@When("^Navigate to women$")
	public void navigate_to_women() throws Throwable {
		WebElement element = driver.findElement(By.xpath("//*[@id='menu-item-2213']/a"));
		Actions action = new Actions(driver);
		action.moveToElement(element);
		action.perform();
	}
	@And("^click on  Jackets$")
	public void click_on_Jackets() throws Throwable {
		driver.findElement(By.xpath("//*[@id='menu-item-2235']/a")).click();
		
	}
	@When("^select color from dropdown$")
	public void select_color_from_dropdown() throws Throwable {
		new Select(driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div[1]/div/div[1]/form[1]/select"))).selectByIndex(1); 
	}
	@When("^sort jacket by newness$")
	public void sort_jacket_by_newness() throws Throwable {
		new Select(driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div[1]/div/form/select"))).selectByIndex(3);
		WebElement element = driver.findElement(By.xpath("//*[@id='woocommerce_price_filter-1']/form/div/div[1]/span[2]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, -204, 333);
		action.perform();
	}
		@And("^Click on fiter button$")
		public void Click_on_fiter_button() throws Throwable {
         driver.findElement(By.xpath("//*[@id='woocommerce_price_filter-1']/form/div/div[2]/button")).click();   
          
          WebElement element =driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div[2]/div[1]/div/div[2]/div/h3/a"));
  	       Actions action= new Actions(driver);
           action.moveToElement(element);
        	action.click();
}
	@And("^Click on selected item$")
		public void Click_on_selected_item() throws Throwable {
          WebElement element =driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div[2]/div[1]/div/div[2]/div/h3/a"));
  	       Actions action= new Actions(driver);
  	     action.moveToElement(element).click(element).build().perform();
}
		
	@Then("^Add to cart")
	public void Add_to_cart() throws Throwable {	
		driver.findElement(By.xpath("//*[@id='product-2004']/div[1]/div[2]/form/button")).click();
		WebElement element = driver.findElement(By.xpath("//*[@id='nav-menu-item-cart']/a/span/i"));
		Actions action = new Actions(driver);
	 
 	     action.moveToElement(element).click(element).build().perform();
	
		driver.findElement(By.xpath("//*[@id='nav-menu-item-cart']/div/div[3]/div[2]/a[2]")).click();
	
	}

	
	
	
	
}