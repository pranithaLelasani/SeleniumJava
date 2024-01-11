package com.qa.google.testcases;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.google.base.TestBase;
import com.qa.google.pages.GoogleSearchPage;


public class GoogleSearchPageTest extends TestBase{

	GoogleSearchPage searchpage;
	   
	public GoogleSearchPageTest(){
			super();
			
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
			searchpage = new GoogleSearchPage();
	
	}
	
	@Test
    @Parameters("searchTerm")
    public void googleSearchTest(String searchTerm) {
	
 searchpage.LaunchGoogle();
 searchpage.enterTextinSearch(searchTerm);
 String actual =searchpage.getFirstResult();

if(actual.equalsIgnoreCase("java mobiles")) {
	
	System.out.println("test passed");
}

        
    }
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
}
