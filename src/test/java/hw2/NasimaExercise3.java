package hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NasimaExercise3 {
	public static void main(String[] args) throws InterruptedException {
		// First Approach

		// Step1
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		// Thread.sleep(3000);
		// Step2
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(3000);
		// Step3
		WebElement register = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		register.click();
		// Thread.sleep(3000);
		// Step4
		String pageTitle = driver.getTitle();

		if (pageTitle.equals("nopCommerce demo store. Register")) {

			System.out.println("PASEED: " + pageTitle);
			Thread.sleep(3000);
		}

		// Step5
		WebElement genderRadioButton = driver.findElement(By.id("gender-female"));
		genderRadioButton.click();

		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Nasima");

		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Amini");

		WebElement dayDropDown = driver.findElement(By.name("DateOfBirthDay"));
		Select select1 = new Select(dayDropDown);
		select1.selectByVisibleText("14");

		WebElement monthDropDown = driver.findElement(By.xpath("//select[contains(@name,'DateOfBirthMonth')]"));
		Select select2 = new Select(monthDropDown);
		select2.selectByVisibleText("March");

		WebElement yearDropDown = driver.findElement(By.xpath("//select[contains(@name,'DateOfBirthYear')] "));
		Select select3 = new Select(yearDropDown);
		select3.selectByVisibleText("2020");

		WebElement emailDropDown = driver.findElement(By.id("Email"));
		emailDropDown.sendKeys("nasima272_amini@gmail.com");
		// step6
		WebElement companyNameDropDown = driver.findElement(By.id("Company"));
		companyNameDropDown.sendKeys("AzarSan");

		// step7
		WebElement uncheck1 = driver.findElement(By.id("Newsletter"));
		uncheck1.click();

		// step8
		WebElement passwordDropDown = driver.findElement(By.id("Password"));
		passwordDropDown.sendKeys("123456789");
		// Thread.sleep(2000);

		// step9

		WebElement reInterpasswordDropDown = driver.findElement(By.id("ConfirmPassword"));
		reInterpasswordDropDown.sendKeys("123456789");
		Thread.sleep(2000);
		// step10

		WebElement registrationbutton = driver.findElement(By.id("register-button"));
		registrationbutton.click();
		Thread.sleep(3000);
		
        //Step11
		WebElement textMessage = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
		String text = textMessage.getText();
		
		if(text.equals("Your registration completed")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE�FAILED");
		}
		
		Thread.sleep(3000);
		driver.quit();
		 
		
	
			// Second Approach
			
			/**
			
			//Step1
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\nasim\\OneDrive\\Desktop\\Selenium-B9\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			//Step2
			driver.get("https://demo.nopcommerce.com/");
			Thread.sleep(3000);
			//Step3
			WebElement register = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
			register.click();
			Thread.sleep(3000);
			//Step4
			String pageTitle = driver.getTitle();

			if (pageTitle.equals("nopCommerce demo store. Register")) {

				System.out.println("PASEED: " + pageTitle);
				Thread.sleep(3000);
			}
			
			//Step5
			WebElement genderRadioButton = driver.findElement(By.id("gender-female"));
			genderRadioButton.click();
			
			WebElement firstName = driver.findElement(By.id("FirstName"));
			firstName.sendKeys("Sana");
			
			WebElement lastName = driver.findElement(By.id("LastName"));
			lastName.sendKeys("Amini");
			
			WebElement dayDropDown = driver.findElement(By.name("DateOfBirthDay"));
			Select select = new Select(dayDropDown);
			
			List<WebElement > dayList = select.getOptions();
			for(WebElement day:dayList) {
			
				
				String dayStr = day.getText();
				
				if(dayStr.equals("12")) {
					System.out.println(dayStr);
					day.click();
					//Thread.sleep(2000);
					break;
				
				}
				
			}
			WebElement monthOfBirth = driver.findElement(By.xpath("//select[contains(@name,'DateOfBirthMonth')]"));
			Select select2 = new Select(monthOfBirth);
			List<WebElement > allMonthOptions = select2.getOptions();
			for(WebElement month :allMonthOptions) {
			
				
				String monthStr = month.getText();
				
				if(monthStr.equals("March")) {
					System.out.println(monthStr);
					month.click();
					Thread.sleep(2000);
					break;
				
				}
				
			}
			
			WebElement yearDropDown = driver.findElement(By.xpath("//select[contains(@name,'DateOfBirthYear')] "));
			Select select3 = new Select(yearDropDown);
			List<WebElement > allYearsOptions = select3.getOptions();
			for(WebElement year :allYearsOptions) {
			
				
				String yearStr = year.getText();
				
				if(yearStr.equals("2020")) {
					System.out.println(yearStr);
					year.click();
					break;
				
				}
				
			}
			
			WebElement emailDropDown = driver.findElement(By.id("Email"));
			emailDropDown.sendKeys("sana_amini@gmail.com");
			// step6
			WebElement companyNameDropDown = driver.findElement(By.id("Company"));
			companyNameDropDown.sendKeys("AzarSan");
			
			//step7
			WebElement uncheck1 = driver.findElement(By.id("Newsletter"));
			uncheck1.click();
			
			// step8
			WebElement passwordDropDown = driver.findElement(By.id("Password"));
			passwordDropDown.sendKeys("123456789");
			
			//step9
			
			WebElement reInterpasswordDropDown = driver.findElement(By.id("ConfirmPassword"));
			reInterpasswordDropDown.sendKeys("123456789");

		    //step10
			
			WebElement registrationbutton = driver.findElement(By.id("register-button"));
			registrationbutton.click();

			WebElement confirmationMessage = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
			String strconfirmationMessage = confirmationMessage.getText();
			System.out.println(strconfirmationMessage);
			
			if (strconfirmationMessage.equals("Your registration completed")) {
				System.out.println("TESTCASE PASSED");
			} else {
				System.out.println("TESTCASE FAILED");
			}
				
			
			*/
			
			
			
			

		}

	}

	/**

	Scenario: Register new user
	1. Launch chrome browser
	2. Navigate to https://demo.nopcommerce.com/
	3. Click Register Link
	4. Verify the page title is nopCommerce demo store. Register
	5. Fill out Your Personal Details Section
	a. Gender
	b. First name
	c. Last name
	d. Date of birth
	e. Email
	6. Enter Company name
	7. Uncheck Newsletter checkbox
	8. Enter password
	9. reEnter Username/ password
	10. Click register button
	11. Retrieve the confirmation text message and check if the confirmation text message equals to
	Your registration completed!!!
	a. If it does then print TESTCASE PASSED
	b. Otherwise print TESTCASE FAILED

	*/
	


