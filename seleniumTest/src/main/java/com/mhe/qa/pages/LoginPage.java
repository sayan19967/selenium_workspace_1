package com.mhe.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mhe.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	WebDriver driver = null;
	WebDriverWait wait = null; 
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void launchURL() throws InterruptedException {
		String url;
		url = "https://connectqastg.mheducation.com";
	//	url = "https://chrome.google.com/webstore/detail/proctorio/fpmapakogndmenjcfoajifaaonnkpkei";
		driver.get(url);
		Thread.sleep(5000);
	}
	
	public void waitForUserName() {
		driver.switchTo().frame(0);
	//	System.out.println("11111111111111");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	//	System.out.println("2222222222222222");
		wait = new WebDriverWait(this.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(username));
	}
	
	public void typeEmail() {
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("gaurav.ins@mheqa.com");
	}
	
	public void typePassword() {
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Qa@123456");
	}
	
	public void clickSignin() {
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}
	
	public void navigateToAssignment() {
		WebElement menuButton = driver.findElement(By.xpath("//*[@class='menu-icon ']"));
		wait = new WebDriverWait(this.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(menuButton));
		menuButton.click();
		
		WebElement classesButton = driver.findElement(By.xpath("//*[@class='menu-panel ']/ul/li[4]"));
		wait = new WebDriverWait(this.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(classesButton));
		classesButton.click();
		
		WebElement sectionName =  driver.findElement(By.xpath("//*[@class='menu-panel ']/ul/li[4]/ul/li[1]"));
		wait = new WebDriverWait(this.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sectionName));
		sectionName.click();
	}
	
	public void launchAssignment() {
		WebElement assignment = driver.findElement(By.xpath("//*[@aria-label='launch Proctoring Enabled: Native Questions']"));
		wait = new WebDriverWait(this.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(assignment));
		assignment.click();
		
		WebElement beginOrContinue = driver.findElement(By.xpath("//*[text()='Continue' or text()= 'Begin']"));
		wait = new WebDriverWait(this.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(beginOrContinue));
		beginOrContinue.click();
		
		WebElement proctorioContinueButton = driver.findElement(By.xpath("//*[text()='Continue']"));
		wait = new WebDriverWait(this.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(proctorioContinueButton));
		proctorioContinueButton.click();
	}
	
	
}
