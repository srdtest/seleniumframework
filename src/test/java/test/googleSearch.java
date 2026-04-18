package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_test.googlesearch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearch {
	WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		search();
	}
	
	public static void search() {
		
		WebDriverManager.chromedriver().setup();
		//String projpath = System.getProperty("user.dir");
		//System.out.println(projpath);
		//System.setProperty("WebDriver.chrome.driver", projpath+"/driver/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		POM_test.googlesearch.search(driver).sendKeys("Automation step by step");
		POM_test.googlesearch.search(driver).sendKeys(Keys.ENTER);
		POM_test.googlesearch.searchbutton(driver).sendKeys(Keys.RETURN);
		println("this is the change");
	}

}
