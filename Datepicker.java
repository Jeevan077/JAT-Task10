package jattask10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		//Question 1
		
		//Launching chrome browser
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/chrome/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Navigating to datepicker browser
		
		driver.navigate().to("https://jqueryui.com/datepicker/");
		
		//Switching to iframe that contains date picker

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//clicking on the date field
		driver.findElement(By.id("datepicker")).click();
		
		//clicking the next button to go to next month
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		
		
		//Selecting the date 22
		WebElement date=driver.findElement(By.xpath("//a[text()='22']"));
		date.click();
		
		//Printing the selected date
		String pickeddate=date.getText();
		System.out.println("The selected date is : " +pickeddate);
		
		//Closing the browser window
		driver.close();
		
		//Quitting the WebDriver instance
		driver.quit();
	}	

	}

//Output :
//The selected date is : 22


