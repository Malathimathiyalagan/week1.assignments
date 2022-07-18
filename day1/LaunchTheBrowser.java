package Week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchTheBrowser {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			//load the url
			driver.get("http://leaftaps.com/opentaps/control/main");
			//max window
			driver.manage().window().maximize();
			//add wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
	        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.linkText("CRM/SFA")).click();
	         //click Leads
	         driver.findElement(By.linkText("Leads")).click();
	         //click create lead
	         driver.findElement(By.linkText("Create Lead")).click();
	         //Enter the company name
	         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Malathi");
	         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mathiyalagan");
	         driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Malathi");
	         driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
	         driver.findElement(By.id("createLeadForm_description")).sendKeys("description");
	         driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("malathi.mathiyalagan@gmail.com");
	         
	         WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	         Select drop2=new Select(state);
	         drop2.selectByIndex(3);
	        //handle the dropdown
	                 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	                //ctrl+2+l findElement returns WebElement
	                Select drop1=new Select(source);
	                //Select By visible text
	               drop1.selectByVisibleText("Conference");
	                //Select By value
	               // drop1.selectByValue("LEAD_DIRECTMAIL");
	                //Select by index
	                //drop1.selectByIndex(8);
			String title=driver.getTitle();
	        System.out.println(title);
	}

}
