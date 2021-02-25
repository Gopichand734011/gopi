package Webdriverexmp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_verify {
	public static String un = "admin";
	public static String pw = "admin";
	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		if(driver.getTitle().equals("OrangeHrm-New Level of Hr Management")) {
			System.out.println("Title Matched");
		
		}
		
		else {
			System.out.println("Title not matched and expected title is "+driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pw);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.quit();
	}

}
