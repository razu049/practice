import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:spicejet.com");
		
		
		
		
		//Select s = new Select(driver.findElement(By.xpath("//input[@class=\"select_CTXT\"]")));
				// s.deselectByVisibleText(" Amritsar (ATQ)");
				driver.findElement(By.cssSelector("#divpaxinfo")).click();;
				driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
			
				//while loop
		/*
		 * int i =1; while (i<5) {
		 * driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click(); i++;
		 */
					
				// note if there are multiple xpath same you should write xpath like this might work  "//a[@class='signin']")) now if there are 3rd xpath write "//a[@class='signin'])[3]"))
				
				
				//For loop
			for (int i =1; i<5; i++)
			{
							
					
				}
				
		
			
		 }
	}

	
	


