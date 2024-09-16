package Dummy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SeleniumScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Webdriver\\Firefoxdriver\\geckodriver.exe");	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");		
		driver.manage().window().maximize();
		
		//Facebook Login Automation
		
		driver.findElement(By.id("email")).sendKeys("**********");
		driver.findElement(By.name("pass")).sendKeys("********");
		driver.findElement(By.name("login")).click();
		
		
		
		
		
}
}