package com.amdocs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommands {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String appUrl ="https://www.google.com/search?client=firefox-b-d&q=w3+schools";
		driver.get(appUrl);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[9]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to(appUrl);
		driver.navigate().refresh();
		driver.close();
	}

}
