package paremeter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium support\\New folder\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.facebook.com/r.php");
		
		
	}
	@BeforeMethod
	public void test() {
		
		System.out.println("hiiii");
	}
	@Parameters({"url"})
	@Test
	public void valid(String url) {
		System.out.println(url);
		driver.get(url);
		System.out.println("good");
	}

}
