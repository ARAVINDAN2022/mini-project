package miniproject;

import org.openqa.selenium.WebDriver;

public class Main {
	public static void main(String args[]) throws Exception {
		WebDriver driver=DriverSetup.getWebDriver();
		DragAndDrop.drag(driver);
		DateSelector.select(driver);
		System.out.println("Test execution completed successfully!");
		driver.quit();
	}
}
