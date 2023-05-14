package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2Saba {
	
	public static void main(String[] args) throws InterruptedException {
	
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\wedis\\OneDrive\\Desktop\\Selenium B9\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		
		WebElement clickRegisterLink = driver.findElement(By.linkText("REGISTER"));
		clickRegisterLink.click();
		
		
		String MercuryToours = driver.getTitle();
		System.out.println("pageTitle:" + MercuryToours);
		
		Thread.sleep(3000);
		
		WebElement firstNameField = driver.findElement(By.name("firstName"));
		firstNameField.sendKeys("b");
		Thread.sleep(3000);
		
		WebElement lastNameField = driver.findElement(By.name("lastName"));
		lastNameField.sendKeys("brew");
		
		WebElement phoneNumberField = driver.findElement(By.name("phone"));
		phoneNumberField.sendKeys("240-258-5578");
		
		
		WebElement emailAddressField = driver.findElement(By.id("userName"));
		emailAddressField.sendKeys("teat@gmail.com");
		

		WebElement addressField = driver.findElement(By.name("address1"));
		addressField.sendKeys("123 java street");
		
		WebElement cityField = driver.findElement(By.name("city"));
		cityField.sendKeys("Washington");
		
		WebElement stateField = driver.findElement(By.name("state"));
		stateField.sendKeys("DC");
		
		WebElement zipCodeField = driver.findElement(By.name("postalCode"));
		zipCodeField.sendKeys("123456");
		
		WebElement userNameField = driver.findElement(By.id("email"));
		userNameField.sendKeys("teat@gmail.com");
		
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("saba@1234");
		
		WebElement confirmPasswordField = driver.findElement(By.name("confirmPassword"));
		confirmPasswordField.sendKeys("saba@1234");
		Thread.sleep(3000);
		
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
		
		WebElement ConfirmationText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td"));
		String  textStr = ConfirmationText.getText();
				
		if(textStr.contains("Thank you for registering.")) {
		System.out.println("TESTCASE PASSED");
		} else {
		System.out.println("TESTCASE FAILED ");
		}
		
		Thread.sleep(3000);
		driver.quit();
	
       
}
}
