package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("RevathiVinoth");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.id("groupNameLocal")).sendKeys("Revathi");
		
		driver.findElement(By.id("officeSiteName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("annualRevenue")).sendKeys("70000/-");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select ind = new Select(industry);
		ind.selectByValue("IND_SOFTWARE");
		
		WebElement owner1 = driver.findElement(By.name("ownershipEnumId"));
		Select own1 = new Select(owner1);
		own1.selectByVisibleText("S-Corporation");
		
		WebElement source1 = driver.findElement(By.id("dataSourceId"));
		Select so = new Select(source1);
		so.selectByValue("LEAD_EMPLOYEE");
		
		WebElement market = driver.findElement(By.id("marketingCampaignId"));
		Select mar = new Select(market);
		mar.selectByIndex(6);
		
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select pro = new Select(state);
		pro.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		
		System.out.println(title);
		
}
}
