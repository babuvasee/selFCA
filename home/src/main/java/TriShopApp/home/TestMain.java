package TriShopApp.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Test Main Class
 *
 */
public class TestMain 
{
	static WebDriver driver;
	

  
  public static void init() {
	  	// Initiating the Driver
	  	System.setProperty("webdriver.chrome.driver","C:\\Learn\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// Web Page to Be Loaded
		 String baseUrl = "http://demowebshop.tricentis.com/";
		  //  String expectedTitle = "Demo Web Shop";
		    //String actualTitle = "";
		    driver.get(baseUrl);
  }
  
  
  public static void main(String str[]) {
	  init();
	  Register reg = new Register(driver);
	  String strArr[] = {"Male", "One", "Two", "wlpvs1@gmail.com", "Test123"};
	  if (reg.regMe(strArr))
		  System.out.println("Test passed");
  }
  
   
}
