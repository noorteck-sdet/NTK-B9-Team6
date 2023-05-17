package hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YoelExercise3 {
public static void main(String[] args) throws InterruptedException {
	String url = "https://demo.nopcommerce.com/";
	// Step 1: Set system property
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\yoel\\\\Desktop\\\\Selenium-b9\\\\chromedriver.exe");
	Thread.sleep(2000);
	// Step 2: Create an object of Webdriver
	WebDriver driver = new ChromeDriver();
	WebDriverManager.chromedriver().setup();

	Thread.sleep(2000);

	// Maximize the browser
	driver.manage().window().maximize();

	driver.get(url);
	WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
	registerLink.click();
	
	//verifying the page title is nopCommernce demo store.register
	String pageTitle= driver.getTitle();
	System.out.println("page title"+ pageTitle);
	
	//12 fill out your personal details section
	WebElement gender=driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
	gender.click();
	
	WebElement firstName=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[2]/input"));
	firstName.sendKeys("Yoel");
	Thread.sleep(2000);
	
	WebElement lastName=driver.findElement(By.xpath("//input[contains(@data-val-required,'Last')]"));
	lastName.sendKeys("be");
	Thread.sleep(2000);

	
	WebElement dateOfBirth= driver.findElement(By.name("DateOfBirthDay"));
	Select selectDay = new Select(dateOfBirth);
	selectDay.selectByValue("15");
	Thread.sleep(2000);
	
	//e. month of birth
	WebElement monthOfBirth= driver.findElement(By.name("DateOfBirthMonth"));
	Select selectMonth = new Select(monthOfBirth);
	selectMonth.selectByValue("7");
	Thread.sleep(2000);
	
	//f. year of birth
	WebElement yearOfBirth= driver.findElement(By.name("DateOfBirthYear"));
	Select selectYear = new Select(yearOfBirth);
	selectYear.selectByValue("1992");
	Thread.sleep(2000);
	
	
	
	
	//email
	WebElement email= driver.findElement(By.id("Email"));
	email.sendKeys("yoelberhane7000@gmail.com");
	Thread.sleep(2000);
	
	
	//enter username
	WebElement userName= driver.findElement(By.id("Company"));
	userName.sendKeys("Noorteck");
	Thread.sleep(2000);

	
	//uncheck newsletter
		WebElement unchekLetter=driver.findElement(By.id("Newsletter"));
		unchekLetter.click();
		Thread.sleep(2000);
		
		//password 
		WebElement password=driver.findElement(By.id("Password"));
		password.sendKeys("123456");
		Thread.sleep(2000);
		
		//confirm password 
				WebElement confrimPassword=driver.findElement(By.id("ConfirmPassword"));
				confrimPassword.sendKeys("123456");
				Thread.sleep(2000);
				
				//click register
				WebElement register=driver.findElement(By.name("register-button"));
				register.click();
				Thread.sleep(2000);
				
				// retriving the confirmation
				WebElement textmessage=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
				String text=textmessage.getText();

				if(text.equals("Your registration completed")) {
					System.out.println("passed");
				}else {
					System.out.println("Failed");
				}
		driver.quit();
	
}
}
