package seleniumTestAutomation.DataMining;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.linkedin.com/";
		String uname = "dipghoshraj@gmail.com";
		String pass = "pragra00";
		String name;
		String place;
		String job;
		String college;
		String email;
		String mobile;
		String emailUnmodified;
		int flag = 0;

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {

			driver.get(url);

			WebElement unameEle = driver.findElement(By.xpath("//input[@name='session_key']"));
			unameEle.sendKeys(uname);

			WebElement passEle = driver.findElement(By.xpath("//input[@name='session_password']"));
			passEle.sendKeys(pass + Keys.ENTER);

			WebElement myNetwork = driver.findElement(By.xpath("//li[@id='mynetwork-nav-item']"));
			myNetwork.click();
			Thread.sleep(5000);

			WebElement connections = driver.findElement(By.xpath("(//div[@id='ember6']/div[6]/div[3]/div/div/div/div/div/aside/div/div/section/div/div/a/div)[1]"));
			connections.click();
			Thread.sleep(5000);

			// Blank workbook
			XSSFWorkbook workbook = new XSSFWorkbook();

			// Create a blank sheet
			XSSFSheet sheet = workbook.createSheet("connection Details");

			Map<Integer, Object[]> data = new TreeMap<Integer, Object[]>();
			// This data needs to be written (Object[])
			data.put(1, new Object[] { "Sl No.", "NAME", "PLACE", "JOB", "COLLEGE", "EMAIL", "MOBILE" });

			for (Integer i = 81; i <= 120; i++) {

				try {
					
					//This will scroll the web page till end.		
			        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			        Thread.sleep(3000);
			        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			        Thread.sleep(3000);
				/*	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					Thread.sleep(3000);
					js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					Thread.sleep(1000);*/
			     // This  will scroll down the page by  1000 pixel vertical		
					
					//  js.executeScript("window.scrollBy(0,500)"); Thread.sleep(1000);
					 
			       
			        
					WebElement element = driver.findElement(By.xpath(
							"//div[@class='authentication-outlet']/div/div/div/div/div/div/div/div/section/ul/li[" + i
									+ "]"));
					element.click();
					Thread.sleep(3000);
				} catch (Exception e) {
					System.out.println("*******contact not found***********");
					e.printStackTrace();
				}

				try {
					name = driver.findElement(By.xpath(
							"(//div[@id='profile-content']/div/div/div/div[2]/div/div/div/section/div[2]/div[2]/div/ul/li)[1]"))
							.getText();

				} catch (Exception e) {
					name = "**not available**";
				}

				try {
					place = driver.findElement(By.xpath(
							"(//div[@id='profile-content']/div/div/div/div[2]/div/div/div/section/div[2]/div[2]/div/ul/li)[4]"))
							.getText();

				} catch (Exception e) {
					place = "**not available**";
				}
				
				  
				  
				  
				  
				  
				try {
					job = driver.findElement(By.xpath(
							"(//div[@id='profile-content']/div/div/div/div[2]/div/div/div/section/div[2]/div[2]/div/ul/li)[7]"))
							.getText();

				} catch (Exception e) {
					job = "**not available**";
				}

				try {
					college = driver.findElement(By.xpath("(//div[@id='profile-content']/div/div/div/div[2]/div/div/div/section/div[2]/div[2]/div/ul/li)[8]")).getText();

				} catch (Exception e) {
					college = "**not available**";
				}
				
				try {
					Thread.sleep(100);
					driver.findElement(By.xpath("(//div[@id='profile-content']/div/div/div/div[2]/div/div/div/section/div[2]/div[2]/div/ul/li/a)[2]")).click();
					Thread.sleep(100);
				}catch(Exception e) {
					flag = 1;
				}
				
				try { 
					
	        		emailUnmodified = driver.findElement(By.xpath("//div[@id='artdeco-modal-outlet']/div/div/div[2]/section/div/div/div/section[@class='pv-contact-info__contact-type ci-email']/div/a")).getAttribute("href");
	        		email = emailUnmodified.replace("mailto:", "");
				  
				  }catch(Exception e) { 
					  email = "**not available**"; 
					//  System.out.println("****" + e.getMessage() + "****");
					//  e.printStackTrace();
				  }
				  
				
				  try {
				  
				  mobile = driver.findElement(By.
				  xpath("//div[@id='artdeco-modal-outlet']/div/div/div[2]/section/div/div[1]/div/section[@class='pv-contact-info__contact-type ci-phone']/ul/li/span[@class='t-14 t-black t-normal']"
				  )).getText();
				  
				  
				  }catch(Exception e) { 
					  mobile = "**not available**"; 
				  }
				 
				  
				  
				  
				/*
				 * Thread.sleep(500); driver.findElement(By.xpath(
				 * "//div[@id='artdeco-modal-outlet']/div/div/button/li-icon")).click();
				 * Thread.sleep(500);
				 */

				  
				System.out.println(i + "  " + name + "|" + email + "|" + mobile);  
				data.put(i + 1, new Object[] { i, name, place, job, college, email, mobile });

				if(flag == 0) {
					driver.navigate().back();
					Thread.sleep(100);
					driver.navigate().back();
					Thread.sleep(1000);
				}
				else if(flag == 1) {
					driver.navigate().back();
					Thread.sleep(1000);
				}
				flag = 0;
				
			//	Thread.sleep(10000);
				
				if(i==40 || i==80 || i==120 || i==160) {
					Thread.sleep(5000);
				}

			}

			// Iterate over data and write to sheet
			Set<Integer> keyset = data.keySet();
			int rownum = 0;
			for (Integer key : keyset) {
				// this creates a new row in the sheet
				Row row = sheet.createRow(rownum++);
				Object[] objArr = data.get(key);
				int cellnum = 0;
				for (Object obj : objArr) {
					// this line creates a cell in the next column of that row
					Cell cell = row.createCell(cellnum++);
					if (obj instanceof String)
						cell.setCellValue((String) obj);
					else if (obj instanceof Integer)
						cell.setCellValue((Integer) obj);
				}
			}
			try {
				// this Writes the workbook data.xlsx
				FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Sayan\\Desktop\\data2.xlsx"));
				workbook.write(out);
				out.close();
				System.out.println("data.xlsx written successfully on disk.");
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			driver.quit();
		}finally {
			driver.quit();
		}

		driver.quit();

	}
}
