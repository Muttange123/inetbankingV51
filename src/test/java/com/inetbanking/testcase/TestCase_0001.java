package com.inetbanking.testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.LoginPage;

public class TestCase_0001 extends BaseClass1 {
  @Test
  public void loginTest() throws IOException
  {
	LoginPage lp=new LoginPage(driver);
	lp.setUsername(username);
	logger.info("Entered username");
	
	lp.setPassword(password);
	logger.info("Entered password");
	
	lp.clickSubmit();
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage123"))
	{
	  Assert.assertTrue(true);
	  logger.info("Login test passed");
	}
	else
	{
	  captureScreen(driver, "loginTest");
	  Assert.assertTrue(false);
	  logger.info("Login test failed");
	}
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
