package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nikzadhw2 {
	

		
		
		public static void main(String args []) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver", "/Users/mohammadpanahnikzad/Desktop/B9-Selenium/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			
			// Navigate 
			
			driver.get("https://demo.guru99.com/test/newtours/");
			
		
			WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
			registerLink.click();
			Thread.sleep(3000);
			
			//Verify Mercury Tour Page title

			String pageTitle = driver.getTitle();
			System.out.println("Page Title : " + pageTitle);
			Thread.sleep(2000);
			
			// Enter FirstName
			WebElement firstNameField = driver.findElement(By.name("firstName"));
			firstNameField.sendKeys("Mohammad");
			Thread.sleep(2000);
			
			//Enter LastName
			WebElement lastNameField = driver.findElement(By.name("lastName"));
			lastNameField.sendKeys("Nikzad");
			Thread.sleep(2000);
			
			//Enter Phone number
			WebElement phoneNumberField = driver.findElement(By.name("phone"));
			phoneNumberField.sendKeys("70322333");
			Thread.sleep(2000);
			
			// Enter Email 
			WebElement emailAddressField = driver.findElement(By.id("userName"));
			emailAddressField.sendKeys("Nikzad@gmail.com");
			Thread.sleep(2000);
			
			//Enter address
			WebElement addressField = driver.findElement(By.name("address1"));
			addressField.sendKeys("WithFord Square ");
			Thread.sleep(2000);
			
			// Enter City
			WebElement cityField = driver.findElement(By.name("city"));
			cityField.sendKeys("Ashburn");
			Thread.sleep(2000);
			
			//Enter State 
			WebElement stateField = driver.findElement(By.name("state"));
			stateField.sendKeys("VA");
			Thread.sleep(2000);
			
			//Enter ZipCode
			WebElement zipCodeField = driver.findElement(By.name("postalCode"));
			zipCodeField.sendKeys("20147");
			Thread.sleep(2000);
			
			//Enter UserName
			WebElement userNameField = driver.findElement(By.id("email"));
			userNameField.sendKeys("nikzad");
			Thread.sleep(2000);
			
			//Enter Password
			WebElement passwordField = driver.findElement(By.name("password"));
			passwordField.sendKeys("Nikzad222");
			Thread.sleep(2000);
			
			//Confirm Password
			WebElement confirmPasswordField = driver.findElement(By.name("confirmPassword"));
			confirmPasswordField.sendKeys("Nikzad222");
			Thread.sleep(3000);
			Thread.sleep(2000);
			
			//Click Submit
			WebElement submitButton = driver.findElement(By.name("submit"));
			submitButton.click();
			Thread.sleep(2000);
			
			WebElement confirmationText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
			String textStr = confirmationText.getText();

			if (textStr.contains("Thank you for Registering")) {
				System.out.println("TESTCASE PASSED: " + textStr);
			} else {
				System.out.println("TESTCASEFAILED: " + textStr);
			}
			
			//Close Browser 
			driver.quit();
		}



}
