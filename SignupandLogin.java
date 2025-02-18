package jattask10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupandLogin {

	public static void main(String[] args) {
		// Question 3
		
		//Launching Guvi website
	    WebDriver driver =new ChromeDriver();
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Locating and clicking signup button
		driver.findElement(By.partialLinkText("Sign up")).click();
		
		//Filling the signup form
		driver.findElement(By.id("name")).sendKeys("Jeevan Sanjay");
		driver.findElement(By.id("email")).sendKeys("jeevanreigns2022@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Dhoni@07");
		driver.findElement(By.id("mobileNumber")).sendKeys("9080810935");
		
		//Clicking on signup button
		driver.findElement(By.id("signup-btn")).click();
		
		//Navigating to previous page
		driver.navigate().back();
		
		//Locating and clicking login button
		driver.findElement(By.id("login-btn")).click();
		
		//Some error in this login page so email is showing issue here
		//Filling the login form with email and password
		driver.findElement(By.id("email")).sendKeys("jeevanreigns2022@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Dhoni@07");
		
		//Clicking on login button
		driver.findElement(By.className("btn login-btn")).click();
		
		//Verifying the user logged in successfully
		String title=driver.getTitle();
		System.out.println("Title of the current page after login is : " +title);
		
		//Closing the browser
		driver.close();
		
		
		
		

	}

}
