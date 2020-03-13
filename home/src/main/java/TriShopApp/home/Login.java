package TriShopApp.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Login {


		
		WebDriver driver;
		WebElement txtEmail, txtPassword;
		AjaxElementLocatorFactory aelf;
		boolean testCheck = false;
		
		
		public Login(WebDriver driver) {
			this.driver = driver;
			aelf = new AjaxElementLocatorFactory(driver, 10);
			PageFactory.initElements(aelf, this);
		}
		

		public boolean loginPage( ) {

			return true;
	    	
		}
		
		public boolean gotoLogin() {
			try {	
				
				driver.findElement(By.linkText("Log in")).click();
				System.out.println("Login Page - Complete");
				testCheck = true;
				return testCheck;
			} catch (Exception e) {
		    	 System.out.println(e.getMessage());
		    	 testCheck = false;
		    	 return testCheck;
			}
		  
		}

		
		
		public boolean getEmail(String strEmail) {
			try {	
				txtEmail = driver.findElement(By.xpath("//input[@id='Email']"));
				txtEmail.sendKeys(strEmail);
				System.out.println("Email - Complete");
				testCheck = true;
				return testCheck;
				} catch (Exception e) {
		    	 System.out.println(e.getMessage());
		    	 testCheck = false;	
		    	 return testCheck;
			}
		
		}
		

		
		public boolean getPassword(String strPass) {
			try {	
				txtPassword = driver.findElement(By.xpath("//input[@name='Password']"));
				txtPassword.sendKeys(strPass);
				System.out.println("Password - Complete");
				testCheck = true;
				return testCheck;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				testCheck = false;
				return testCheck;
			}
			
		}

		public boolean submitPage() {
			try {	
					driver.findElement(By.xpath("//input[@value='Log in']")).click();
					System.out.println("Login Button - Complete");
					testCheck = true;
					return true;		  
			} catch (Exception e) {
		    	 System.out.println(e.getMessage());
				testCheck = false;
				return false;
			}

		}
		
		


}
