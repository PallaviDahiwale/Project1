package com.Zerodha.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchListPOMClass {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@icon='search']")
	WebElement watchlist;

	public void watchList() {
		watchlist.sendKeys("TCS");
	}
	
	
	public WatchListPOMClass(WebDriver driver) {
		// Global //Local
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	

}
