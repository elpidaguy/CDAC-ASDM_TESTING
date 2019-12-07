package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebook {

	public static void main(String[] args) 
	{
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dac\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.marionette","C:\\Users\\dac\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		 
        //Launch the Online Store Website
		driver.get("http://www.facebook.com");
		String actualTitle="";
		actualTitle=driver.getTitle();
		
		if(actualTitle.equals("Facebook – log in or sign up"))
		{
			driver.findElement(By.name("firstname")).sendKeys("testAcc");
			driver.findElement(By.name("lastname")).sendKeys("forTesting");
			driver.findElement(By.name("reg_email__")).sendKeys("hopolak799@imail1.net");
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hopolak799@imail1.net");
			driver.findElement(By.name("reg_passwd__")).sendKeys("cdacactsaug2019");
			driver.findElement(By.name("birthday_day")).sendKeys("13");
			driver.findElement(By.name("birthday_month")).sendKeys("JUNE");
			driver.findElement(By.name("birthday_year")).sendKeys("1996");
			driver.findElement(By.id("u_0_7")).click();
			driver.findElement(By.name("websubmit")).click();
			
			if(driver.getTitle().equals("Facebook"))
			{
				System.out.println("Test Success");
			}
		}
		else
			System.out.println("test failed");
 
        // Print a Log In message to the screen
       // System.out.println("Successfully opened the website ");
		
		
		//sleep 5 sec
//        try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
 
        // Close the driver
        //driver.quit();
    }

}


