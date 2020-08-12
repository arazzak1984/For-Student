package com.piit.bootcamp.Horizon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FDoctor_P1 {
	WebDriver driver;
	
	@FindBy(xpath="(//a[text()='FIND A DOCTOR'])[1]")
     WebElement Doctor;
	
	
	public FDoctor_P1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void FindD() {
		Doctor.click();
		
	}
	
	
	
	
	
}
