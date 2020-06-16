import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.id("pw")).sendKeys("hello");
		driver.findElement(By.xpath("pw")).sendKeys("hello");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("pw")).getText();









}
}