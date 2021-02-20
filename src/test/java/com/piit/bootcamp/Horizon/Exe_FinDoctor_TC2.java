package com.piit.bootcamp.Horizon;

import org.testng.annotations.Test;

import com.piit.bootcamp.Horizon.FDoctor_P1;
import com.piit.bootcamp.Horizon.FDoctor_P2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Exe_FinDoctor_TC2 {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  FDoctor_P1 FDP1=new FDoctor_P1(driver);
	  FDP1.FindD();
	  Thread.sleep(8000);
	  
	  FDoctor_P2 sel=new FDoctor_P2(driver);
	  sel.provider();
	  Thread.sleep(6000);
	  sel.planType();
	  Thread.sleep(6000);
	  sel.enterHospital("Hospice");
	  Thread.sleep(6000);
	  sel.enterAdd("Atlantic City");
	  Thread.sleep(6000);
	  sel.enterRadious();
	  Thread.sleep(6000);
	  sel.finButton();
	  
	  
  }
  @BeforeClass
  @Parameters("Browser")
  
  public void beforeClass(String Browser) {
	  if(Browser.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Hard Disk\\\\Driver For Selenium/chromedriver.exe");
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
