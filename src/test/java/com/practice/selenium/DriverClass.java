package com.practice.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverClass {
   WebDriver driver;
   @Test
   public void testMethod(){
      WebDriverManager.chromedriver().setup();
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--remote-allow-origins=*");
      driver = new ChromeDriver(options);
      driver.get("https://www.rediffmail.com");
      driver.manage().window().maximize();
      //WebDriver driver = new ChromeDriver();
   }

   @After
   public void testAfterMethod(){
      driver.close();
   }

}
