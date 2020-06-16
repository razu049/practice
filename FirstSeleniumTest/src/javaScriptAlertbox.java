import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptAlertbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// i just initialize my name to display name on the popups box
		String text = "Raju";
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Home\\Documents\\Driver\\chromedriver.exe"); WebDriver driver =
		 * new ChromeDriver();
		 * 
		 * driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL in
		 * the browser
		 * 
		 * driver.findElement(By.id("name")).sendKeys(text);
		 * driver.findElement(By.cssSelector("id='alertbtn'"));
		 * 
		 * // if there is any javaScript Alert box and ok button need to use accept
		 * method
		 * 
		 * driver.switchTo().alert().accept();
		 * 
		 * // other javaScript button has ok and cancil button if like to cancil dismiss
		 * 
		 * 
		 * System.out.println(driver.findElement(By.cssSelector("confirmbtn")).getText()
		 * ); Thread.sleep(3000); driver.switchTo().alert().dismiss();
		 */

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(text);

		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());


		// if there is any javaScript Alert box and ok button need to use accept method

		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());

		// if in JavaScript popups box has yes no or ok cancil butoon. and if i need to cancil need to use dismiss methad 
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();



	}

}
