package testdata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnRegex {

	public static WebDriver driver;
	
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rahulsingh/Desktop/MyComputer/Automation/Drivers/chromedriver_91");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/Meatup-Chicken-Flavour-Biscuit-Treats/product-reviews/B079T87VW1/ref=cm_cr_dp_d_show_all_btm?ie=UTF8&amp;reviewerType=all_reviews");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		List<WebElement> storeReview = driver.findElements(By.xpath("//span[@data-hook='review-body']"));
		
		FileWriter fr = null;
		BufferedWriter buffer = null;
		File file = new File("/Users/rahulsingh/Desktop/MyComputer/Test Data/AmazonReviewComments.rtf");
		
		try
		{
			fr = new FileWriter(file.getAbsolutePath());
			buffer = new BufferedWriter(fr);
	
			for(WebElement reviewBodyText : storeReview)
			{
				buffer.write(reviewBodyText.getText());
				buffer.newLine();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				buffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void tearDown()
	{
		driver.quit();
	}
	
	public static void main(String[] args)
	{
		LearnRegex run = new LearnRegex();
		run.setUp();
		run.tearDown();
	}
	
	

}
