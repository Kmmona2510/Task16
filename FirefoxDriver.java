package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class FirefoxDriver {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();   //Launch the driver i didn't have a firefox browser so i used chromedbrowser
		
		driver.manage().window().maximize();  //maximize the window 
		
		driver.navigate().to("https://www.google.com/");     //navigate the url
		
		String currenturl= driver.getCurrentUrl();            //get the current page url using getCurrentUrl() method
		
		System.out.println("The Current Url is:"  +currenturl);      //print the current url
		
		driver.navigate().refresh();                               //reload the page
		
		driver.close();                                      //close the driver
		
		
		

	}

}
