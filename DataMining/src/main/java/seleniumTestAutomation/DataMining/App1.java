package seleniumTestAutomation.DataMining;

import java.io.File;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.matcher.IsNamedMatcher;
/*import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;*/

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// *********************Data mining code from
		// LinkedIn***************************Start
		/*
		 * String url = "https://www.linkedin.com/"; String uname =
		 * "dipghoshraj@gmail.com"; String pass = "pragra00"; String name; String place;
		 * String job; String college; String email; String mobile; String
		 * emailUnmodified;
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\chromedriver_win32\\chromedriver.exe"); WebDriver driver = new
		 * ChromeDriver(); driver.manage().timeouts().implicitlyWait(10,
		 * TimeUnit.SECONDS);
		 * 
		 * try {
		 * 
		 * driver.get(url);
		 * 
		 * WebElement unameEle =
		 * driver.findElement(By.xpath("//input[@name='session_key']"));
		 * unameEle.sendKeys(uname);
		 * 
		 * WebElement passEle =
		 * driver.findElement(By.xpath("//input[@name='session_password']"));
		 * passEle.sendKeys(pass + Keys.ENTER);
		 * 
		 * WebElement myNetwork =
		 * driver.findElement(By.xpath("//li[@id='mynetwork-nav-item']"));
		 * myNetwork.click(); Thread.sleep(5000);
		 * 
		 * WebElement connections = driver.findElement(By.xpath(
		 * "(//div[@id='ember6']/div[6]/div[3]/div/div/div/div/div/aside/div/div/section/div/div/a/div)[1]"
		 * )); connections.click(); Thread.sleep(4000);
		 * 
		 * try { WebElement element = driver.findElement(By.xpath(
		 * "//div[@class='authentication-outlet']/div/div/div/div/div/div/div/div/section/ul/li[3]"
		 * )); element.click(); Thread.sleep(3000); }catch(Exception e) {
		 * System.out.println("*******contact not found***********");
		 * e.printStackTrace(); }
		 * 
		 * try { name = driver.findElement(By.xpath(
		 * "(//div[@id='profile-content']/div/div/div/div[2]/div/div/div/section/div[2]/div[2]/div/ul/li)[1]"
		 * )).getText();
		 * 
		 * }catch(Exception e) { name = "**not available**"; }
		 * 
		 * try { place = driver.findElement(By.xpath(
		 * "(//div[@id='profile-content']/div/div/div/div[2]/div/div/div/section/div[2]/div[2]/div/ul/li)[4]"
		 * )).getText();
		 * 
		 * }catch(Exception e) { place = "**not available**"; }
		 * 
		 * try { job = driver.findElement(By.xpath(
		 * "(//div[@id='profile-content']/div/div/div/div[2]/div/div/div/section/div[2]/div[2]/div/ul/li)[7]"
		 * )).getText();
		 * 
		 * }catch(Exception e) { job = "**not available**"; }
		 * 
		 * try { college = driver.findElement(By.xpath(
		 * "(//div[@id='profile-content']/div/div/div/div[2]/div/div/div/section/div[2]/div[2]/div/ul/li)[8]"
		 * )).getText();
		 * 
		 * }catch(Exception e) { college = "**not available**"; }
		 * 
		 * try { //driver.findElement(By.xpath(
		 * "(//div[@id='profile-content']/div/div/div/div[2]/div/div/div/section/div[2]/div[2]/div/ul/li)[6]"
		 * )).click(); Thread.sleep(100); driver.findElement(By.xpath(
		 * "(//div[@id='profile-content']/div/div/div/div[2]/div/div/div/section/div[2]/div[2]/div/ul/li/a)[2]"
		 * )).click(); Thread.sleep(100);
		 * 
		 * emailUnmodified = driver.findElement(By.
		 * xpath("//div[@id='artdeco-modal-outlet']/div/div/div[2]/section/div/div/div/section[@class='pv-contact-info__contact-type ci-email']/div/a"
		 * )).getAttribute("href"); email = emailUnmodified.replace("mailto:", "");
		 * 
		 * }catch(Exception e) { email = "**not available**"; }
		 * 
		 * try { // driver.findElement(By.xpath(
		 * "(//div[@id='profile-content']/div/div/div/div[2]/div/div/div/section/div[2]/div[2]/div/ul/li)[6]"
		 * )).click(); mobile = driver.findElement(By.
		 * xpath("//div[@id='artdeco-modal-outlet']/div/div/div[2]/section/div/div[1]/div/section[@class='pv-contact-info__contact-type ci-phone']/ul/li/span[@class='t-14 t-black t-normal']"
		 * )).getText();
		 * 
		 * 
		 * }catch(Exception e) { mobile = "**not available**"; }
		 * 
		 * System.out.println(name + "|" + email + "|" + mobile);
		 * 
		 * 
		 * driver.navigate().back(); Thread.sleep(100); driver.navigate().back();
		 * Thread.sleep(3000);
		 * 
		 * }catch(Exception e) { System.out.println(e.getMessage()); driver.quit(); }
		 */
		// *********************Data mining code from
		// LinkedIn*************************** End

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\chromedriver_win32\\chromedriver.exe"); ChromeOptions opt = new
		 * ChromeOptions(); opt.addArguments("--disable-notifications");
		 * 
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * WebDriverWait wait = new WebDriverWait(driver, 20);
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 */

		try {

			/*
			 * driver.get("https://www.sbi.co.in/web/careers"); WebElement postQueryElement
			 * = driver.findElement(By.xpath("//*[contains(text(),' Post Your Query ')]"));
			 * 
			 * js.executeScript("arguments[0].click()", postQueryElement); WebElement submit
			 * = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
			 * 
			 * wait.until(ExpectedConditions.elementToBeClickable(submit));
			 * 
			 * WebElement fullName = driver.findElement(By.xpath("(//input)[2]"));
			 * WebElement emailAddress = driver.findElement(By.xpath("(//input)[3]"));
			 * WebElement DOB = driver.findElement(By.xpath("(//input)[4]")); WebElement
			 * mobileNO = driver.findElement(By.xpath("(//input)[5]")); WebElement
			 * refreshCaptcha =
			 * driver.findElement(By.xpath("//img[@id='refreshPartialCaptcha']"));
			 * fullName.sendKeys("Sayan Halder");
			 * emailAddress.sendKeys("s.halder1996789@gmail.com");
			 * DOB.sendKeys("12/17/1996"); mobileNO.sendKeys("9874563210");
			 * 
			 * Select roles = new Select(driver.findElement(By.xpath("(//select)[1]"))); //
			 * List<WebElement> roles = driver.findElements(By.xpath("(//select)[1]"));
			 * 
			 * roles.selectByValue("Probationary Officer in SBI");
			 * 
			 * // roles.get(1).click(); // Thread.sleep(30000);
			 * 
			 * Thread.sleep(3000); refreshCaptcha.click(); Thread.sleep(3000);
			 */

			
		//	File src = driver.findElement(By.xpath("//img[@id='captchaImg']")).getScreenshotAs(OutputType.FILE);
		//	String path = System.getProperty("user.dir") + "/screenshots/captcha.png";
			 

		//	FileHandler.copy(src, new File(path));
			
			/*
			 * String path =
			 * "D:\\eclipse files\\selenium workspace\\DataMining\\screenshots\\Example-of-PDM-character-extraction-for-the-animated-CAPTCHA-available-on-the-Sandbox.png"
			 * ;
			 * 
			 * ITesseract captcha = new Tesseract();
			 * 
			 * captcha.
			 * setDatapath("D:\\eclipse files\\selenium workspace\\DataMining\\tessdata");
			 * captcha.setLanguage("eng");
			 * 
			 * String captchaText = captcha.doOCR(new File(path));
			 * 
			 * System.out.println("after doing OCR");
			 * 
			 * System.out.println(captchaText);
			 * 
			 * System.out.println("Path of screenshot: " + path);
			 * 
			 * System.out.println("done");
			 */

		//	driver.quit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		//	driver.quit();
		}
		
	//	numberToWords(0);
	//	InputCalculator();
	//	Floor floor = new Floor(12, 10);
	//	Carpet carpet = new Carpet(8);
	//	Calculator cal = new Calculator(floor, carpet);
	//	System.out.println(cal.getTotalCost());
		
		/*
		 * ComplexNumber one = new ComplexNumber(1.0, 1.0); ComplexNumber number = new
		 * ComplexNumber(2.5, -1.5); ComplexNumber temp;
		 * 
		 * one.add(1, 1); System.out.println("one.real = " + one.getReal());
		 * System.out.println("one.imaginary = " + one.getImaginary());
		 * one.subtract(number); System.out.println("one.real = " + one.getReal());
		 * System.out.println("one.imaginary = " + one.getImaginary());
		 * number.subtract(one); System.out.println("number.real = " +
		 * number.getReal()); System.out.println("number.imaginary = " +
		 * number.getImaginary());
		 */
		
		
		
		Point first = new Point(6, 5);
		Point second = new Point(3, 1);
		System.out.println("distance(0,0)= " + first.distance());
		System.out.println("distance(second)= " + first.distance(second));
		System.out.println("distance(2,2)= " + first.distance(2, 2));
		Point point = new Point();
		System.out.println("distance()= " + point.distance());
		
	}
}
	
	/*
	 * static void numberToWords(int number) { if (number<0)
	 * System.out.println("Invalid Value"); int reverse_number= reverse(number); int
	 * additional_zeroes= getDigitCount(number)-getDigitCount(reverse_number);
	 * 
	 * String words=""; if(reverse_number == 0) words = "Zero";
	 * 
	 * while(reverse_number >0) { int i=reverse_number%10; reverse_number/=10;
	 * switch (i) { case 0: words+="Zero ";break; case 1: words+="One ";break; case
	 * 2: words+="Two ";break; case 3: words+="Three ";break; case 4:
	 * words+="Four ";break; case 5: words+="Five ";break; case 6:
	 * words+="Six ";break; case 7: words+="Seven ";break; case 8:
	 * words+="Eight ";break; case 9: words+="Nine ";break;
	 * 
	 * default: break; } }
	 * 
	 * for(int j=0;j<additional_zeroes;j++) {words=words+"zero ";}
	 * System.out.println(words); }
	 */

	/*
	 * static int reverse(int a) { boolean isnegative = false; if (a < 0) {
	 * isnegative = true; a = a * -1; } int b = 0;
	 * 
	 * while (a > 0) { b = b * 10 + (a % 10); a /= 10; } if(isnegative) { return
	 * b*-1; } return b;
	 * 
	 * }
	 */

	/*
	 * static int getDigitCount(int b) { if(b<0) return -1; else if(b == 0) return
	 * 1;
	 * 
	 * int len=0; while(b>0) { b/=10;len++; } return len; }
	 */
	
	/*
	 * static void InputCalculator() {
	 * 
	 * int sum = 0; long avg = 0; Scanner sc = new Scanner(System.in); int n = 0;
	 * ArrayList<Integer> ar = new ArrayList<Integer>(); try {
	 * 
	 * while (true) { n = sc.nextInt(); ar.add(n); }
	 * 
	 * }
	 * 
	 * catch (Exception e) {
	 * 
	 * for (int i = 0; i < ar.size(); i++) {
	 * 
	 * sum = sum + ar.get(i);
	 * 
	 * }
	 * 
	 * if (ar.size() > 0) {
	 * 
	 * avg = Math.round((Double.valueOf(sum) / Double.valueOf(ar.size()))); }
	 * 
	 * System.out.println("SUM=" + sum + " " + "AVG=" + avg);
	 * 
	 * } }
	 */
	
	/*
	 * public static class Floor { private double width = 0; private double length =
	 * 0;
	 * 
	 * public Floor(double length, double width) { if(length < 0) { this.length = 0;
	 * } else if(width < 0) { this.width = 0; } else { this.length = length;
	 * this.width = width; } }
	 * 
	 * public double getArea() { double area = this.length * this.width;; return
	 * area; } }
	 * 
	 * public static class Carpet{ private double cost;
	 * 
	 * public Carpet(double cost) { if(cost < 0) { this.cost = 0; } else { this.cost
	 * = cost; } }
	 * 
	 * public double getCost() { return this.cost; } }
	 * 
	 * public static class Calculator{ private Floor floor; private Carpet carpet;
	 * 
	 * public Calculator(Floor floor, Carpet carpet) { this.floor = floor;
	 * this.carpet = carpet; }
	 * 
	 * public double getTotalCost() { double totalCost = this.floor.getArea() *
	 * this.carpet.getCost(); return totalCost; } }
	 */
	
	//*************************************************************************
	 // User Defined Complex class 
/*
 * class ComplexNumber {
 * 
 * // Declaring variables double real, imaginary; static double resReal = 0,
 * resImaginary = 0;
 * 
 * 
 * // Empty Constructor ComplexNumber() { }
 * 
 * // Constructor to accept // real and imaginary part ComplexNumber(double
 * tempReal, double tempImaginary) { real = tempReal; imaginary = tempImaginary;
 * }
 * 
 * //getter methods public double getReal() { // return this.resReal; return
 * this.real; }
 * 
 * public double getImaginary() { // return this.resImaginary; return
 * this.imaginary; }
 * 
 * // Defining add() method // for adding two complex number void add(double
 * real, double imaginary) { // creating temporary variable // ComplexNumber
 * temp = new ComplexNumber();
 * 
 * // adding real part of complex numbers this.real = real + this.real;
 * 
 * // adding Imaginary part of complex numbers this.imaginary = imaginary +
 * this.imaginary;
 * 
 * // returning the sum // return temp; }
 * 
 * void add(ComplexNumber C1) { // creating temporary variable // ComplexNumber
 * temp = new ComplexNumber();
 * 
 * // adding real part of complex numbers this.real = C1.real + this.real;
 * 
 * // adding Imaginary part of complex numbers this.imaginary = C1.imaginary +
 * this.imaginary;
 * 
 * // returning the sum // return temp; }
 * 
 * // Defining subtract() method // for subtracting two complex number void
 * subtract(double real, double imaginary) { // creating temporary variable //
 * ComplexNumber temp = new ComplexNumber();
 * 
 * // subtracting real part of complex numbers this.real = this.real - real; //
 * this.resReal = real - this.real;
 * 
 * // subtracting Imaginary part of complex numbers this.imaginary =
 * this.imaginary - imaginary; // this.resImaginary = imaginary -
 * this.imaginary;
 * 
 * // returning the difference // return temp; }
 * 
 * void subtract(ComplexNumber C1) { // creating temporary variable //
 * ComplexNumber temp = new ComplexNumber();
 * 
 * // subtracting real part of complex numbers this.real = this.real - C1.real;
 * // this.resReal = C1.real - this.real;
 * 
 * // subtracting Imaginary part of complex numbers this.imaginary =
 * this.imaginary - C1.imaginary; // this.resImaginary = C1.imaginary -
 * this.imaginary;
 * 
 * // returning the difference // return temp; }
 * 
 * // Function for printing complex number void printComplexNumber() {
 * System.out.println("Complex number: " + real + " + " + imaginary + "i"); } }
 */

	class Point{
		private int x, y;
		public Point() {
			
		}
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public void setX(int x) {
			this.x = x;
		}
		public void setY(int y) {
			this.y = y;
		} 
		public int getX() {
			return this.x;
		}
		public int getY() {
			return this.y;
		}
		public double distance() {
			double disValue = 0, disValueSquare = 0;
			disValueSquare = (this.x - 0) * (this.x - 0) + (this.y - 0) * (this.y - 0);
			disValue =  Math.sqrt(disValueSquare);
			return disValue;
		}
		public double distance(int x, int y) {
			double disValue = 0, disValueSquare = 0;
			disValueSquare = (this.x - x) * (this.x - x) + (this.y - y) * (this.y - y);
			disValue =  Math.sqrt(disValueSquare);
			return disValue;
		}
		public double distance(Point p) {
			double disValue = 0, disValueSquare = 0;
			disValueSquare = (this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y);
			disValue =  Math.sqrt(disValueSquare);
			return disValue;
		}
		
	}
	
	

