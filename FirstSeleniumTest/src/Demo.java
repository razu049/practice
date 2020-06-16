import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Demo {

	public static  WebDriver Capabilities() {
		// TODO Auto-generated method stub

	WebDriver driver=null;
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\Documents\\Driver\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		 driver.get("http://google.com");
		 System.out.println(" Titel is " +driver.getTitle());
		 driver.get("http://yahoo.com");
		 driver.navigate().back(); // back to google.com
		 
		 driver.getCurrentUrl();
		return driver;
		 
		 
		// driver.close();
		 

	}

}
