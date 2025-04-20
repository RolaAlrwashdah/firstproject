package firstproject;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {

	WebDriver driven = new EdgeDriver();

	String THEWEBSITE = "https://www.saucedemo.com/";

	String UserName = "standard_user";
	String Password = "secret_sauce";

	@BeforeTest
	public void mySetUp() {

		driven.manage().window().maximize();
		driven.get(THEWEBSITE);

	}

	@Test(priority = 1)

	public void login() throws InterruptedException {

		WebElement userName = driven.findElement(By.id("user-name"));

		WebElement password = driven.findElement(By.id("password"));

		WebElement login = driven.findElement(By.id("login-button"));

		userName.sendKeys(UserName);
		password.sendKeys(Password);

		login.click();

	}

	@Test(priority = 2)

	public void addAllItem() throws InterruptedException {
     
	List<WebElement>AddAllToCart=	driven.findElements(By.className("btn"));
	
	for(int i=0;i<AddAllToCart.size();i++) {
		AddAllToCart.get(i).click();
		
	}
	
	}

	@Test(priority = 3,enabled=false)

	public void removeAllItem() throws InterruptedException {
		
	Thread.sleep(2000);	
	List<WebElement> removeAll=driven.findElements(By.className("btn_secondary"));
	
	
	for(int i=0;i<removeAll.size();i++) {
		
		removeAll.get(i).click();
		
		
	}

	}
    
	@Test(priority=4)
	public void printText() {
	
		List<WebElement>getText=driven.findElements(By.className("inventory_item_name"));
		
		
		
		for(int i=0;i<getText.size();i++) {
			String ItemName = getText.get(i).getText();
			
			if(ItemName.charAt(ItemName.length()-1)=='t') {
				
            continue;

				
			}
		 
			System.out.println();
		
		}
		}
		
	
	@Test(priority = 5,enabled = false)

	public void Logout() throws InterruptedException {

		WebElement burgerMunue = driven.findElement(By.id("react-burger-menu-btn"));
		burgerMunue.click();

		Thread.sleep(1000);

		WebElement logout = driven.findElement(By.id("logout_sidebar_link"));
		logout.click();
		
		
		WebElement logo= driven.findElement(By.className("login_logo"));
		
		System.out.println(logo.getText());
		
       WebElement pass= driven.findElement(By.id("login_credentials"));
       
       System.out.println(pass.getText());
	}

	@AfterTest

	public void afterTest() {

		// driven.quit();
	}

}
