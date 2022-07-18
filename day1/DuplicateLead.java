package Week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        
	        driver.findElement(By.linkText("Leads")).click();
	        
	        driver.findElement(By.linkText("Create Lead")).click();
	         
	        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Malathi");
	        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mathiyalagan");
	        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Malathi");
	        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
	        driver.findElement(By.id("createLeadForm_description")).sendKeys("description");
	        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("malathi.mathiyalagan@gmail.com");
	        
	        
	        WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
            Select drop1=new Select(source);
	        drop1.selectByIndex(4);
	        
	        WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	        Select drop2=new Select(state);
	        drop2.selectByVisibleText("New York");
	        
			String title=driver.getTitle();
	        System.out.println(title);
             WebElement c = driver.findElement(By.id("createLeadForm_companyName"));
             c.clear();
             //input text after clear
             c.sendKeys("Selenium");
             //sending ctrl+a by Keys.Chord()
             String s=Keys.chord(Keys.CONTROL,"a");
             //sending DELETE key
             c.sendKeys(s);
             c.sendKeys(Keys.DELETE);
             
             WebElement f = driver.findElement(By.id("createLeadForm_firstNameLocal"));
             f.clear();
             f.sendKeys("Rajsuresh");
             driver.findElement(By.name("submitButton")).click();
             //close drive
             //driver.close();
            
			  
	        
	}

}
