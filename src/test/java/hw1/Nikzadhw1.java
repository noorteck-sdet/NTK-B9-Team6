package hw1;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;



	public class Nikzadhw1 {
		
		
			
			public static void main(String args []) throws InterruptedException {
				
				
				System.setProperty("webdriver.chrome.driver", "/Users/mohammadpanahnikzad/Desktop/B9-Selenium/chromedriver");
				
				WebDriver driver = new ChromeDriver();
				
				
				// Navigate 
				driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
				
				
				WebElement userNameField = driver.findElement(By.name("username"));
				userNameField.sendKeys("ntk-admin");
				Thread.sleep(3000);
				
				WebElement passwordField = driver.findElement(By.name("password"));
				passwordField.sendKeys("Ntk-orange!admin.123");
				Thread.sleep(3000);
				
				driver.quit();
				
				WebElement loginButton = driver.findElement(By.tagName("button"));
				loginButton.click();
				Thread.sleep(3000);
				
				WebElement dashboardHeader = driver.findElement(By.tagName("h6"));
				String headerText = dashboardHeader.getText();
				System.out.println("The Header Text is: " + headerText);
				Thread.sleep(3000);
				
				
				driver.quit();
				

}}
