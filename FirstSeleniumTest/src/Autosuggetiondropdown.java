import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggetiondropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // Auto dropdown
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/label/p/span")).clear();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/label/p/span")).sendKeys("MUM");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/label/p/span")).sendKeys(Keys.ENTER);
		
		// we can write webelemnt to short this same expaths
		//https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/13022960#overview 
		
		
		WebElement raju = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/label/p/span"));
		raju.clear();
		raju.sendKeys("MUM");
		raju.sendKeys(Keys.ENTER);
		
		// arro down uption is keys. AROOW DOWN
		
	}

}