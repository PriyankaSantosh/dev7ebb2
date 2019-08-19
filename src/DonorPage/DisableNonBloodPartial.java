package DonorPage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisableNonBloodPartial {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	WebDriver driver=new ChromeDriver();
@Test
public void DisableNonBloodPartial()
{

	
		// TODO Auto-generated method stub
		//public static void main(String[] args) throws InterruptedException {
			//WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://dev.ebloodbanking.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("edit-name")).sendKeys("vamsy");
			driver.findElement(By.id("edit-pass")).sendKeys("vamsy");
			driver.findElement(By.id("edit-submit")).click();
			driver.findElement(By.xpath("//a[text()='Welcome Vamsy']")).click();
			driver.findElement(By.xpath("(//a[text()='Test Blood Bank'])[1]")).click();
			driver.findElement(By.xpath("(//a[text()='Edit'])[1]")).click();
			driver.findElement(By.xpath("//a[@href='#edit-group_centre_misc_manage']")).click();
		
			WebElement check = driver.findElement(By.xpath("//input[@value='Blood Group Non Mandatory in Donation Record']"));
			if (check.isSelected()) {
				
				WebElement check1 = driver.findElement(By.xpath("//input[@value='Blood Group Non Mandatory in Donation Record']"));
				 JavascriptExecutor executor211 = (JavascriptExecutor)driver;
					executor211.executeScript("arguments[0].click();", check1);
					
				WebElement ele21 = driver.findElement(By.id("edit-submit"));
				JavascriptExecutor executor2111 = (JavascriptExecutor)driver;
				executor2111.executeScript("arguments[0].click();", ele21);


		 } else {
			 
		          WebElement ele21 = driver.findElement(By.id("edit-submit"));
					JavascriptExecutor executor2111 = (JavascriptExecutor)driver;
					executor2111.executeScript("arguments[0].click();", ele21);
		          
		 }
			
			
			
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
			
			 
			
			driver.findElement(By.id("edit-name")).sendKeys("test_admin");
			driver.findElement(By.id("edit-pass")).sendKeys("test_admin6767!");
			driver.findElement(By.id("edit-submit")).click();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[1]")).click();
			driver.findElement(By.xpath("//a[@href='/node/add/donation-record']")).click();

			driver.findElement(By.xpath("//select[@id='edit-field-donor-entry-type-und']")).click();
			driver.findElement(By.xpath("//option[@value='Partial']")).click();
			
			DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
            
            //get current date time with Date()
            
            Date date = new Date();
            
          String  dd=dateFormat.format(date);
          System.out.println(dd);
          
          DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            
            //get current date time with Date()
            
            Date date1 = new Date();
            
          String  dd1=dateFormat1.format(date1);
          System.out.println(dd1);
          
		          

			driver.findElement(By.xpath("//input[@class='text-full form-control form-text required']")).sendKeys(dd1);
			driver.findElement(By.xpath("//input[@id='edit-field-donor-name-und-0-value']")).sendKeys("Anusha");
			
			WebElement ele2 = driver.findElement(By.xpath("//a[@href='#bootstrap-panel--7']"));
			JavascriptExecutor executor2 = (JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();", ele2);
			
			driver.findElement(By.xpath("//input[@id='edit-field-bag-no-und-0-value']")).sendKeys("65");
			driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


			driver.findElement(By.xpath("//select[@id='edit-field-type-of-bag-und']")).click();
			driver.findElement(By.xpath("//option[@value='5074']")).click();

			driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


			driver.findElement(By.xpath("//select[@id='edit-field-components-to-be-prepared-und']")).click();
			driver.findElement(By.xpath("//option[text()='PC, FFP']")).click();

			driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


			WebElement ele11 = driver.findElement(By.id("edit-submit"));
			JavascriptExecutor executor11 = (JavascriptExecutor)driver;
			executor11.executeScript("arguments[0].click();", ele11);
			System.out.println("since the non mandatory blood group is disabled");
			System.out.println("need to enter blood group");
		}
		
}
