package Testpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demopro {

	@Test
	public void Logintest()
    {
    	System.out.println("Test Started");
    	//create driver
    	//"C:\Users\ARJNSGFST\Downloads\chromedriver-win64\chromedriver-win64\chromedriver.exe"
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ARJNSGFST\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	sleep(1);
    	
    	System.out.println("Browser started");
    	// this comment is just for checking changes in git 
    	
    	//OPEN TEST PAGE
    	String url="http://localhost:9090/webapp_1/";
    	driver.get(url);
    	driver.manage().window().maximize();
    	
    	
    	System.out.println("page is opened");
    	
    	//click register here
    	WebElement register=driver.findElement(By.xpath("//body/form[@action='login.jsp']//table/tbody/tr[4]/td/a[@href='register.jsp']"));
    	register.click();
    	sleep(1);
    	System.out.println("Register button clicked");
    	
    	//Enter first name
    	WebElement firstname=driver.findElement(By.xpath("/html/body/form[@action='userRegistration.jsp']//table//input[@name='firstName']"));
    	firstname.click();
    	firstname.sendKeys("Arjun");
    	sleep(1);
    	System.out.println("First name testing done");
    	//enter last name
    	WebElement Lastname=driver.findElement(By.xpath("/html/body/form[@action='userRegistration.jsp']//table//input[@name='lastName']"));
    	Lastname.click();
    	Lastname.sendKeys("Singh");
    	sleep(1);
    	System.out.println("Last  name testing done");
    	
    	
    	
    	driver.close();
    	System.out.println("Test finished");
    }

	private void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	
}
