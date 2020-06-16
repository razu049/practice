import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseIndex extends Demo{

	WebDriver driver = null;
	// note use malformend
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\Documents\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		//return driver1;
	}
	

}
