package com.ActividadSelenium.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ActividadSelenium.selenium.BaseStore;

public class PantallaStore extends BaseStore {

	public PantallaStore(WebDriver driver) {
		super(driver);
	}

	// Elements
	By btnSoftwareMenu = By.xpath("//a[contains(text(),'Software')]");
	By btnContinueBy = By.xpath("//a[contains(text(),'Continue')]");
	
	
	public boolean SoftwarePageisDisplayed() {
		waitForElementPresent(btnContinueBy);
		return isDisplayed(btnContinueBy);
	}
	
	public boolean HomePageisDisplayed() {
		waitForElementPresent(btnSoftwareMenu);
		return isDisplayed(btnSoftwareMenu);
	}
	
	public void accesSoftwarePage() {
		reporterLog("Try acces Menu Software");
		waitForElementPresent(btnSoftwareMenu);
		click(btnSoftwareMenu);
	}
	
	public void accesHomePage() {
		reporterLog("Try acces Home");
		waitForElementPresent(btnContinueBy);
		click(btnContinueBy);
	}
}
