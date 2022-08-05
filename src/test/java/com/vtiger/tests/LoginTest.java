package com.vtiger.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;



public class LoginTest extends BaseTest {
	
		
	@Test
	public void verify_login_with_invalid_credentials_TC01()
	{
		String TCname="verify_login_with_invalid_credentials_TC01";
		logger = extent.createTest(TCname);		
		LoginPage lp = new LoginPage(driver,logger);		
		lp.verifyLogo();		
		lp.login(alldata.get(TCname).get("Userid"), alldata.get(TCname).get("password"));
		lp.verifyErrorMsg();				
		extent.flush();
	}
	
	@Test
	public void verify_login_with_valid_credentials_TC02()
	{
		String TCname="verify_login_with_valid_credentials_TC02";
		logger = extent.createTest(TCname);		
		LoginPage lp = new LoginPage(driver,logger);		
		lp.login(alldata.get(TCname).get("Userid"), alldata.get(TCname).get("password"));
		HomePage hp = new HomePage(driver,logger);
		hp.clickLogout();
		extent.flush();
	}
	
	

}
