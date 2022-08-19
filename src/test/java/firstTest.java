import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver= new ChromeDriver();
     driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface");
     driver.findElement(By.id("userName")).sendKeys("100363051436");
     Thread.sleep(3000);
     driver.findElement(By.id("password")).sendKeys("nihira@12");
     Thread.sleep(3000);
     
     driver.findElement(By.xpath("//*[@id=\"AuthenticationForm\"]/div[4]/div[2]/button/span")).click();
     Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\'btnCloseModal\']")).click();
    driver.manage().window().maximize();
     
	}

}
