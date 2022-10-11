package com.Zerodha.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass {
	
	public WebDriver driver;
	public Actions act;
	@FindBy(xpath = "//input[@id='userid']")
	WebElement username;

	public void sendUserName() {
		username.sendKeys("QSY032");
	}

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	public void sendpassword() {

		password.sendKeys("pallavi88@123");

	}

	@FindBy(xpath = "//button[@class='button-orange wide']")
	WebElement loginButton;

	public void clickOnLoginButton() {

		act.click(loginButton).perform();
	}
	
	
	
	@FindBy(xpath = "//button[@class='button-orange wide']")
	WebElement continueButton;

	public void clickOnContinueButton() throws InterruptedException {
		 Thread.sleep(15000);
		act.click(continueButton).perform();
	}
	
	
	
	public LoginPOMClass(WebDriver driver) {
		// Global //Local
		this.driver = driver;

		PageFactory.initElements(driver, this);

		act = new Actions(driver);

	}

}
