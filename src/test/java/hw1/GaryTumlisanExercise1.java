package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaryTumlisanExercise1 {
	
	public static void main(String[] args) throws InterruptedException {
		
	/** 1. Launch chrome browser */
		
		// set System property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();	
		
		/** 2. Navigate to https://ntkhr.noortecktraining.com/web/index.php/auth/login */
		
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		
		/** 3. Enter ntk-admin in the username field */	
		
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("ntk-admin");
		Thread.sleep(3000);
		
		/** 4. Enter Ntk-orange!admin.123 in the password field */
		
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(3000);
		
		/** 5. Click Login Button */
		
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		Thread.sleep(3000);
		
		/** 6. Retrieve the Header Text and Verify the header is Dashboard */
		
		WebElement headerDashboard = driver.findElement(By.tagName("h6"));
		String headerText = headerDashboard.getText();
		System.out.println("The Header Text is: " + headerText);
		Thread.sleep(3000);
		
		/** 7. Close the browser */
		
		driver.quit();
		
	}

}
