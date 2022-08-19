import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// /TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#nav-signin-tooltip > a > span")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ap_email")).sendKeys("9912380769");
		Thread.sleep(3000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ap_password")).sendKeys("Nihira@12");
		Thread.sleep(3000);
		driver.findElement(By.id("signInSubmit")).submit();
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("guitar");
		search.submit();
		List <WebElement> prices = driver.findElements(By.tagName("a-size-base a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal"));
		System.out.println("the total prices are "+ prices);
		
		
	}

}
