package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomCar {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/in/bangalore");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	
	

		WebElement ctry = driver.findElement(By.xpath("//input[@placeholder='Select country']"));
         Select drop2=new Select(ctry);
 		 drop2.selectByIndex(2);
 		
 		 
 		WebElement state =driver.findElement(By.xpath("//input[@placeholder='Search City']"));
		Select drop1=new Select(state);
		drop1.selectByIndex(3);
		//String title2 = driver.getTitle();
       // System.out.println(title2);
		driver.findElement(By.xpath("//button[@class='city-lightbox__confirm-button']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Pick Up City')]"));
		 
	}

}
