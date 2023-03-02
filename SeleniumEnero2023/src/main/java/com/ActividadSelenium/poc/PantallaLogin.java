package com.ActividadSelenium.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.ActividadSelenium.selenium.ClaseBase;

public class PantallaLogin extends ClaseBase {

	public PantallaLogin(WebDriver driver) {
		super(driver);
	}

	// Objects
	By txtUsername = By.name("username");
	By txtPassword = By.name("password");
	By btnLogin = By.xpath("//button[@type=\"submit\"]");
	By lblLoginError = By.xpath("//div[@class='orangehrm-login-error']");
	By lblLoginErrorText = By.xpath("//p[contains(@class, 'content-text')]");

	/*
	 * @name: login
	 * 
	 * @date: 23/Feb/2023
	 * 
	 * @param: String username, String password
	 * 
	 * @return: N/A
	 * 
	 * @author: Fernando Villalba Aguilar
	 * 
	 * @description: Este metodo permite realizar login sobre la plataforma
	 */
	public void login(String username, String password) {
		reporterLog("Logging with user: " + username);
		waitForElementPresent(btnLogin);
		type(txtUsername, getEncryptedUser(username));
		type(txtPassword, getEncryptedPassword(password));
		click(btnLogin);
	}
}
