package com.mhe.qa.testcases;

import org.testng.annotations.Test;

import com.mhe.qa.base.TestBase;
import com.mhe.qa.pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Proctorio_test1 extends TestBase {
  
  static WebDriver driver = null;
  LoginPage loginPage = null;
  
  @BeforeTest
  public void beforeTest() {
	  driver = initialization();
	  loginPage = new LoginPage(driver);
  }
  
  @Test
  public void proctorioTest1() {
	  try {
		  loginPage.launchURL();
		  loginPage.waitForUserName();
		  loginPage.typeEmail();
		  loginPage.typePassword();
		  loginPage.clickSignin();
		  loginPage.navigateToAssignment();
		  loginPage.launchAssignment();
		  Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		driver.quit();
		e.printStackTrace();
	}
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
