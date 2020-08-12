package com.piit.bootcamp.Horizon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Contact_P2 {
	WebDriver driver;
	
	@FindBy(id="contact_audience")
	WebElement list;
	
	public Contact_P2(WebDriver driver) {
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	public void dropd() {
		list.click();
		
		Select dd=new Select(driver.findElement(By.id("contact_audience")));
	dd.selectByVisibleText("News Media Contacts");
	
	
	}
	
	
	

}
