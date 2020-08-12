package com.piit.bootcamp.Horizon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page1 {
	WebDriver driver;
	
	@FindBy(xpath="(//a[text()='MEMBER SIGN IN'])[1]")
	WebElement MembersSignIn;
	
	
	
	public Login_Page1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		public void loginMember() {
			MembersSignIn.click();	
			
	}
		
	
	

}
