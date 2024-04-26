package miniproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class DateSelector {
	public static void select(WebDriver driver) {
		String  arr=DateFinder.Date();
		try {
			driver.findElement(By.id("datePickerMonthYearInput")).click();
			//first calendar
			List<WebElement> alldates=driver.findElements(By.xpath("//div[contains(@class,'react-datepicker')]"));
			for(WebElement e:alldates) {
				
				if(e.getText().equals(arr)){
					e.click();
					break;
					
				}
				
			}
		}
		catch(Exception f) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,300)");
			WebElement element1=driver.findElement(By.id("datePickerMonthYearInput"));
		  //	js.executeScript("argument[0].scrollIntoView(true);", element1);
			element1.click();
	      //first calendar
			List<WebElement> alldates=driver.findElements(By.xpath("//div[contains(@class,'react-datepicker')]"));
			for(WebElement e:alldates) {
				
				if(e.getText().equals(arr)){
					e.click();
					break;
					
				}
				
			}
		}
	//second calendar
		try {
			WebElement element=driver.findElement(By.xpath("//*[@id='dateAndTimePickerInput']"));
			element.click();	
			List<WebElement> all=driver.findElements(By.xpath("//div/following::div [contains(@class,'react-datepicker')]"));
			for(WebElement el:all) {
				
				if(el.getText().equals(arr)){
					el.click();
					break;
					
				}
				
				
			}
			List<WebElement> tm=driver.findElements(By.xpath("//*[contains(@class,'react-datepicker__time')]"));
	         for(WebElement e2:tm) {
				
				if(e2.getText().equals("06:00")){			
					e2.click();
					break;
					
				      }
	           }			
	          ScreenShot.sshot(driver);
		}
		catch(Exception e) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,300)");
			WebElement element=driver.findElement(By.xpath("//*[@id='dateAndTimePickerInput']"));
			element.click();	
			List<WebElement> all=driver.findElements(By.xpath("//div/following::div [contains(@class,'react-datepicker')]"));
			for(WebElement el:all) {
				
				if(el.getText().equals(arr)){
					el.click();
					break;
					
				}
				
				
			}
			List<WebElement> tm=driver.findElements(By.xpath("//*[contains(@class,'react-datepicker__time')]"));
	        for(WebElement e2:tm) {
				
				if(e2.getText().equals("06:00")){			
					e2.click();
					break;
					
				}
	        }
				
	        ScreenShot.sshot(driver);
		}
		
	}
}
