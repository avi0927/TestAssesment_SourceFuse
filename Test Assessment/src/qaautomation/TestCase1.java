package qaautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Test Assessment\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Submit Form']")).click();
		List<WebElement> mandatoryLables = driver.findElements(By.xpath("//span[@class='required'][normalize-space()='*']/.."));
		
		for (int i = 0; i < mandatoryLables.size(); i++) {
			System.out.println("Mandatory Fields are "+		mandatoryLables.get(i).getText());
		}
		
		
	}	
	

}
