import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saleforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:rediff.com");

		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("///input[@id='login1']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("142");
		driver.findElement(By.xpath("///input[@name='proceed']")).click();



	}

}
