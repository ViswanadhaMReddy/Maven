package com.gmail.Testbase.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	
	public Testbase()
	{
	try {
		prop= new Properties();
		FileInputStream ip = new FileInputStream("F:\\NewEclipse\\Zfinal\\src\\main\\java\\com\\gmail\\config\\qa\\config.properties");
		prop.load(ip);
	}
	 catch (FileNotFoundException e)
	{
		 e.printStackTrace();
	 } 
		 catch(IOException e){
		 e.printStackTrace();
		 }
	catch(NullPointerException e)
	{
		e.printStackTrace();
	}
}

	public static void initilization()
		{
		String browsername = prop.getProperty("broswer");
				if (browsername.equals("chrome"))
				{
					System.setProperty("WebDriver.chrome.driver","F:\\NewEclipse\\Zfinal\\Drivers\\chromedriver.exe");
					driver= new ChromeDriver();
				    logger.info("open the chrome browser");
				}
					else if (browsername.equals("firefox"))
					{
						System.setProperty("WebDriver.gecko.driver","F:\\NewEclipse\\Zfinal\\Drivers\\geckodriver.exe");
						driver= new FirefoxDriver();
						logger.info("open the firefox browser");
					}
					else if (browsername.equals("ie"))
					{
						System.setProperty("WebDriver.ie.driver","F:\\NewEclipse\\Zfinal\\Drivers\\IEDriverServer.exe");
						driver= new InternetExplorerDriver();
						logger.info("open the ie browser");
						
					}
					
					driver.manage().window().maximize();
					logger.info("Maximize the window");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.manage().deleteAllCookies();
					driver.get(prop.getProperty("url"));
					logger.info("open the current url");
					
					
	}
	}
	
					
				
	
			 



		 
	 
	


