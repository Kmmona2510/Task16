package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeChrome {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();      //Launch the Browser
		
		driver.navigate().to("https://www.demoblaze.com/");     //Load the url
		
		driver.manage().window().maximize();   //maximize the window
		
		String title = driver.getTitle();       //to get the current page title
		
		System.out.println("The Title of the website :"  +title);    //print the title
		
		if(title.equals("STORE")) {                                  //validate using the current title
			System.out.println("Page Landed on correct website");     //print the expected result
		} else {
			System.out.println("Page not landed on the correct website");     //else print the not expected result
		}

		driver.close();                    //close the driver
		
	}

}
