package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaryTumlisanExercise2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	/** 1. Launch chrome browser */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		/** 2. Navigate to https://demo.guru99.com/test/newtours/ */
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		/** 3. Click REGISTER link */
		
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		registerLink.click();
		Thread.sleep(3000);
		
		/** 4. Verify the page title is Mercury Tours */

		String pageTitle = driver.getTitle();
		System.out.println("Title Page: " + pageTitle);
		
		/** 5. Enter first name */
		WebElement firstNameField = driver.findElement(By.name("firstName"));
		firstNameField.sendKeys("Jhon");
		
		/** 6. Enter last name */
		WebElement lastNameField = driver.findElement(By.name("lastName"));
		lastNameField.sendKeys("Cena");
		
		/** 7. Enter phone number */
		WebElement phoneNumberField = driver.findElement(By.name("phone"));
		phoneNumberField.sendKeys("303-564-7895");
		
		/** 8. Enter email */
		WebElement emailAddressField = driver.findElement(By.id("userName"));
		emailAddressField.sendKeys("Java2023@gmail.com");
		
		/** 9. Enter address */
		WebElement addressField = driver.findElement(By.name("address1"));
		addressField.sendKeys("456 12th Street");
		
		/** 10. Enter city */
		WebElement cityField = driver.findElement(By.name("city"));
		cityField.sendKeys("Dallas");
		
		/** 11. Enter state */
		WebElement stateField = driver.findElement(By.name("state"));
		stateField.sendKeys("TX");
		
		/** 12. Enter zip code */
		WebElement zipCodeField = driver.findElement(By.name("postalCode"));
		zipCodeField.sendKeys("58185");
		
		/** 13. Enter username */
		WebElement userNameField = driver.findElement(By.id("email"));
		userNameField.sendKeys("Java2023@gmail.com");
		
		/** 14. Enter password */
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Gary@2023");
		
		/** 15. Re-Enter password in confirm password field */
		WebElement confirmPasswordField = driver.findElement(By.name("confirmPassword"));
		confirmPasswordField.sendKeys("Gary@2023");
		Thread.sleep(3000);
		
		/** 16. Click Submit */
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
		
		/**
		 	17. Retrieve the confirmation text message and check if the confirmation text message contains
				following phrase: Thank you for registering.
						a. If it does then print TESTCASE PASSED
						b. Otherwise print TESTCASE FAILED
		 */
		WebElement confirmationText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
		String textStr = confirmationText.getText();

		if (textStr.contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED: The text message is: " + textStr);
		} else {
			System.out.println("TESTCASE FAILED: The text message is: " + textStr);
		}
		
		/** 18. Close the browser */
		driver.quit();
	}

}
