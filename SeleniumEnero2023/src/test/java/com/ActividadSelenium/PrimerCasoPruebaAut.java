package com.ActividadSelenium;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ActividadSelenium.poc.PantallaAdmin;
import com.ActividadSelenium.poc.PantallaHome;
import com.ActividadSelenium.poc.PantallaLogin;
import com.ActividadSelenium.selenium.ClaseBase;
import com.ActividadSelenium.selenium.GlobalVariablesData;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PrimerCasoPruebaAut {
	WebDriver driver;
	ClaseBase base;
	PantallaLogin login;
	PantallaHome home;
	PantallaAdmin admin;
	String username, password;
	String jsonName = "TestDataLogin";

	@BeforeTest
	public void beforeTest() {
		base = new ClaseBase(driver);
		driver = base.chromeDriverConection();
		login = new PantallaLogin(driver);
		home = new PantallaHome(driver);
		admin = new PantallaAdmin(driver);

		// Test Data
		this.username = base.getJSONValue(jsonName, "username");
		this.password = base.getJSONValue(jsonName, "password");
	}

	@Test
	public void test01() {
		// Paso 1 - Ingresar username y password en el portal de OrangeHRM
		base.launchBrowser(GlobalVariablesData.QA_URL);

		// Paso 2 - Click boton Login
		login.login(username, password);

		// Paso 3 - Validar que el usuario este logeado.
		// SOFT ASSERTION
		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(home.profilePictureisDisplayed(), false, "Profile Picture Displayed");

		// Hard Assertion
		// Assert.assertEquals(home.profilePictureisDisplayed(), true);

		// Paso 4 - Click Admin en el menu de la izquierda.
		home.accesAdminMenu();

		// Paso 5 - Insertar "Admin" en el textbox de "Username".
		// Paso 6 - Click boton Search.
		// Hard Assertion
		// Assert.assertEquals(admin.textUserManagementisDisplayed(), true);

		// Soft Assertion
		softAssertion.assertEquals(admin.textUserManagementisDisplayed(), false, "Text User Management Displayed");
		admin.enterTextUserName(username);

		// Paso 7 - Validar que Admin existe en la tabal desplegada.
		admin.recordFoundisDisplayed();

		softAssertion.assertAll();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
