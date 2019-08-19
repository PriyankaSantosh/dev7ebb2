package Update;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpdateSerology {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
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
		driver.findElement(By.xpath("(//a[text()='Edit'])[1]")).click();
		driver.findElement(By.xpath("//a[@href='#edit-group_centre_misc_manage']")).click();
		
		
		
		
		WebElement checking = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-und-mandatory-blood-group-verification']"));
		if (checking.isSelected()) {
			
			WebElement check1 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-und-mandatory-blood-group-verification']"));
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
		
		
		
		driver.findElement(By.xpath("(//a[text()='Edit'])[1]")).click();
		driver.findElement(By.xpath("//a[@href='#edit-group_centre_misc_manage']")).click();
		
		
		WebElement checking1 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-und-mandatory-serology-verification']"));
		if (checking1.isSelected()) {
			
			WebElement check1 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-und-mandatory-serology-verification']"));
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
		driver.findElement(By.xpath("(//a[text()='Edit'])[1]")).click();
		driver.findElement(By.xpath("//a[@href='#edit-group_centre_misc_manage']")).click();
		
		
		
		
		WebElement checking11 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-und-set-donor-registration-id-as-blood-bag-number']"));
		if (checking11.isSelected()) {
			
			WebElement check1 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-und-set-donor-registration-id-as-blood-bag-number']"));
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
					 
					DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
		            
		            //get current date time with Date()
		            
		            Date date = new Date();
		            
		          String  dd=dateFormat.format(date);
		          System.out.println(dd);
		          
		          DateFormat dateFormat11 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		            
		            //get current date time with Date()
		            
		            Date date11 = new Date();
		            
		          String  rr=dateFormat11.format(date11);
		          System.out.println(rr);
		          
				          

					driver.findElement(By.xpath("//input[@class='text-full form-control form-text required']")).sendKeys(rr);
					driver.findElement(By.xpath("//input[@id='edit-field-donor-name-und-0-value']")).sendKeys("Anusha");
					
					driver.findElement(By.xpath("//select[@id='edit-field-blood-group-und']")).click();
					driver.findElement(By.xpath("//option[@value='B Neg']")).click();

					
					WebElement element1 = driver.findElement(By.id("edit-field-gender-und"));
					Actions action = new Actions(driver);
					action.moveToElement(element1).click().perform();
					driver.findElement(By.xpath("//option[@value='Female']")).click();

					driver.findElement(By.xpath("//div[@id='edit_field_donor_occupation_und_chosen']")).click();
					driver.findElement(By.xpath("//li[@data-option-array-index='2']")).click();

					driver.findElement(By.xpath("//div[@id='edit_field_address_und_0_country_chosen']")).click();
					driver.findElement(By.xpath("//li[@data-option-array-index='102']")).click();

					driver.findElement(By.xpath("//input[@id='edit-field-address-und-0-thoroughfare']")).sendKeys("MG");
					driver.findElement(By.xpath("//input[@id='edit-field-address-und-0-premise']")).sendKeys("uma hotel");

					driver.findElement(By.xpath("//div[@id='edit_field_address_und_0_locality_chosen']")).click();
					driver.findElement(By.xpath("(//li[@data-option-array-index='44'])[2]")).click();

					driver.findElement(By.xpath("//div[@id='edit_field_address_und_0_administrative_area_chosen']")).click();
					driver.findElement(By.xpath("//li[text()='Karnataka']")).click();

					driver.findElement(By.xpath("//input[@id='edit-field-address-und-0-postal-code--2']")).sendKeys("584101");

					driver.findElement(By.xpath("//input[@id='edit-field-mobile-und-0-value']")).sendKeys("1478523690");

					driver.findElement(By.xpath("//input[@id='edit-field-email-und-0-email']")).sendKeys("adc@gmail.com");

					driver.findElement(By.xpath("//input[@id='edit-field-aadhar-pan-number-und-0-value']")).sendKeys("987654321077");

					driver.findElement(By.xpath("//select[@id='edit-field-donor-donation-location-und']")).click();
					driver.findElement(By.xpath("//option[@value='Camp']")).click();

					driver.findElement(By.xpath("//div[@id='edit_field_blood_donation_camp_und_0_nid_chosen']")).click();
					driver.findElement(By.xpath("//li[text()='bannergattastg1 08-May-2019']")).click();


					driver.findElement(By.xpath("//input[@value='Yes']")).click();

					driver.findElement(By.xpath("//div[@id='edit_field_number_of_donations_und_chosen']")).click();
					driver.findElement(By.xpath("//li[text()='First Time']")).click();


					driver.findElement(By.xpath("//input[@id='edit-field-age-und-0-value']")).sendKeys("56");



					driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

					

					WebElement ele1 = driver.findElement(By.xpath("//a[@href='#bootstrap-panel--2']"));
					JavascriptExecutor executor1 = (JavascriptExecutor)driver;
					executor1.executeScript("arguments[0].click();", ele1);

					driver.findElement(By.xpath("//select[@id='edit-field-donor-doctor-und']")).click();
					driver.findElement(By.xpath("//option[@value='4973']")).click();


					driver.findElement(By.xpath("//input[@id='edit-field-weight-und-0-value']")).sendKeys("45");
					driver.findElement(By.xpath("//input[@id='edit-field-bp-systolic-und-0-value']")).sendKeys("110");
					driver.findElement(By.xpath("//input[@id='edit-field-bp-diastolic-und-0-value']")).sendKeys("65");

					driver.findElement(By.xpath("//input[@id='edit-field-hemoglobin-test-und-more-than-125']")).click();

					driver.findElement(By.xpath("//input[@id='edit-field-deferral-status-und-normal']")).click();

					driver.findElement(By.xpath("//select[@id='edit-field-donor-sdp-suff-duration-und']")).click();
					driver.findElement(By.xpath("//option[@value='YES']")).click();

					driver.findElement(By.xpath("//select[@id='edit-field-donation-type-und']")).click();
					driver.findElement(By.xpath("//option[@value='WBD']")).click();

					driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


					WebElement ele2 = driver.findElement(By.xpath("//a[@href='#bootstrap-panel--7']"));
					JavascriptExecutor executor2 = (JavascriptExecutor)driver;
					executor2.executeScript("arguments[0].click();", ele2);
					

					driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-und-0-value-datepicker-popup-0']")).sendKeys(dd);
					driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-und-0-value-timeEntry-popup-1']")).sendKeys("01:50am");

					driver.findElement(By.xpath("//input[@id='edit-field-bag-no-und-0-value']")).sendKeys("testbloodbag");
					driver.findElement(By.xpath("//input[@id='edit-field-batch-no-und-0-value']")).sendKeys("65");
					driver.findElement(By.xpath("//input[@id='edit-field-donor-segment-number-und-0-value']")).sendKeys("65");

					driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


					driver.findElement(By.xpath("//select[@id='edit-field-type-of-bag-und']")).click();
					driver.findElement(By.xpath("//option[@value='5074']")).click();

					driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


					driver.findElement(By.xpath("//select[@id='edit-field-components-to-be-prepared-und']")).click();
					driver.findElement(By.xpath("//option[text()='PC, FFP']")).click();

					driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


					driver.findElement(By.xpath("//select[@id='edit-field-er-technician-und']")).click();
					driver.findElement(By.xpath("(//option[text()='  anushka '])[2]")).click();

					WebElement ele11 = driver.findElement(By.id("edit-submit"));
					JavascriptExecutor executor11 = (JavascriptExecutor)driver;
					executor11.executeScript("arguments[0].click();", ele11);
					
					
					WebElement ele21 = driver.findElement(By.xpath("//a[text()='Create Components']"));
					JavascriptExecutor executor21 = (JavascriptExecutor)driver;
					executor21.executeScript("arguments[0].click();", ele21);

					//driver.findElement(By.xpath("//a[text()='Create Components']")).click();


					driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

					WebElement ele111 = driver.findElement(By.id("edit-submit"));
					JavascriptExecutor executor111 = (JavascriptExecutor)driver;
					executor111.executeScript("arguments[0].click();", ele111);
					
					
					driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[4]")).click();
					driver.findElement(By.xpath("//a[@href='/update_serology']")).click();
					driver.findElement(By.xpath("//input[@id='edit-test-date-datepicker-popup-0']")).click();
					
			
					driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a")).click();
					
		         
					driver.findElement(By.xpath("//input[@id='edit-test-date-timeEntry-popup-1']")).sendKeys("05:05 am");
					driver.findElement(By.xpath("//textarea[@id='edit-bb-num']")).sendKeys("testbloodbag");
					WebElement ele11111 = driver.findElement(By.id("edit-submit"));
					JavascriptExecutor executor11111 = (JavascriptExecutor)driver;
					executor11111.executeScript("arguments[0].click();", ele11111);
					
					
					
					


					
	  }

	
	
		
}
