package com.ActividadSelenium.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ActividadSelenium.selenium.ClaseBase;

public class PantallaAdmin extends ClaseBase {

	public PantallaAdmin(WebDriver driver) {
		super(driver);
	}

	By textUserManagement = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-level']");
	By imgProfilePicture = By.xpath("//img[@class='oxd-userdropdown-img']");
	By txtUserName = By.xpath(
			"//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active']");
	By btnSearch = By.xpath("//button[@type='submit']");
	By imgIconTrash = By.xpath("//i[@class='oxd-icon bi-trash']");
	By textFoundUserName = By.xpath("//div[contains(text(),'Admin')]");

	public boolean textUserManagementisDisplayed() {
		waitForElementPresent(imgProfilePicture);
		return isDisplayed(textUserManagement);
	}

	public void enterTextUserName(String username) {
		reporterLog("Enter: " + username);
		waitForElementPresent(btnSearch);
		type(txtUserName, getEncryptedUser(username));
		click(btnSearch);
	}

	public boolean recordFoundisDisplayed() {
		waitForElementPresent(imgIconTrash);
		return isDisplayed(textFoundUserName);
	}
}
