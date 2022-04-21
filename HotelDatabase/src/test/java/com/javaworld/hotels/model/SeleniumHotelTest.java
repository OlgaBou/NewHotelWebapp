package com.javaworld.hotels.model;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SeleniumHotelTest {
	WebDriver driver;

	@Before

	public void setup() throws Exception {

		// Initialisation du driver
		System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/geckodriver.exe");
		driver = (WebDriver) new FirefoxDriver();

		// aller sur le site du challenge
		driver.get("URL");
		driver.manage().window().maximize();

	}

	@After

	public void teardown() {
		driver.quit();
	}

	
}

