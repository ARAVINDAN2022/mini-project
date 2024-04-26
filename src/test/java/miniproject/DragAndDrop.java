package miniproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void drag(WebDriver driver) throws Exception{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		//Using Actions to perform mouse action.
		Actions act=new Actions(driver);
		
		//Opening first web browser.
		try {
			driver.get(Excel.value());
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		//javaScript command to keep the drag and drop area in middle page.
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,300)");
		
		//locating source element and target element.
		WebElement s1=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement d1=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		   
		act.dragAndDrop(s1, d1).perform();
		   
		if(d1.getText().equals("Dropped!")) {
			   System.out.println("Verified 'Dropped!' message.");
		   }
		   
		else {
			   System.out.println("failed");
		   }
		
		driver.navigate().to(Excel.value());
	}

}
