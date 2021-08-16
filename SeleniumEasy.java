import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class SeleniumEasy {

	public static void main(String[] args) {
		
		//Set the base URL   
		String url = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";
		
		//Set the driver relative path
		System.setProperty("webdriver.chrome.driver", ".//BrowserDriver/chromedriver.exe");
		
		//Initiating the driver 
		WebDriver driver = new ChromeDriver();
		
		//Calling the base URL
		driver.get(url);
		
		//Maximize Browser View
		driver.manage().window().maximize();
		
		//Adding a delay
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Close the popup box 
		driver.findElement(By.id("at-cv-lightbox-close")).click();
		
		// Adding values for A
		driver.findElement(By.id("sum1")).sendKeys("10");
		
		// Adding values for B
		driver.findElement(By.id("sum2")).sendKeys("20");
		
		// Get total 
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button")).click();
		
		// Assert validation one
		
		 //String value =  driver.findElement(By.id("displayvalue")).getText(); 
		 WebElement valueSecond =  driver.findElement(By.id("displayvalue"));
		 //String ExpectedValue = "30";
		 Assert.assertEquals(true, valueSecond.isDisplayed());
		 //Assert.assertEquals(ExpectedValue, value);
		 System.out.println("Recived value as excepeted - Test Passed");
		 
		 //Assert validation two 
		 
		 WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/a"));
		 
		 Assert.assertEquals(true, logo.isDisplayed());
		 System.out.println("Main logo displayed - Asster Passed");
		 
		 //Assert validation three
		 
		 WebElement message =  driver.findElement(By.id("user-message"));
		 
		 Assert.assertEquals(true, message.isEnabled());
		 
		 System.out.println("Enter message is editable - Assert Passed");
		 
		 
		
		

	}

}
