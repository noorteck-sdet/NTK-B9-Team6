package hw.Nikzad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWNikzad {
	
	public static void main(String args []) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "/Users/mohammadpanahnikzad/Desktop/B9-Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/dashboard/index");
		Thread.sleep(3000);
		
		WebElement userNameField = driver.findElement(By.name("username"));
		userNameField.sendKeys("ntk-admin");
		
		WebElement passwodField = driver.findElement(By.name("password"));
		passwodField.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(3000);
		
		WebElement loginField = driver.findElement(By.tagName("Button"));
		loginField.click();
		Thread.sleep(3000);
		
		WebElement headerVarification = driver.findElement(By.tagName("h6"));
		String vfText = headerVarification.getText();
		System.out.println(vfText);
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
	}

}


