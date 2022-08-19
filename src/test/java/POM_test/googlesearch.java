package POM_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlesearch {
   private static WebElement element = null;
	public static WebElement  search(WebDriver driver) {
		// TODO Auto-generated method stub
   element = driver.findElement(By.name("q"));
   return element;
	}
	public static WebElement searchbutton(WebDriver driver) {
		element = driver.findElement(By.name("btnK"));
		return element;
	}
}
