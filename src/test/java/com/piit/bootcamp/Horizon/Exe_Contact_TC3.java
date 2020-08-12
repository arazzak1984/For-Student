package com.piit.bootcamp.Horizon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Exe_Contact_TC3 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Contact_P1 hit=new Contact_P1(driver);
	  hit.hitContact();
	  Thread.sleep(6000);
	  Contact_P2 num=new Contact_P2(driver);
	  
	  num.dropd(); 
	  
  }
  
  
  
  
  
  
  @BeforeClass
@Parameters("Browser")
  
  public void beforeClass(String Browser) {
	  if(Browser.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.horizonnjhealth.com/");
	  driver.manage().window().maximize();
  }else if(Browser.equalsIgnoreCase("firefox")) {
	  System.setProperty("webdriver.gecko.driver", "C:\\FireFoxDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.horizonnjhealth.com/");
		driver.manage().window().maximize();
	  
  }else {
	  System.out.println("Correct the code");
  }
}
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
