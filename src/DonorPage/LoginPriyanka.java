package DonorPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPriyanka {
	public static void myMethod(){
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
				
					public static void main(String[] args) throws InterruptedException {
					WebDriver driver=new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.get("http://dev.ebloodbanking.com/");
					driver.manage().window().maximize();
					driver.findElement(By.id("edit-name")).sendKeys("test_admin");
					driver.findElement(By.id("edit-pass")).sendKeys("test_admin6767!");
					driver.findElement(By.id("edit-submit")).click();
	  }

					
}
