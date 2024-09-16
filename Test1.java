package Dummy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Webdriver\\Firefoxdriver\\geckodriver.exe");	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}




