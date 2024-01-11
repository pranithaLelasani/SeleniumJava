package com.qa.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.google.base.TestBase;

public class GoogleSearchPage extends TestBase {
	@FindBy(name="q")
	WebElement search;
	
	@FindBy(name="btnK")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[contains(text(),'mobiles')]")
	WebElement firstResult;
	
	public GoogleSearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void LaunchGoogle() {
		
		driver.get("https://www.google.com/");
	}
	
	
	public void clickOnSearch() {
			
		loginBtn.click();
	}
	
	public void enterTextinSearch(String searchTerm) {
		
		search.sendKeys(searchTerm);
		
	}
	
	public String getFirstResult() {
		
     String actual = firstResult.getText();	

      return actual;
		
	}
}