package Dummy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SeleniumScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Webdriver\\Firefoxdriver\\geckodriver.exe");	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
