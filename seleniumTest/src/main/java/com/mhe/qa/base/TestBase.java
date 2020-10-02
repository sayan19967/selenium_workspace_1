package com.mhe.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.mhe.qa.util.TestUtil;

public class TestBase {

	
	static WebDriver driver;
	static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			
			FileInputStream ip = new FileInputStream("D:\\eclipse files\\selenium workspace\\seleniumTest\\src"
					+ "\\main\\java\\com\\mhe\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
//	@SuppressWarnings("deprecation")
	public static WebDriver initialization() {
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\eclipse files\\selenium workspace\\seleniumTest\\lib\\chromedriver.exe");
			
			//this part of code is for adding extensions
			ChromeOptions options = new ChromeOptions();
	        options.addExtensions(new File("D:\\eclipse files\\selenium workspace\\seleniumTest\\extentions\\extension_1_4_20262_1.crx"));

	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			
			driver = new ChromeDriver(capabilities);
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
		
		return driver;
	}
	
}
