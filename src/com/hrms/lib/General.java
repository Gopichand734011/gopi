package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.utility.Log;

public class General extends Global {
	public void openapplication() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
	
	}
   public void closebrowser() {
	   driver.quit();
   }
   public void login()throws Exception{
	  driver.findElement(By.name(txt_loginname)).sendKeys(un);
	   driver.findElement(By.name(txt_password)).sendKeys(pw);
	   driver.findElement(By.name(btn_login)).click();
	   Thread.sleep(3000);
	   Reporter.log("Login completed");
	   Log.info("Login completed");
	 }
   public void logout() {
	   driver.findElement(By.linkText(link_logout)).click();
	   System.out.println("logout completed");
	   Reporter.log("logout completed");
	   Log.info("Logout completed");
 }
   public void addemp(){
	   System.out.println("adding new emp");
	   Reporter.log("adding new emp");
	   Log.info("Add newemp");
	 
   }
   public void delemp() {
	   System.out.println("deleting new emp");
	   Reporter.log("deleting new emp");
	   Log.info("del new emp");
	   
	    }

}

