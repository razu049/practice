import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class multipleWindows {



	public static void main(String[] args) {
		// TODO Auto-generated method stub




		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Home\\Documents\\Driver\\chromedriver.exe"); WebDriver driver
		 * =new ChromeDriver();
		 * 
		 * 
		 * //WebDriver driver =new FirefoxDriver();
		 * driver.get("https://account.google.com/signup");
		 * driver.findElement(By.xpath("html/body/dv[1]/div[2]/div/[1]/p/a")).click();
		 */


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");

	driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		Set<String> abc=driver.getWindowHandles();
		java.util.Iterator<String> it=abc.iterator();
		String parentWindow=it.next();
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

     driver.quit();

	}


}


