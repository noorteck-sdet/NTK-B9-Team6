package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1Alemat {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alema\\Desktop\\Selenium-B9\\chromedriver.exe");
		// 1. Launch chrome browser
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		// maximize the browser
		driver.manage().window().maximize();

		// 2. NAVIGATE
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");

		// 3 Enter user Name

		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("ntk-admin");
		Thread.sleep(3000);
		// 4. Enter password
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Ntk-orange!admin.123");
		// 5. clike login button
		WebElement LoginButton = driver.findElement(By.tagName("button"));
		LoginButton.click();
		Thread.sleep(3000);
		// 6. Retrieve the Header text and verify the headeris Dashboard
		WebElement headerTextVerification = driver.findElement(By.tagName("h6"));

		String textStr = headerTextVerification.getText();
		System.out.println("Text:" + textStr);

		Thread.sleep(3000);
		driver.quit();

	}

}
