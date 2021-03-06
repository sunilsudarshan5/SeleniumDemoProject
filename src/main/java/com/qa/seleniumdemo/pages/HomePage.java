package com.qa.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void homepageText() {
		System.out.println("Home Page");
	}
	
}
