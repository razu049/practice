import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// count using size.

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// this is the count so we use findelements  plural and tag name start from a which is anchor
		//driver.findElements(By.tagName("a")).size();


		// we just print how many links . we can use for any thing counts
		System.out.println(driver.findElements(By.tagName("a")).size());

		// lets find footer section count


		System.out.println(driver.findElements(By.id("gf-BIG")).size());


		// if i write footer driver for anchor  <a href>

		WebElement footerdriver  = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());


		// link checking Testing


		for( int i = 0;i<driver.findElements(By.tagName("a")).size();i++){


			// key boad combinatin to click right or hold shift or hold ctrl  now using control key for new windows

			String clickon = Keys.chord(Keys.CONTROL ,Keys.ENTER);

			driver.findElements(By.tagName("a").get(i).senKeys(clickon));


		}

		Set <String> abc = driver.getWindowHandles(); // there should be 4 windows opens
		Iterator<String> it = abc.iterator(); // which is loop back to 0 index


		// while loop and it.next opens next index or windows 
		while(it.hasNext());{

			//  this peace of code get text each open windows 
			driver.switchTo().window(it.hasNext());
			System.out.println(driver.getTitle());

		}


	}

}
