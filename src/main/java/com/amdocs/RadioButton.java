package com.amdocs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		String exePath = "C:\\Selenium\\Firefoxdriver\\FirefoxDriver.exe";
		System.setProperty("webdriver.Firefox.driver", exePath);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();


		/**
		 * Validate isSelected and click
		 */

		WebElement checkBoxSelected = driver.findElement(By.cssSelector("blockquote.Example:nth-child(17) > form:nth-child(1) > input:nth-child(3)"));
		boolean isSelected = checkBoxSelected.isSelected();

		// performing click operation if element is not selected 
		if(isSelected == false) {
			checkBoxSelected.click();
		}

		/**
		 * Validate isDisplayed and click
		 */
		WebElement checkBoxDisplayed = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		boolean isDisplayed = checkBoxDisplayed.isDisplayed();

		// performing click operation if element is displayed
		if (isDisplayed == true) {
			checkBoxDisplayed.click();
		}

		/**
		 * Validate isEnabled and click
		 */
		WebElement checkBoxEnabled = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		boolean isEnabled = checkBoxEnabled.isEnabled();

		// performing click operation if element is enabled
		if (isEnabled == true) {
			checkBoxEnabled.click();
		}



	}

}
