package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSampleCode {
	public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	//driver.get("http://www.amazon.in/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf",Keys.ENTER);
	
	WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
	firstname.sendKeys("Revathi");
	//firstname.clear();
	//firstname.sendKeys("Revathi");
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vinoth");
	
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select ra = new Select(source);
	ra.selectByVisibleText("Employee");
	
	WebElement find = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select indus = new Select(find);
	indus.selectByIndex(10);
	
	WebElement own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select owner = new Select(own);
	owner.selectByIndex(5);
	
	WebElement mark = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select pay = new Select(mark);
	pay.selectByValue("9001");
	
	WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	Select ind = new Select(country);
	ind.selectByVisibleText("India");
	
	driver.findElement(By.className("smallSubmit")).click();
	
	String title=driver.getTitle();
	
	System.out.println(title);
	
	//driver.close();
	}
}
