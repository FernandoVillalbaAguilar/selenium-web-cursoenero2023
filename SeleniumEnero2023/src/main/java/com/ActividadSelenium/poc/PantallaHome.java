package com.ActividadSelenium.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ActividadSelenium.selenium.ClaseBase;

public class PantallaHome extends ClaseBase {

	public PantallaHome(WebDriver driver) {
		super(driver);
	}

	By imgOrangeHrmHeader = By.xpath("//img[@alt='client brand banner']");
	By imgProfilePicture = By.xpath("//img[@class='oxd-userdropdown-img']");
	By btnAdminMenuBy = By.xpath("//span[text()='Admin']");

	/*
	 * @name: profilePictureisDisplayed
	 * 
	 * @date: 23/Feb/2023
	 * 
	 * @param: N/A
	 * 
	 * @return: isDisplayed(imgProfilePicture)
	 * 
	 * @author: Fernando Villalba Aguilar
	 * 
	 * @description: Este metodo permite verificar si existe el elemento del perfil
	 * cuando está logueado el usuario
	 */
	public boolean profilePictureisDisplayed() {
		waitForElementPresent(imgOrangeHrmHeader);
		return isDisplayed(imgProfilePicture);
	}

	/*
	 * @name: accesAdminMenu
	 * 
	 * @date: 23/Feb/2023
	 * 
	 * @param: N/A
	 * 
	 * @return: N/A
	 * 
	 * @author: Fernando Villalba Aguilar
	 * 
	 * @description: Este metodo da clic en el Menu Admin
	 */
	public void accesAdminMenu() {
		reporterLog("Try acces Menu Admin");
		waitForElementPresent(btnAdminMenuBy);
		click(btnAdminMenuBy);
	}
}
