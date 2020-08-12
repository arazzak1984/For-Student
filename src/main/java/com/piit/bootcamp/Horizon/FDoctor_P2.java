package com.piit.bootcamp.Horizon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FDoctor_P2 {
	WebDriver driver;
	
	@FindBy(id="edit-provider-type-list")
	WebElement ProType;
	
	@FindBy(id="edit-plan-list")
	WebElement Plan;
	
	@FindBy(id="search_text_box_h")
	WebElement HopitalName;
	
	@FindBy(id="address")
	WebElement Addres;
	
	@FindBy(id="filter-radius")
	WebElement LocationRad;
	
	@FindBy(id="edit-submit")
	WebElement Submit;
	
	
	
	public FDoctor_P2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void provider() {
		ProType.click();
		Select dd=new Select(driver.findElement(By.id("edit-provider-type-list")));
		dd.selectByVisibleText("Hospital");
	}
	
	public void planType() {
		Plan.click();
		Select dd2=new Select(driver.findElement(By.id("edit-plan-list")));
		dd2.selectByVisibleText("Horizon NJ Health");
	}
	
	public void enterHospital(String Nam) {
		HopitalName.sendKeys(Nam);
		WebElement we=driver.findElement(By.id("search_text_box_h"));
		we.sendKeys(Keys.ARROW_DOWN);
		we.sendKeys(Keys.ENTER);	
	}
	
	public void enterAdd(String addName) {
		Addres.sendKeys(addName);	
	}
	
	public void enterRadious() {
		LocationRad.click();
		Select dd3=new Select(driver.findElement(By.id("filter-radius")));
		dd3.selectByVisibleText("Within 25 Miles");
	}
	public void finButton() {
		Submit.click();	
	}

}
