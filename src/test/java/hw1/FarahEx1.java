package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FarahEx1 {
	
	public static void main(String[] args) throws InterruptedException {
		
	//1. Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\480gbSSD\\Desktop\\b9_selinium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//2. Navigate to https://ntkhr.noortecktraining.com/web/index.php/auth/logi
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		
		//3. Enter ntk-admin in the username field
		
		WebElement userNameField = driver.findElement(By.name("username"));
		userNameField.sendKeys("ntk-admin");
		Thread.sleep(3000);
		
		//4. Enter Ntk-orange!admin.123 in the password field
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(3000);
		
		//5. Click Login Button
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		
		Thread.sleep(3000);
		//Retrieve the Header Text and Verify the header is Dashboard

		}

		}


/**
Scenario: Login to OrangeHRM application
1. Launch chrome browser
2. Navigate to https://ntkhr.noortecktraining.com/web/index.php/auth/login
3. Enter ntk-admin in the username field
4. Enter Ntk-orange!admin.123 in the password field
5. Click Login Button
6. Retrieve the Header Text and Verify the header is Dashboard
7. Close the browser




*/