package com.ActividadSelenium;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ActividadSelenium.poc.PantallaLogin;
import com.ActividadSelenium.poc.PantallaStore;
import com.ActividadSelenium.selenium.BaseStore;
import com.ActividadSelenium.selenium.ClaseBase;
import com.ActividadSelenium.selenium.GlobalVariablesStore;

import org.testng.annotations.BeforeTest;

import java.io.Closeable;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TesCaseStore {
	WebDriver driver;
	BaseStore base;
	PantallaStore store;

	@BeforeTest
	public void beforeTest() {
		base = new BaseStore(driver);
		driver = base.chromeDriverConection();
		store = new PantallaStore(driver);
	}

	@Test
	public void f() {
		store.launchBrowser(GlobalVariablesStore.QA_URL);
		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(store.HomePageisDisplayed(), true, "Home Page is Displayed");
		store.accesSoftwarePage();
		softAssertion.assertEquals(store.SoftwarePageisDisplayed(), true, "Home Page is Displayed");
		store.accesHomePage();
		softAssertion.assertEquals(store.HomePageisDisplayed(), true, "Home Page is Displayed");
		softAssertion.assertAll();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
