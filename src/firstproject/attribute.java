package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class attribute {

	WebDriver driver= new ChromeDriver();
	
	
	
	@BeforeTest
	
	public void mySetup() {
		
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/index.html");
		
		
	}
		
	@Test
	
	public void login() throws InterruptedException {
		
		WebElement UserName= driver.findElement(By.name("username"));
		
		
		
		WebElement Email= driver.findElement(By.xpath("//input[@name='email']"));
		
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		
		UserName.sendKeys("RolaS");
		Email.sendKeys("Rola@gmail.com");
		
		
		password.sendKeys("12345");
		
		
		WebElement login= driver.findElement(By.cssSelector(".l"));
		
		login.click();
		Thread.sleep(2000);
	///	WebElement Login= driver.findElement(By.xpath("/html/body/div/form/input[3]"));
		
	   /// Login.click();
	}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
}
