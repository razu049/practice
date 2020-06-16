import java.awt.List;
import java.awt.Point;
import java.lang.reflect.Array;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class Ecommerce {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
// if multiple product need to select. we need to use array list
		//String[]names = {"Cucumber","Brocolli"};
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Documents\\Driver\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
			
		//driver.get("https://rahulshettyacademy.com/seleniumPractise/#//");
		
		/*// if multiple product need to select. we need to use array list
		String[] vegies= {"Cucumber","Brocolli"};
		
		WebElement products = driver.findElement(By.cssSelector("h4.product-name"));
		
		for(int i=1; i>30; i++);{	
		Object i;
		String name = products.get(i).getText();
			
		List vegies1= Array.asList(vegies1);
			
			if(name.contains("Cucumber"));{
				
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
			
			//break;
*/			
			// TODO Auto-generated method stub
	

		
		// check this video   https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/16244566#overview
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

			String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};


			driver.get("https://rahulshettyacademy.com/seleniumPractise/");

			Thread.sleep(3000);

			addItems(driver,itemsNeeded);

			}
	public static  void addItems(WebDriver driver,String[] itemsNeeded)

			{

			int j=0;

			List products=(List) driver.findElements(By.cssSelector("h4.product-name"));

			for(String i=0;i<products.size();i++)

			{

			//Brocolli - 1 Kg

			//Brocolli,    1 kg

			String[] name=( products).get(i).getText().split("-");

			String formattedName=name[0].trim();

			//format it to get actual vegetable name

			//convert array into array list for easy search

			//  check whether name you extracted is present in arrayList or not-

			List itemsNeededList = (List) Arrays.asList(itemsNeeded);

			if(itemsNeededList.contains(formattedName))

			{

			j++;

			//click on Add to cart

			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			if(j==itemsNeeded.length)

			{

			break;
			
			}
			}
			}
			}
}
		

	

		
			
			

