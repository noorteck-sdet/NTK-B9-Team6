package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2Yoel {
	public static void main(String[] args) throws InterruptedException {
		//step 1. set system property
				System.setProperty("webdriver.chrome.driver","C:\\Users\\yoel\\Desktop\\Selenium-b9\\chromedriver.exe");
				
			
				// step2. create an object of webdriver
				WebDriver driver= new ChromeDriver();
				
				driver.get("https://demo.guru99.com/test/newtours/");
				Thread.sleep(3000);
				
				//step click register link
				WebElement REGISTER = driver.findElement(By.linkText("REGISTER"));
				REGISTER.click();
				Thread.sleep(3000);
				
				// step 4 verifying title
				String MercuryToours = driver.getTitle();
				System.out.println("pageTitle:" + MercuryToours);
				if(driver.getTitle()==(":MercuryTours")) {
				
					Thread.sleep(3000);
				
				
				}else {
					//driver.quit();
				}
				
				//enter firstName
				WebElement firstName= driver.findElement(By.name("firstName"));
				firstName.sendKeys("joel");
				Thread.sleep(3000);
				
				//enter lastName
				WebElement lastName= driver.findElement(By.name("lastName"));
				lastName.sendKeys("Berhane");
				Thread.sleep(3000);
				
				//enter phone
				WebElement phone= driver.findElement(By.name("phone"));
				phone.sendKeys("071446808");
				Thread.sleep(3000);
				
				//enter email
				WebElement email= driver.findElement(By.id("username"));
				email.sendKeys("abcde@gmail.com");
				Thread.sleep(3000);
				
				//enter Address
				WebElement Address= driver.findElement(By.name("address1"));
				Address.sendKeys("8234 Street");
				Thread.sleep(3000);
				
				//enter city
				WebElement city= driver.findElement(By.name("city"));
				city.sendKeys("Arlington");
				Thread.sleep(3000);
				
				//enter state/province
				WebElement state= driver.findElement(By.name("state"));
				state.sendKeys("VA");
				Thread.sleep(3000);

				//enter PostalCode
				WebElement PostalCode= driver.findElement(By.name("postalCode"));
				PostalCode.sendKeys("123456");
				Thread.sleep(3000);
				
				//enter username
				WebElement username= driver.findElement(By.name("email"));
				username.sendKeys("abcde@gmail.com");
				Thread.sleep(3000);
				
				//enter password
				WebElement password= driver.findElement(By.name("password"));
				password.sendKeys("123456");
				Thread.sleep(3000);
				
				//enter ConfirmPassword
				WebElement ConfirmPassword= driver.findElement(By.name("confirmPassword"));
				ConfirmPassword.sendKeys("123456");
				Thread.sleep(3000);
				
				
				//enter submit
				WebElement submit= driver.findElement(By.name("submit"));
				submit.click();
				Thread.sleep(3000);
				
				WebElement text =driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
				text.click();
				String textStr= text.getText();
				if(textStr.contains("Thank you for registering")) {
				System.out.println("TESTCASE  PASSED:" +textStr);
				}else {
					System.out.println("TESTCASE failed:" +textStr);
				}
				driver.quit();
	}
}
