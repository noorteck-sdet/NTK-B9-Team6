package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2NasimaAmini {
	public static void main(String[] args) throws InterruptedException {
		
        // step1
        System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\nasim\\OneDrive\\Desktop\\Selenium-B9\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		//2. Navigate to https://demo.guru99.com/test/newtours/
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		
		//3. Click REGISTER link
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		registerLink.click();
		Thread.sleep(3000);
		
		//4. Verify the page title is Mercury Tours
		
		String MercuryToours = driver.getTitle();
		System.out.println("pageTitle:" + MercuryToours);
		if(driver.getTitle()==(":MercuryTours")) {
		
			Thread.sleep(3000);
		
		}else {
			//driver.quit();
		}
		
//		String pageTitle = driver.getTitle();
//
//		System.out.println("PageTitle:" +pageTitle );
//		Thread.sleep(3000);
		
		 //5. Enter first name
		 WebElement firstName = driver.findElement(By.name("firstName"));
		 firstName.sendKeys("John");
		 Thread.sleep(3000);
		 
		//6. Enter last name
		 WebElement lastName = driver.findElement(By.name("lastName"));
		 lastName.sendKeys("Cena");
		 Thread.sleep(3000);
		 
		 //7. Enter phone number
		 WebElement phoneNumber = driver.findElement(By.name("phone"));
		 phoneNumber.sendKeys("123456789");
		 Thread.sleep(3000);
		 
		 //8. Enter email
		 WebElement email = driver.findElement(By.id("userName"));
		 email.sendKeys("jc@yahoo.com");
		 Thread.sleep(3000);
		 
		 //9. Enter address
		 WebElement address = driver.findElement(By.name("address1"));
		 address.sendKeys("123 street, ABC, VA");
		 Thread.sleep(3000);
		 
		 //10. Enter city
		 WebElement city = driver.findElement(By.name("city"));
		 city.sendKeys("Reston");
		 Thread.sleep(3000);
		 
		 //11. Enter state
		 WebElement state = driver.findElement(By.name("state"));
		 state.sendKeys("VA");
		 Thread.sleep(3000);
		 
		 //12. Enter postal Code
		 WebElement postalCode = driver.findElement(By.name("postalCode"));
		 postalCode.sendKeys("22221");
		 Thread.sleep(3000);
		 
		 //13. Enter username
		 WebElement userName = driver.findElement(By.id("email"));
		 userName.sendKeys("John");
		 Thread.sleep(3000);
		 
		 //14. Enter password
		 WebElement password = driver.findElement(By.name("password"));
		 password.sendKeys("na108");
		 Thread.sleep(3000);
		 
		 //15. Re-Enter password in confirm password field
		 WebElement reInterpassword = driver.findElement(By.name("confirmPassword"));
		 reInterpassword.sendKeys("na108");
		 Thread.sleep(3000);
		 
		 //16. Click Submit
		 WebElement submitButton = driver.findElement(By.name("submit"));
		 submitButton.click();
			Thread.sleep(3000);
		 
		 
		/**
		 17. Retrieve the confirmation text message and check if the confirmation text message contains
		 following phrase: Thank you for registering.
		 a. If it does then print TESTCASE PASSED
		 b. Otherwise print TESTCASE FAILED 
		 */
		WebElement ConfirmationText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td"));
		String  textStr = ConfirmationText.getText();
				
		if(textStr.contains("Thank you for registering.")) {
		System.out.println("TESTCASE PASSED");
		} else {
		System.out.println("TESTCASE FAILED ");
		}
				
				
		Thread.sleep(3000);
		
		// 18. Close the browser
		driver.quit();
		

}

}
/**

Scenario: Register new user in Mercury Tours Page
1. Launch chrome browser
2. Navigate to https://demo.guru99.com/test/newtours/
3. Click REGISTER link
4. Verify the page title is Mercury Tours
5. Enter first name
6. Enter last name
7. Enter phone number
8. Enter email
9. Enter address
10. Enter city
11. Enter state
12. Enter zip code
13. Enter username
14. Enter password
15. Re-Enter password in confirm password field
16. Click Submit
17. Retrieve the confirmation text message and check if the confirmation text message contains
following phrase: Thank you for registering.
a. If it does then print TESTCASE PASSED
b. Otherwise print TESTCASE FAILED
18. Close the browser

*/
