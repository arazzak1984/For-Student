package com.piit.bootcamp.Horizon;

import org.testng.annotations.Test;

import com.piit.bootcamp.Horizon.Login_Page1;
import com.piit.bootcamp.Horizon.Login_Page2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Execution_HorizonNJ_TC1 {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  Login_Page1 P1=new Login_Page1(driver);
	  P1.loginMember();
	  Thread.sleep(30000);
	  Login_Page2 P2=new Login_Page2(driver);
	  P2.enterUser("pnt");
	  P2.enterPass("456789");
	  //P2.sign();
	
	  //Sumon khan
	  
	  
	  
  }
  @BeforeClass
@Parameters("Browser")
  
  public void beforeClass(String Browser) {
	  if(Browser.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Hard Disk\\Driver For Selenium/chromedriver.exe");
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
