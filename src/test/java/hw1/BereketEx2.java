package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BereketEx2 {

	public static void main(String[] args) throws InterruptedException {
		
	// 1. Launch chrome browser
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\bruka\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	// 2. Navigate to https://demo.guru99.com/test/newtours/
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
	// 3. Click REGISTER link
		
		WebElement clickRegisterLink = driver.findElement(By.linkText("REGISTER"));
		clickRegisterLink.click();
		
	// 4. Verify the page title is Mercury Tours
		
		String mercuryTours = driver.getTitle();
		System.out.println("PageTitle:" + mercuryTours);
		
	// 5. Enter first name
		
		WebElement firstNameField = driver.findElement(By.name("firstName"));
		firstNameField.sendKeys("John");
		
	// 6. Enter last name
		
		WebElement lastNameField = driver.findElement(By.name("lastName"));
		lastNameField.sendKeys("Cena");
		
	// 7. Enter phone number
		
		WebElement phoneNumberField = driver.findElement(By.name("phone"));
		phoneNumberField.sendKeys("5105105100");
		
	//	8. Enter email
		
		WebElement emailField = driver.findElement(By.id("userName"));
		emailField.sendKeys("JohnCena@gmail.com");
		
	//	9. Enter address
		
		WebElement addressField = driver.findElement(By.name("address1"));
		addressField.sendKeys("123 Sdet Avenue");
		
	//	10. Enter city
		
		WebElement cityField = driver.findElement(By.name("city"));
		cityField.sendKeys("Las-Vegas");
		
	//	11. Enter state
		
		WebElement stateField = driver.findElement(By.name("state"));
		stateField.sendKeys("Nevada");
		
	//	12. Enter zip code
		
		WebElement zipCodeField = driver.findElement(By.name("postalCode"));
		zipCodeField.sendKeys("89103");

	// 	13. Enter username
		
		WebElement userNameField = driver.findElement(By.id("email"));
		userNameField.sendKeys("JohnCena@gmail.com");
		
	// 	14. Enter password
		
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Selenium@123");

	//	15. Re-Enter password in confirm password field
		
		WebElement confirmPasswordField = driver.findElement(By.name("confirmPassword"));
		confirmPasswordField.sendKeys("Selenium@123");
		
	//  16. Click Submit
		
		WebElement clickSubmitButton = driver.findElement(By.name("submit"));
		clickSubmitButton.click();

	// 	17. Retrieve the confirmation text message and check if the confirmation text message contains
	//			following phrase: Thank you for registering. a. If it does then print TESTCASE PASSED
	//					b. Otherwise print TESTCASE FAILED
		
		WebElement ConfirmationText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td"));
		String  textStr = ConfirmationText.getText();
				
		if(textStr.contains("Thank you for registering.")) {
		System.out.println("TESTCASE PASSED");
		} else {
		System.out.println("TESTCASE FAILED ");
		}
		
	// 18. Close the browser
	
		Thread.sleep(5000);
		driver.quit();
	}
}
/**
Scenario: Register new user in Mercury Tours Page






*/