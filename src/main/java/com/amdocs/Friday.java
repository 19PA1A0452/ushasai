package com.amdocs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Friday {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.w3schools.com/java/";
		driver.get(url);
		String title = driver.getTitle();
		int titleLength = driver.getTitle().length();
		System.out.println("Title of the page is:" +title);
		System.out.println("Length of the page is:" +titleLength);
		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(url)) {
			System.out.println("Verification Successfull -The current Url is opened");
			
		}else {
			System.out.println("Verification Failed  An incorrect   Url is opened");
			System.out.println("ActualUrl is:" +actualUrl);
			System.out.println("Expected URL is:"+url);
		}
		String pageSource = driver.getPageSource();
		int pageSourceLength = pageSource.length();
		System.out.println("Total length of the page Source is:"+ pageSourceLength);
		driver.close();
		
	}

}
