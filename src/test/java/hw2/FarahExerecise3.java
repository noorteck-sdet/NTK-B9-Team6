package hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FarahExerecise3 {

	public static void main(String[] args) throws InterruptedException {

		// Launch chrome browser
		// Navigate to https://demo.nopcommerce.com/

		String url = "https://demo.nopcommerce.com/";

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		// Click Register Link
		WebElement ResisterLink = driver
				.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]"));
		ResisterLink.click();

		// Verify the page title is nopCommerce demo store. Register
		String pageTitle = driver.getTitle();
		System.out.println("page title: " + pageTitle);

		/**
		 * Fill out Your Personal Details Section a. Gender b. First name c. Last name
		 * d. Date of birth e. Email
		 */
		WebElement Gender = driver.findElement(By.id("gender-female"));
		Gender.click();

		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		firstName.sendKeys("Farah");

		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
		lastName.sendKeys("AB");

		WebElement dateOfDay = driver.findElement(By.name("DateOfBirthDay"));
		Select select = new Select(dateOfDay);
		select.selectByVisibleText("22");

		WebElement dateOfMonth = driver.findElement(
				By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]"));
		Select select1 = new Select(dateOfMonth);
		select1.selectByVisibleText("March");

		WebElement dateOfYear = driver.findElement(By.name("DateOfBirthYear"));
		Select select3 = new Select(dateOfYear);
		select3.selectByVisibleText("1950");

		WebElement emailField = driver.findElement(By.xpath("//input[starts-with(@data-val-email,'Wrong')]"));
		emailField.sendKeys("sdet221@gmai.com");
		// Enter Company name

		WebElement companyName = driver.findElement(By.id("Company"));
		companyName.sendKeys("SDET NoorTeck1");

		// Uncheck Newsletter checkbox
		WebElement uncheckNewsletter = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[3]/div[2]/div/label"));
		uncheckNewsletter.click();
		
		//Enter password
		WebElement passwordField = driver.findElement(By.id("Password"));
		passwordField.sendKeys("223344");

		//Confirm Password
		
		WebElement conformPasswordField = driver.findElement(By.id("ConfirmPassword"));
		conformPasswordField.sendKeys("223344");
		
		//Click register button 
		WebElement registerButton = driver.findElement(By.id("register-button"));
		registerButton.click();
		
	
		WebElement confirmationText = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
		String text = confirmationText.getText();
		
		if(text.equals("Your registration completed")) {
			System.out.println("testcase passed ");
		} else {
			System.out.println("test case failed ");
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
