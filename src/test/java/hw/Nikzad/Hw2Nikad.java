package hw.Nikzad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2Nikad {
	
	public static void main(String args []) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadpanahnikzad/Desktop/B9-Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		registerLink.click();
		Thread.sleep(3000);
		
		String MecuryTours = driver.getTitle();
		System.out.println("MercuryTours"+ MecuryTours);
		
		WebElement firstNameField = driver.findElement(By.name("firstName"));
		firstNameField.sendKeys("Mohammad");
		   Thread.sleep(3000);
		   
		
		  WebElement lastNameField = driver.findElement(By.name("lastName"));
	        lastNameField.sendKeys("Nikzad");
	        Thread.sleep(3000);

	       
	        WebElement phoneField = driver.findElement(By.name("phone"));
	        phoneField.sendKeys("703223");
	        Thread.sleep(3000);

	       
	        WebElement emailField = driver.findElement(By.id("userName"));
	        emailField.sendKeys("nikzad@gmail.com");
	        Thread.sleep(3000);

	    
	        WebElement address = driver.findElement(By.name("address1"));
	        address.sendKeys("4440 Whitford Sqaure");
	        Thread.sleep(3000);

	
	        WebElement city = driver.findElement(By.name("city"));
	        city.sendKeys("Ashburn");
	        Thread.sleep(3000);

	      
	        WebElement state = driver.findElement(By.name("state"));
	        state.sendKeys("Virginia");
	        Thread.sleep(3000);

	      
	        WebElement zipCode = driver.findElement(By.name("postalCode"));
	        zipCode.sendKeys("20147");
	        Thread.sleep(3000);

	       
	        WebElement username = driver.findElement(By.id("email"));
	        username.sendKeys("Nikzad");
	        Thread.sleep(3000);

	 
	        WebElement password = driver.findElement(By.name("password"));
	        password.sendKeys("Panjshiry");
	        Thread.sleep(3000);

	      
	        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
	        confirmPassword.sendKeys("Panjshiry");
	        Thread.sleep(3000);

	
	        WebElement submitButton = driver.findElement(By.name("submit"));
	        submitButton.click();
	        Thread.sleep(3000);

	        
	        WebElement confirmationMessage = driver.findElement(By.partialLinkText("Thank you for Registering"));
	        
	        if (confirmationMessage.getText().contains("Thank you for registering.")) {
	        	
	            System.out.println("TestCase PASSED");
	        } else {
	            System.out.println("TestCase FAILED");
	            
	           
	           
	            
	        }

	       
	        Thread.sleep(5000);
	        driver.quit();
		
		
		
		
		

}
}