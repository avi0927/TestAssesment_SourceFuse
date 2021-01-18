package qaautomation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {
 WebDriver driver;
 @Test
 
 public void sofverif() throws InterruptedException{
	 System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Test Assessment\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
	 
		boolean Firstname=driver.findElement(By.xpath("//div[@id='fnameInput']//input[@type='text']")).isEnabled();
	    SoftAssert sa =new SoftAssert();
	   sa.assertEquals(true, false);
	    System.out.println("true");
	    
	  WebElement LastName=  driver.findElement(By.xpath("//div[@id='lnameInput']//input[@type='text']"));
	  SoftAssert LName =new SoftAssert();
	  LName.assertAll("Pass");
	  System.out.println("true");
	  
	  WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		SoftAssert Email =new SoftAssert();
		Email.assertAll("Pass");
		  System.out.println("true");
		  
		  WebElement comp=driver.findElement(By.xpath("//div[@id='curCompanyInput']//input[@type='text']"));
		SoftAssert Company =new SoftAssert();
		Company.assertAll("Pass");
		  System.out.println("true");
		  
		  WebElement MobileNo=driver.findElement(By.xpath("//input[@type='tel']"));
		SoftAssert tel =new SoftAssert();
		tel.assertAll("Pass");
		  System.out.println("true");
		  
		  WebElement dob=driver.findElement(By.xpath("//div[@class='input-group date']//input[@type='text']"));
		SoftAssert date =new SoftAssert();
		date.assertAll("Pass");
		  System.out.println("true");
		  
		  WebElement  position=driver.findElement(By.xpath("//div[@id='positionInput']//input[@type='text']"));
		SoftAssert pos =new SoftAssert();
		  pos.assertAll("Pass");
		  System.out.println("true");
		  
		  WebElement portfolio=driver.findElement(By.xpath("//input[@value='http://']"));
		SoftAssert port =new SoftAssert();
		port.assertAll("Pass");
		  System.out.println("true");
		Thread.sleep(3000);
		
		WebElement salaryInput= driver.findElement(By.xpath("//div[@id='salaryInput']//input[@type='text']"));
		SoftAssert salary =new SoftAssert();
		salary.assertAll("Pass");
		  System.out.println("true");
		  
		  WebElement whenStartInput=driver.findElement(By.xpath("//div[@id='whenStartInput']//input[@type='text']"));
		SoftAssert whenStart =new SoftAssert();
		whenStart.assertAll("Pass");
		  System.out.println("true");
		  
		  WebElement address =driver.findElement(By.xpath("//textarea[@id='address']"));
		SoftAssert add =new SoftAssert();
		  add.assertAll("Pass");
		  System.out.println("true");
		  
		  WebElement resume= driver.findElement(By.xpath("//input[@id='resume']"));
		  SoftAssert res =new SoftAssert();
		  res.assertAll("Pass");
		  System.out.println("true");
		  
		  WebElement radio=  driver.findElement(By.xpath("//input[@id='yes']"));
		  radio.click();
		  SoftAssert rad =new SoftAssert();
		  assertEquals(true, radio.isSelected());
		  System.out.println("radio is Selected");
		  
		  WebElement sub=driver.findElement(By.xpath("//button[normalize-space()='Submit Form']"));
			SoftAssert Submit =new SoftAssert();
			Submit.assertAll("Pass");
			  System.out.println("true");
			
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
	
		
	}


