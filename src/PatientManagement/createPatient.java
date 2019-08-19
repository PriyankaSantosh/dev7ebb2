package PatientManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class createPatient {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	WebDriver driver=new ChromeDriver();
	@Test
	public void createPatient()
	{

	
		// TODO Auto-generated method stub
	
	
	//	public static void main(String[] args) throws InterruptedException {
	//		WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://dev.ebloodbanking.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("edit-name")).sendKeys("test_admin");
			driver.findElement(By.id("edit-pass")).sendKeys("test_admin6767!");
			driver.findElement(By.id("edit-submit")).click();
			driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[11]")).click();
			driver.findElement(By.xpath("//a[@href='/create-patient-blood-requirement']")).click();
			driver.findElement(By.xpath("//input[@id='edit-field-patient-name-und-0-value']")).sendKeys("test");
			DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            
            //get current date time with Date()
            
            Date date1 = new Date();
            
          String  dd1=dateFormat1.format(date1);
          System.out.println(dd1);
			driver.findElement(By.xpath("//input[@id='edit-field-patient-id-und-0-value']")).sendKeys(dd1);
			
			driver.findElement(By.xpath("//select[@id='edit-field-hospital-id-und']")).click();
			driver.findElement(By.xpath("//option[text()='Test Private Hospital']")).click();
			driver.findElement(By.xpath("//input[@id='edit-field-ip-number-und-0-value']")).sendKeys("12358");
			driver.findElement(By.xpath("//div[@id='edit_field_indication_und_chosen']")).click();
			driver.findElement(By.xpath("//li[text()='Aplastic anemia']")).click();
			driver.findElement(By.xpath("//select[@id='edit-field-patient-gender-und']")).click();
			driver.findElement(By.xpath("//option[@value='Male']")).click();
			
			driver.findElement(By.xpath("//select[@id='edit-field-patient-age-und']")).click();
			driver.findElement(By.xpath("//option[@value='27']")).click();
			driver.findElement(By.xpath("//select[@id='edit-field-abo-und']")).click();
			driver.findElement(By.xpath("//option[@value='B']")).click();
			driver.findElement(By.xpath("//select[@id='edit-field-rh-und']")).click();
			driver.findElement(By.xpath("//option[@value='Neg']")).click();
			driver.findElement(By.xpath("//select[@id='edit-field-patient-request-nature-und']")).click();
			driver.findElement(By.xpath("(//option[@value='Normal'])[2]")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			/*WebElement ele8 = driver.findElement(By.xpath("//div[@id='edit_field_patient_address_und_0_country_chosen']"));
	    	JavascriptExecutor executor8 = (JavascriptExecutor)driver;
	    	executor8.executeScript("arguments[0].click();", ele8);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//li[text()='India']")).click();*/
			
			driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-thoroughfare']")).sendKeys("near uma hotel");
			driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-premise']")).sendKeys("MG road");
			driver.findElement(By.xpath("//div[@id='edit_field_patient_address_und_0_locality_chosen']")).click();
			
			WebElement element = driver.findElement(By.xpath("//div[@id='edit_field_patient_address_und_0_locality_chosen']"));
			 
	        Actions action1 = new Actions(driver);
	 
	        action1.moveToElement(element).build().perform();
	 
	        driver.findElement(By.xpath("//li[@data-option-array-index='467']")).click();
	     driver.findElement(By.xpath("//div[@id='edit_field_patient_address_und_0_administrative_area_chosen']")).click();
	     driver.findElement(By.xpath("//li[text()='Karnataka']")).click();
	        
	        
	        
	        
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	        driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-postal-code--2']")).sendKeys("584101");
	        
	        driver.findElement(By.xpath("//input[@id='edit-field-patient-phone-und-0-value']")).sendKeys("1234567895");
	        driver.findElement(By.xpath("//input[@id='edit-field-patient-email-und-0-value']")).sendKeys("test@gmail.com");
	        driver.findElement(By.xpath("//input[@id='edit-field-requirement-und-0-value']")).sendKeys("3WB");
	        driver.findElement(By.xpath("//select[@id='edit-field-request-status-und']")).click();
	        driver.findElement(By.xpath("//option[@value='Open']")).click();
	        WebElement ele81 = driver.findElement(By.id("edit-submit"));
	    	JavascriptExecutor executor81 = (JavascriptExecutor)driver;
	    	executor81.executeScript("arguments[0].click();", ele81);
			
	
			
			
			
			
				
			
			
			
	
			
			
		}

}
