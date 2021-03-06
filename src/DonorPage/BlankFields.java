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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BlankFields {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	WebDriver driver=new ChromeDriver();
@Test
public void BlankFields() throws Exception
{
	


	
		// TODO Auto-generated method stub
		//public static void main(String[] args) throws InterruptedException {
			//WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://dev8.ebloodbanking.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("edit-name")).sendKeys("test_admin");
			driver.findElement(By.id("edit-pass")).sendKeys("test_admin6767!");
			driver.findElement(By.id("edit-submit")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[1]")).click();
			driver.findElement(By.xpath("//a[@href='/node/add/donation-record']")).click();

			driver.findElement(By.xpath("//select[@id='edit-field-donor-entry-type-und']")).click();
			driver.findElement(By.xpath("//option[@value='Full']")).click();
			
			

		//driver.findElement(By.xpath("//input[@class='text-full form-control form-text required']")).sendKeys("test21 "); //registration id
		//driver.findElement(By.xpath("//input[@id='edit-field-donor-name-und-0-value']")).sendKeys("test21");//donor name

			driver.findElement(By.xpath("//select[@id='edit-field-blood-group-und']")).click();
			driver.findElement(By.xpath("//option[@value='A1 Neg']")).click();

			
			/*WebElement element = driver.findElement(By.id("edit-field-gender-und"));
			Actions action = new Actions(driver);
			action.moveToElement(element).click().perform();*/

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

			/*driver.findElement(By.xpath("//div[@id='edit_field_blood_donation_camp_und_0_nid_chosen']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//li[text()='Applied Materials 30-Mar-2019']")).click();*/

			driver.findElement(By.xpath("//input[@value='Yes']")).click();

			driver.findElement(By.xpath("//div[@id='edit_field_number_of_donations_und_chosen']")).click();
			driver.findElement(By.xpath("//li[text()='First Time']")).click();


			//driver.findElement(By.xpath("//input[@id='edit-field-age-und-0-value']")).sendKeys("56");

			driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

			

			WebElement ele1 = driver.findElement(By.xpath("//a[@href='#bootstrap-panel--2']"));
			JavascriptExecutor executor1 = (JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();", ele1);

			driver.findElement(By.xpath("//select[@id='edit-field-donor-doctor-und']")).click();
			driver.findElement(By.xpath("  //option[text()='  TestDoctor ']")).click();


			//driver.findElement(By.xpath("//input[@id='edit-field-weight-und-0-value']")).sendKeys("45");//weight
			//driver.findElement(By.xpath("//input[@id='edit-field-bp-systolic-und-0-value']")).sendKeys("110");//systolic
			//driver.findElement(By.xpath("//input[@id='edit-field-bp-diastolic-und-0-value']")).sendKeys("65");//diastolic

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
			

			driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-und-0-value-datepicker-popup-0']")).sendKeys("4 Jun 2019");
			driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-und-0-value-timeEntry-popup-1']")).sendKeys("01:50am");

			driver.findElement(By.xpath("//input[@id='edit-field-bag-no-und-0-value']")).sendKeys("65");
			driver.findElement(By.xpath("//input[@id='edit-field-batch-no-und-0-value']")).sendKeys("65");
			driver.findElement(By.xpath("//input[@id='edit-field-donor-segment-number-und-0-value']")).sendKeys("65");

			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


			driver.findElement(By.xpath("//div[@id='edit_field_type_of_bag_und_chosen']")).click();
			driver.findElement(By.xpath(" //li[text()='  Double 450ml CPDA ']")).click();

			driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);



			driver.findElement(By.xpath("//select[@id='edit-field-components-to-be-prepared-und--2']")).click();
			driver.findElement(By.xpath("//option[text()='PC, FFP, Plt']")).click();

			WebElement ele11 = driver.findElement(By.id("edit-submit"));
			JavascriptExecutor executor11 = (JavascriptExecutor)driver;
			executor11.executeScript("arguments[0].click();", ele11);
			System.out.println("Registration ID field is required.\r\n" + 
					"Registration id information is not entered.\r\n" + 
					"Donor Name information is not entered.\r\n" + 
					"Donor Gender information is not entered.\r\n" + 
					"Camp Location should be provided for Blood Donation in Camps.\r\n" + 
					"Weight information is not entered.\r\n" + 
					"BP Systolic information is not entered.\r\n" + 
					"BP Diastolic information is not entered.");
	}

}
