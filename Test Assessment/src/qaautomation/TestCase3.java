package qaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
	
	WebDriver driver;
	 @Test
	 
	 public void HardVerify() throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Test Assessment\\exefiles\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		 
			boolean Firstname=driver.findElement(By.xpath("//div[@id='fnameInput']//input[@type='text']")).isEnabled();
		    Assert.assertEquals(true, false);
		    System.out.println("true");
		    
		  WebElement LastName=  driver.findElement(By.xpath("//div[@id='lnameInput']//input[@type='text']"));
		  Assert.assertEquals(true, false);
		  System.out.println("true");
		  
		  WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		  Assert.assertEquals(true, false);
			  System.out.println("true");
			  
			  WebElement comp=driver.findElement(By.xpath("//div[@id='curCompanyInput']//input[@type='text']"));
			  Assert.assertEquals(true, false);
			  System.out.println("true");
			  
			  WebElement MobileNo=driver.findElement(By.xpath("//input[@type='tel']"));
			  Assert.assertEquals(true, false);
			  System.out.println("true");
			  
			  WebElement dob=driver.findElement(By.xpath("//div[@class='input-group date']//input[@type='text']"));
			  Assert.assertEquals(true, false);
			  System.out.println("true");
			  
			  WebElement  position=driver.findElement(By.xpath("//div[@id='positionInput']//input[@type='text']"));
			  Assert.assertEquals(true, false);
			  System.out.println("true");
			  
			  WebElement portfolio=driver.findElement(By.xpath("//input[@value='http://']"));
			  Assert.assertEquals(true, false);
			  System.out.println("true");
			Thread.sleep(3000);
			
			WebElement salaryInput= driver.findElement(By.xpath("//div[@id='salaryInput']//input[@type='text']"));
			 Assert.assertEquals(true, false);
			  System.out.println("true");
			  
			  WebElement whenStartInput=driver.findElement(By.xpath("//div[@id='whenStartInput']//input[@type='text']"));
			  Assert.assertEquals(true, false);
			  System.out.println("true");
			  
			  WebElement address =driver.findElement(By.xpath("//textarea[@id='address']"));
			  Assert.assertEquals(true, false);
			  System.out.println("true");
			  
			  WebElement resume= driver.findElement(By.xpath("//input[@id='resume']"));
			  Assert.assertEquals(true, false);
			  System.out.println("true");
			  
			  WebElement radio=  driver.findElement(By.xpath("//input[@id='yes']"));
			  radio.click();
			  Assert.assertEquals(true, false);
			  System.out.println("radio is Selected");
			  
			  WebElement sub=driver.findElement(By.xpath("//button[normalize-space()='Submit Form']"));
			  Assert.assertEquals(true, false);
				  System.out.println("true");


}
}
