package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	// Launches new browser for every execution
	public static void main(String[] args) {
		
		// Setup the driver
		WebDriverManager.chromedriver().setup();
		
		// Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		// Load the url (get)
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Identify username field and enter the username
		driver.findElement(By.id("username")).sendKeys("democsr");
		
		// Identify password field and enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click on Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Inputting Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		
		////Inputting FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangavi");
		
		//Inputting lastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ezhilan");
		
		//Inputting First LocalName
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("sangavie");
		
		//Inputting Department Name
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		
		//Inputting Description content
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Working as a Test Engineer");
		
		//Inputting Email ID
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sangi.kings@gmail.com");
		

		// Step1: Find the dropdown element (select tag)
        WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        
		// Step2: Convert that to Select class (Dropdown)
        Select obj=new Select(dropdown);
        
     // Step3: Choose the value from Dropdown
		
     		// 1. Select by visible text
        obj.selectByVisibleText("Florida");
        
        //Click submit Button
       driver.findElement(By.className("smallSubmit")).click();
       
       //To get resultant page title
       String title = driver.getTitle();
        System.out.println(title);
}

}
