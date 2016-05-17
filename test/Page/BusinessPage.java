package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.SetupWebdriver;


public class BusinessPage extends SetupWebdriver {
	
	
	public static String first_name = "Rohit";
	public static String emptycart_msg = "Oops, there is nothing in your cart.";
	
	
	public int getExpectedPrice(){
		
	Actions action1 = new Actions(driver);
	action1.moveToElement(driver.findElement(By.xpath("//*[@id='menu-item-33']/a"))).perform();
	driver.findElement(By.xpath("//*[@id='menu-item-37']/a")).click();
	driver.findElement(By.xpath("//*[@id='default_products_page_container']/div[4]/div[2]/form/div[2]/div[1]/span/input")).click();
	driver.findElement(By.xpath("//*[@id='fancy_notification_content']/a[1]")).click();
	
	String total_price = driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[5]/span/span")).getText();
	//System.out.println(total_price);
	
	driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/a/span")).click();
	
	Select select = new Select(driver.findElement(By.xpath("//*[@id='current_country']")));
	select.selectByVisibleText("USA");
	
	driver.findElement(By.xpath("//*[@id='uniform-wpsc_checkout_form_16_region']/span")).sendKeys("minnesota");
	driver.findElement(By.xpath("//*[@id='change_country']/input[4]")).click();
	
	 int  exp_tp = Integer.parseInt(total_price.substring(1, 4));
	return exp_tp;
	}	
	
	public int getActualPrice(){
		String tp = driver.findElement(By.xpath("//*[@id='checkout_total']/span")).getText();
		//System.out.println(tp.substring(1, 4));
		
		int act_tp =  Integer.parseInt(tp.substring(1,4));
		return act_tp;
		
		
	}
	
	public void setAccountDetails_submit(){
		
		driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_2']")).sendKeys(first_name);
		driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_3']")).sendKeys("Verma");
		driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_4']")).sendKeys("115 second avenue south");
		driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_5']")).sendKeys("minneapolis");
		//driver.findElement(By.xpath("/*[@id='wpsc_checkout_form_6']")).sendKeys("Minnesota");
		driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_7']")).sendKeys("USA");
		driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_18']")).sendKeys("6124131740");
		driver.findElement(By.xpath("//*[@id='shippingSameBilling']")).click();
		driver.findElement(By.xpath("//*[@id='wpsc_shopping_cart_container']/form/div[4]/div/div/span/input")).click();
		
	}
	
	public String saveAccountDetails(){
		
		driver.findElement(By.xpath("//*[@id='account']/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='header_cart']/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/a/span")).click();
		String fname = driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_2']")).getAttribute("value");
		return fname;
	}
	
	public String deleteCart(){
		
		driver.findElement(By.xpath("//*[@id='header_cart']/a/em[2]")).click();
		driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[6]/form/input[4]")).click();
		String msg = driver.findElement(By.xpath("//*[@id='post-29']/div")).getText();
		//System.out.println(msg);
		return msg;
	}
	

}