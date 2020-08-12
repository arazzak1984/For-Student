package com.piit.bootcamp.Horizon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page2 {
	WebDriver driver;
	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="dijit_form_Button_0_label")
	WebElement SignIn;
	
	public Login_Page2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
			
		public void enterUser(String UserN ) {
			UserName.sendKeys(UserN);
			
		}
		
		public void enterPass(String Pass) {
			Password.sendKeys(Pass);
		}
	
		public void sign() {
			SignIn.click();
		}

}
