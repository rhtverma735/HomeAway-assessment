package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetupWebdriver {
	
	public static WebDriver driver;
	
	
	public SetupWebdriver(){
		
		if(driver==null){
		driver = new FirefoxDriver();
		driver.get("http://store.demoqa.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		}	
		}
	
	public static void closeBrowser(){
		
		driver.quit();
	}

}
