package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1NasimaAmini {
	public static void main(String[] args) throws InterruptedException {
		
        // Step1
        System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\nasim\\OneDrive\\Desktop\\Selenium-B9\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		// Step2
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		// Step3
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("ntk-admin");
		Thread.sleep(3000);
		
		// Step4
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(3000);
		
		// Step5
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		Thread.sleep(3000);
			
		
		WebElement Dashboard = driver.findElement(By.tagName("h6"));
			
		// Step6
		String  textStr = Dashboard.getText();
		
		if(textStr.equals("Dashboard")) {
			System.out.println("passed");
		} else {
			System.out.println("Not valid");
		}
			
			
			
		// Step6
			
		driver.quit();
		Thread.sleep(5000);


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
