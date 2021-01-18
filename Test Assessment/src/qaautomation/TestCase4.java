package qaautomation;

import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class TestCase4 {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Test Assessment\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		
		
		Thread.sleep(5000);
		
		
		 
		
		driver.findElement(By.xpath("//div[@id='fnameInput']//input[@type='text']")).sendKeys("Avinash");
		driver.findElement(By.xpath("//div[@id='lnameInput']//input[@type='text']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("avinash.ravi16@gmail.com");
		driver.findElement(By.xpath("//div[@id='curCompanyInput']//input[@type='text']")).sendKeys("QA infoetch Pvt Limited");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8789440537");
		driver.findElement(By.xpath("//div[@class='input-group date']//input[@type='text']")).sendKeys("06/16/1994");
		driver.findElement(By.xpath("//div[@id='positionInput']//input[@type='text']")).sendKeys("QA Automation");
		driver.findElement(By.xpath("//input[@value='http://']")).sendKeys("www.linkedin.com/in/avinash-ravi-69241792");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='salaryInput']//input[@type='text']")).sendKeys("6.2 LPA");
		driver.findElement(By.xpath("//div[@id='whenStartInput']//input[@type='text']")).sendKeys("12 feb");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("E 139 Noida");
		Thread.sleep(3000);
		WebElement upload=
				driver.findElement(By.xpath("//input[@id='resume']"));
		//Thread.sleep(3000);
 upload.sendKeys("C:\\Users\\windows10\\Downloads\\AVINASH_Resum.doc");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='yes']")).click();
		//
		driver.findElement(By.xpath("//button[normalize-space()='Submit Form']")).click();
		
		
		
	

	}

}
