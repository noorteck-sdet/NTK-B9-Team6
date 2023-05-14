package hw1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2AWS {
	
		
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","/Users/awsbasiya/Desktop/Selenium-B9/chromedriver");
		        
			// Step 1: Launch chrome browser
			
		        WebDriver driver = new ChromeDriver();

		        // Step 2: Navigate to https://demo.guru99.com/test/newtours/
		        driver.get("https://demo.guru99.com/test/newtours/");

		        // Step 3: Click REGISTER link
		        WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		        registerLink.click();
		        Thread.sleep(3000);

		        // Step 4: Verify the page title is Mercury Tours
		        String MercuryTours = driver.getTitle();

				System.out.println("PageTitle:" + MercuryTours );

		        // Step 5: Enter first name
		        WebElement firstName = driver.findElement(By.name("firstName"));
		        firstName.sendKeys("AWS");
		        Thread.sleep(3000);

		        // Step 6: Enter last name
		        WebElement lastName = driver.findElement(By.name("lastName"));
		        lastName.sendKeys("BASIYA");
		        Thread.sleep(3000);

		        // Step 7: Enter phone number
		        WebElement phone = driver.findElement(By.name("phone"));
		        phone.sendKeys("1234567890");
		        Thread.sleep(3000);

		        // Step 8: Enter email
		        WebElement email = driver.findElement(By.id("userName"));
		        email.sendKeys("AWS.B@gmail.com");
		        Thread.sleep(3000);

		        // Step 9: Enter address
		        WebElement address = driver.findElement(By.name("address1"));
		        address.sendKeys("123 Main St");
		        Thread.sleep(3000);

		        // Step 10: Enter city
		        WebElement city = driver.findElement(By.name("city"));
		        city.sendKeys("TOWSON");
		        Thread.sleep(3000);

		        // Step 11: Enter state
		        WebElement state = driver.findElement(By.name("state"));
		        state.sendKeys("MD");
		        Thread.sleep(3000);

		        // Step 12: Enter zip code
		        WebElement zipCode = driver.findElement(By.name("postalCode"));
		        zipCode.sendKeys("10001");
		        Thread.sleep(3000);

		        // Step 13: Enter username
		        WebElement username = driver.findElement(By.id("email"));
		        username.sendKeys("AWSB");
		        Thread.sleep(3000);

		        // Step 14: Enter password   
		        WebElement password = driver.findElement(By.name("password"));
		        password.sendKeys("password123");
		        Thread.sleep(3000);

		        // Step 15: Re-Enter password in confirm password field
		        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		        confirmPassword.sendKeys("password123");
		        Thread.sleep(3000);

		        // Step 16: Click Submit
		        WebElement submitButton = driver.findElement(By.name("submit"));
		        submitButton.click();
		        Thread.sleep(3000);

		        // Step 17: Retrieve the confirmation text message and check if the confirmation text message contains following phrase: Thank you for registering.
		        WebElement confirmationMessage = driver.findElement(By.partialLinkText("Thank you for registering"));
		        
		        if (confirmationMessage.getText().contains("Thank you for registering.")) {
		        	
		            System.out.println("Test case PASSED");
		        } else {
		            System.out.println("Test case FAILED");
		        }

		        // Step 18: Close the browser
		        Thread.sleep(5000);
		        driver.quit();
		    }
		}




