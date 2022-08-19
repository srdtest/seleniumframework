import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("Project path is"+ProjectPath);
		//System.setProperty("webdriver.gecko.driver", ProjectPath+"\\Drivers\\frefox\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", ProjectPath+"\\Drivers\\chrome\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", ProjectPath+"\\Drivers\\ie\\IEDriverServer.exe");
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev");
		Thread.sleep(3000);
		
		driver.close();
	}
}
