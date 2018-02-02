package com.DemoQA.stepDef;

import java.util.List;

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
	//aaaaaaaaaaaaaaaaaaaaaaaaaa
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
		new Select(driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div[1]/div/div[1]/form[1]/select"))).selectByIndex(1);
		new Select(driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div[1]/div/form/select"))).selectByIndex(1);
	}

	@Then("^fbgbfd$")
	public void fbgbfd() throws Throwable {
	}

}
