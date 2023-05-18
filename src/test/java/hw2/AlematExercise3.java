package hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlematExercise3 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		// 8. Launch chrome browser
		   // 9. Navigate to https://demo.nopcommerce.com/
		 //
		
		String url = "https://demo.nopcommerce.com/";
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// 10. Click Register Link */
		WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
		registerLink.click();
		
		// 11. Verify the page title is nopCommerce demo store. Register */
		
		 String pageTitle = driver.getTitle();
		 System.out.println("page title: " + pageTitle);
		 
		 // 12. Fill out Your Personal Details Section
		  		//		a. Gender
				//		b. First name
				//		c. Last name
				//		d. Date of birth
				//		e. Email

		   //
		WebElement radioGender  = driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
		radioGender.click();
		
		WebElement firstNameField  = driver.findElement(By.xpath(" /html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[2]/input"));
		firstNameField.sendKeys("Alemat");
		
		WebElement lastNameField  = driver.findElement(By.xpath("//input[contains(@data-val-required, 'Last ')]"));
		lastNameField.sendKeys("G");
		
		
		WebElement dobDay  = driver.findElement(By.name("DateOfBirthDay"));
		Select select = new Select(dobDay);
		select.selectByVisibleText("1");
		
		WebElement dobMonth  = driver.findElement(By.name("DateOfBirthMonth"));
		Select select1 = new Select(dobMonth);
		select1.selectByVisibleText("MAY");
		 
		WebElement dobYear  = driver.findElement(By.name("DateOfBirthYear"));
		Select select3 = new Select(dobYear);
		select3.selectByValue("1990");
		
		WebElement emailField  = driver.findElement(By.xpath("//input[starts-with(@data-val-email,'Wrong')]"));
		emailField.sendKeys("email321@gmail.com");
		
		// 13. Enter Company name */
		
		WebElement companyField  = driver.findElement(By.id("Company"));
		companyField.sendKeys("NoorTeck");
		Thread.sleep(3000);
		
		// 14. Uncheck Newsletter checkbox */
		
		WebElement newsLetterButton  = driver.findElement(By.id("Newsletter"));
		newsLetterButton.click();
		
		// 15. Enter password */
		WebElement passwordField  = driver.findElement(By.id("Password"));
		passwordField.sendKeys("563456789");
		
		// 16. Confirm Password */
		WebElement confirmPassworField  = driver.findElement(By.id("ConfirmPassword"));
		confirmPassworField.sendKeys("563456789");
		
		// 17. Click register button */
		WebElement registerButton  = driver.findElement(By.id("register-button"));
		registerButton.click();
		
		// 18. Retrieve the confirmation text message and check if the confirmation text 
		 //message equals to Your registration completed!!!
			//		a. If it does then print TESTCASE PASSED
				//	b. Otherwise print�TESTCASE�FAILED
		//
		WebElement textMessage = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
		String text = textMessage.getText();
		
		if(text.equals("Your registration completed")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE�FAILED");
		}
		
		Thread.sleep(3000);
		driver.quit();
		 
		//Automation completed
		

	}

}


	