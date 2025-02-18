package jattask10;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException{
		// Question2
		
		//Launching chrome browser
	    WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/chrome/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		try {
	   //Navigating to jQueryU1 Droppable browser
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		//Wait for iframe to load
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));
		
		
		//Locating the source element
		WebElement sourceelement=driver.findElement(By.id("draggable"));
		
		//Locating the target element
		WebElement targetelement=driver.findElement(By.id("droppable"));
		
		//Performing drag and drop operation
		//Using action cls to perform 
		Actions ObjAct=new Actions(driver);
		ObjAct.dragAndDrop(sourceelement, targetelement).build().perform();
		
		//verifying the color property of the target elements CSS after the drop
		String targetBackgroundcolor= targetelement.getCssValue("background-color");
		System.out.println("Target elements background color is :" +targetBackgroundcolor);
		
		//Check if the background color matched and drag drop operation
		if(targetBackgroundcolor.equals("rgba(255, 250, 144, 1")) {
			System.out.println("The background color is correct");
		}
		else
		{
			System.out.println("The background color is incorrect");
		}
		
		//Verifying the text of the target element changed to "Dropped!"
		String targettext=targetelement.getText();
		if(targettext.equals("Dropped!"))
				{
			        System.out.println("Text has successfullly changed to 'Dropped!'");
				}else
				{
					System.out.println("Text has failed to change");
				}
		
		
		} catch(Exception e)
		{
			e.printStackTrace();
		}
}
}

/*
//Output:
Target elements background color is :rgba(255, 250, 144, 1)
The background color is incorrect
Text has successfullly changed to 'Dropped!'
*/
