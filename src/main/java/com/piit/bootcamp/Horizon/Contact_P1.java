package com.piit.bootcamp.Horizon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact_P1 {
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Contact us']")
	WebElement contacButton;
	
	public Contact_P1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void hitContact() {
		contacButton.click();
	}
	
	
	
	

}
