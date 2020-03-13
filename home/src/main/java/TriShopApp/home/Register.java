package TriShopApp.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Register  {
	WebDriver driver;
	AjaxElementLocatorFactory aelf;
	
	/**
	 * 
	 * @param driver
	 */
	public Register(WebDriver driver) {
		this.driver = driver;
		//will wait for 100 second before time out
		aelf = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(aelf, this);
	}
	
	
	@FindBy(linkText = "Register")
	WebElement RegisterLink;
	
	@FindBy(id = "gender-male")
	WebElement GenderMale;
	@FindBy(id = "gender-female")
	WebElement GenderFemale;
	
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement LastName;	

	@FindBy(css = "input[id='Email']")
	WebElement Email;	

	@FindBy(css = "input[name='Password'][id='Password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement ConfirmPassword;
	
	
	@FindBy(xpath = "//input[@value='Register' and @name='register-button']")
	WebElement RegisterButton;
	
	/*
	 *
		XPATH: //input[@name='login'and @type='submit']
		CSS: input[name='login'][type='submit'] 
	 */
	
	/***
	 * 
	 * @param strArr
	 * @return
	 */
	public boolean regMe(String strArr[]) {
		try {
			RegisterLink.click();
		
		if(strArr[0].equals("Male"))
			GenderMale.click();
		else
			GenderFemale.click();
		
		FirstName.sendKeys(strArr[1]);
		
		LastName.sendKeys(strArr[2]);
		
		Email.sendKeys(strArr[3]);
		
		Password.sendKeys(strArr[4]);
		
		ConfirmPassword.sendKeys(strArr[4]);	
		
		RegisterButton.isSelected();
		return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;	
		}
			
		
	}
	
	}
	
	

