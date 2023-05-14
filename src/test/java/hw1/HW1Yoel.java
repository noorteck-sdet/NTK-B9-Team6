package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Yoel {
public static void main(String[] args) throws InterruptedException {
	//step 1. set system property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yoel\\Desktop\\Selenium-b9\\chromedriver.exe");
		
	
		// step2. create an object of webdriver
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("ntk-admin");
		
		Thread.sleep(3000);
		
		//password
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys("Ntk-orange!admin.123");
		
		Thread.sleep(3000);
		

		WebElement login= driver.findElement(By.tagName("button"));
		login.click();
		
		Thread.sleep(3000);
		
		WebElement dashboardHeader= driver.findElement(By.linkText("Dashboard"));
		String Header=dashboardHeader.getText();
		System.out.println("Text:" + Header);
		dashboardHeader.click();
	Thread.sleep(3000);
		
		driver.quit();
		
}
}
