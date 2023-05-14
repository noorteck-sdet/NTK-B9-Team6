package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BereketEx1 {

	public static void main(String[] args) throws InterruptedException {
		// Step 1. set System property
		// 1. Launch chrome browser
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\bruka\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(3000);

		WebElement userNameField = driver.findElement(By.name("username"));
		userNameField.sendKeys("ntk-admin");
		Thread.sleep(3000);

		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(3000);

		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		Thread.sleep(3000);

		WebElement headerTextVerification = driver.findElement(By.tagName("h6"));
		String textStr = headerTextVerification.getText();
		System.out.println("Text:" + textStr);
		Thread.sleep(3000);

		driver.quit();
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