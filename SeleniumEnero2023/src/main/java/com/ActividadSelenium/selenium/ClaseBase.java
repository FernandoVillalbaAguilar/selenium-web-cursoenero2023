package com.ActividadSelenium.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ClaseBase {
	private WebDriver driver;

	public ClaseBase(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * @name: chromeDriverConection
	 * 
	 * @date: 23/Feb/2023
	 * 
	 * @param: NA
	 * 
	 * @return: driver
	 * 
	 * @author: Fernando Villalba Aguilar
	 * 
	 * @description: Este metodo permite llamar la conexión con ChromeDriver
	 */
	public WebDriver chromeDriverConection() {
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOpt);
		return driver;
	}

	/*
	 * @name: launchBrowser
	 * 
	 * @date: 23/Feb/2023
	 * 
	 * @param: String url
	 * 
	 * @return: N/A
	 * 
	 * @author: Fernando Villalba Aguilar
	 * 
	 * @description: Este metodo permite abrir la pantalla de Chrome
	 */

	public void launchBrowser(String url) {
		try {
			reporterLog("Launching... " + url);
			driver.get(url);
			driver.manage().window().maximize();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}

	/*
	 * @name: reporterLog
	 * 
	 * @date: 23/Feb/2023
	 * 
	 * @param: String log
	 * 
	 * @return: N/A
	 * 
	 * @author: Fernando Villalba Aguilar
	 * 
	 * @description: Este metodo permite generar un reporte Log en nuestra consola.
	 */
	public void reporterLog(String log) {
		Reporter.log(log);
	}

	/*
	 * @name: waitForElementPresent
	 * 
	 * @date: 23/Feb/2023
	 * 
	 * @param: By locator
	 * 
	 * @return: N/A
	 * 
	 * @author: Fernando Villalba Aguilar
	 * 
	 * @description: Este metodo permite un Explicit wait de acuerdo a las variables
	 * indicadas
	 */
	public void waitForElementPresent(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, GlobalVariablesData.DEFAULT_TIMEOUT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/*
	 * @name: type
	 * 
	 * @date: 23/Feb/2023
	 * 
	 * @param: By locator, String inputText
	 * 
	 * @return: N/A
	 * 
	 * @author: Fernando Villalba Aguilar
	 * 
	 * @description: Este metodo permite buscar un elemento y enviar un texto
	 */
	public void type(By locator, String inputText) {
		try {
			driver.findElement(locator).sendKeys(inputText);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	/*
	 * @name: click
	 * 
	 * @date: 23/Feb/2023
	 * 
	 * @param: By locator
	 * 
	 * @return: N/A
	 * 
	 * @author: Fernando Villalba Aguilar
	 * 
	 * @description: Este metodo permite buscar un elemento y dar clic sobre ese
	 * elemento
	 */
	public void click(By locator) {
		try {
			waitForElementPresent(locator);
			// Method screenshot
			driver.findElement(locator).click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	/*
	 * @name: isDisplayed
	 * 
	 * @date: 23/Feb/2023
	 * 
	 * @param: By locator
	 * 
	 * @return: false / driver.findElement(locator).isDisplayed();
	 * 
	 * @author: Fernando Villalba Aguilar
	 * 
	 * @description: Este metodo valida si existe un elemento en pantalla
	 */
	public boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}

	/*
	 * @name: getJSONValue
	 * 
	 * @date: 23/Feb/2023
	 * 
	 * @param: String jsonFileObj, String jsonKey
	 * 
	 * @return: jsonValue / null
	 * 
	 * @author: Fernando Villalba Aguilar
	 * 
	 * @description: Este metodo permite leer la información de un archivo JSON
	 */
	public String getJSONValue(String jsonFileObj, String jsonKey) {
		try {

			// JSON Data
			InputStream inputStream = new FileInputStream(GlobalVariablesData.PATH_JSON_DATA + jsonFileObj + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));

			// Get Data
			String jsonValue = (String) jsonObject.get(jsonKey);
			return jsonValue;

		} catch (FileNotFoundException e) {
			Assert.fail("JSON file is not found");
			return null;
		}
	}

	/*
	 * @name: getEncryptedPassword
	 * 
	 * @date: 23/Feb/2023
	 * 
	 * @param: String encryptedPwd
	 * 
	 * @return: String(decodedBytes)
	 * 
	 * @author: Fernando Villalba Aguilar
	 * 
	 * @description: Este metodo permite decodificar el pasword almacenado en el
	 * JSON
	 */
	public String getEncryptedPassword(String encryptedPwd) {
		byte[] decodedBytes = Base64.decodeBase64(encryptedPwd);
		return new String(decodedBytes);
	}

	/*
	 * @name: getEncryptedUser
	 * 
	 * @date: 23/Feb/2023
	 * 
	 * @param: String encryptedPwd
	 * 
	 * @return: String(decodedBytes)
	 * 
	 * @author: Fernando Villalba Aguilar
	 * 
	 * @description: Este metodo permite decodificar el user almacenado en el JSON
	 */
	public String getEncryptedUser(String encryptedUsr) {
		byte[] decodedBytes = Base64.decodeBase64(encryptedUsr);
		return new String(decodedBytes);
	}
}
