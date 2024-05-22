package com.apex;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hi");
System.setProperty("webdriver.chrome.driver","C:\\Users\\SATHISH KUMAR S\\Music\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.co.in/");

	}

}
