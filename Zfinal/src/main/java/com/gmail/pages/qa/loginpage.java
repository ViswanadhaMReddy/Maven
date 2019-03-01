package com.gmail.pages.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.gmail.Testbase.qa.Testbase;

public class loginpage extends Testbase {

			
		@FindBy(name="//input[@name='identifier']")
	     WebElement email;
		
		@FindBy(xpath="//input[@value='Next']")
		WebElement next;
		
		@FindBy(xpath="//div[@class='logo logo-w']")
		WebElement googlelogo;
		
	
	public static  void validateSignInPage()
	{
	 Assert.assertTrue(arg0, arg1);
	}
}
