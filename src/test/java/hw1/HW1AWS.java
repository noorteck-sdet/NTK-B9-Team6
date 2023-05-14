package hw1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1AWS {
	
	
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","/Users/awsbasiya/Desktop/Selenium-B9/chromedriver");


			//1.Launch chrome browser
			
			WebDriver driver = new ChromeDriver();
			
			//2.NAVIGATE 
			
			driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
			Thread.sleep(3000);
			//3.Enter user name
			
			WebElement usernameField = driver.findElement(By.name("username"));
			usernameField.sendKeys("ntk-admin");
			Thread.sleep(3000);
			
			//4.Enter password
			
			WebElement passwordField = driver.findElement(By.name("password"));
			passwordField.sendKeys("Ntk-orange!admin.123");
			
			Thread.sleep(3000);
			//5.click login button
			
			WebElement Login = driver.findElement(By.tagName("Button"));
			Login.click();
			
			Thread.sleep(3000);
			
			//6.Retrieve the Header Text and Verify the header is Dashboard
			
	        WebElement headerTextVerification = driver.findElement(By.tagName("h6 "));
			
	        String  textStr = headerTextVerification .getText();
			
			System.out.println("Text: "+ textStr);
				
			
			Thread.sleep(5000);
			driver.quit();

	}
	}


