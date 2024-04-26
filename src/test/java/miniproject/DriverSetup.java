package miniproject;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class DriverSetup {
           static WebDriver driver;
		public static WebDriver getWebDriver() throws Exception {
			Scanner sc = new Scanner (System.in);
			int input=0;
			try {
          	   System.out.println("Enter your preferred driver 1--Edge or 2--chrome");
        	   input=sc.nextInt();
			}
			catch(Exception e) {
				System.err.println("Invalid input!...");
				System.exit(0);
			}
			sc.close();
        	   
        	  try {
	        	  if(input==1) {
	        		  System.setProperty("Webdriver.edge.driver","path_to_edgedriver");
	        		  driver= new EdgeDriver();
	        	  }
	        	  else if (input==2) {
	        		  System.setProperty("Webdriver.chrome.driver","path_to_chromedriver");
	        		  driver= new ChromeDriver();
	        	  }
	        	  else { 
	        		  
	        	  	  throw new Exception("Invalid input!...");
	        	  }
        	  
        	  }
        	  catch(Exception e) {
        		  System.err.println(e.getMessage()); 
        		  System.exit(0);
        	  }
      	      
        	  return driver;
        	  
        	  
           }
}
