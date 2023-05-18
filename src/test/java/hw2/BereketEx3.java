package hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BereketEx3 {

	public static void main(String[] args) throws InterruptedException {

		// 8. Launch chrome browser

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bruka\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 9. Navigate to https://demo.nopcommerce.com/
		
		driver.get("https://demo.nopcommerce.com/");
		
		// 10. Click Register Link
		
		WebElement clickRegisterLink = driver.findElement(By.xpath("//a[text()='Register']"));
		clickRegisterLink.click();
		
		// 11. Verify the page title is nopCommerce demo store. Register
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		
		/** 12. Fill out Your Personal Details Section
				a. Gender
				b. First name
				c. Last name
				d. Date of birth
				e. Email

		 */
		
		WebElement radioGender = driver.findElement(By.xpath("//input[contains(@id, 'gender-male')]"));
		radioGender.click();
		
		WebElement firstNameField  = driver.findElement(By.xpath(" /html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[2]/input"));
		firstNameField.sendKeys("Bereket");
		
		WebElement lastNameField  = driver.findElement(By.xpath("//input[contains(@data-val-required, 'Last ')]"));
		lastNameField.sendKeys("N");
		
		
		WebElement dobDay  = driver.findElement(By.name("DateOfBirthDay"));
		Select select = new Select(dobDay);
		select.selectByVisibleText("11");
		
		WebElement dobMonth  = driver.findElement(By.name("DateOfBirthMonth"));
		Select select1 = new Select(dobMonth);
		select1.selectByVisibleText("May");
		 
		WebElement dobYear  = driver.findElement(By.name("DateOfBirthYear"));
		Select select3 = new Select(dobYear);
		select3.selectByValue("1978");
		
		WebElement emailField  = driver.findElement(By.xpath("//input[starts-with(@data-val-email,'Wrong')]"));
		emailField.sendKeys("eemaill1@gmail.com");
		
		// 13. Enter Company name
		
		WebElement companyField  = driver.findElement(By.name("Company"));
		companyField.sendKeys("NoorTeck");
		Thread.sleep(3000);
		
		// 14. Uncheck Newsletter checkbox
		
		WebElement uncheckNewsletterButton = driver.findElement(By.name("Newsletter"));
		uncheckNewsletterButton.click();
		
		// 15. Enter password
		
		WebElement passwordField  = driver.findElement(By.id("Password"));
		passwordField.sendKeys("123456789");
		
		// 16. Confirm Password 
		WebElement confirmPassworField  = driver.findElement(By.id("ConfirmPassword"));
		confirmPassworField.sendKeys("123456789");
		
		// 17. Click register button
		WebElement registerButton  = driver.findElement(By.id("register-button"));
		registerButton.click();
		
		/** 18. Retrieve the confirmation text message and check if the confirmation text 
		 message equals to Your registration completed!!!
					a. If it does then print TESTCASE PASSED
					b. Otherwise print�TESTCASE�FAILED
		*/
		
		WebElement registrationText = driver
				.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
		String text = registrationText.getText();

		if (text.equals("Your registration completed")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");

		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
