package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

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
		
		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("Software");
		
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Dev");
		//firstname.clear();
		//firstname.sendKeys("Revathi");
		
		WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("Vignesh");
		
		String title1=driver.getTitle();
		
		System.out.println(title1);
		
		driver.findElement(By.name("departmentName")).sendKeys("Information Technology");
		
		driver.findElement(By.name("description")).sendKeys("IT Jobs");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revathivinoth05@gmail.com");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title2=driver.getTitle();
		
		System.out.println(title2);
		
		driver.findElement(By.className("subMenuButton")).click();
		
		WebElement company = driver.findElement(By.id("createLeadForm_companyName"));
		company.clear();
		company.sendKeys("Tech Park");
		
		WebElement firstname1 = driver.findElement(By.id("createLeadForm_firstName"));
		firstname1.clear();
		firstname1.sendKeys("Sriram");
		
		WebElement lastname1 = driver.findElement(By.id("createLeadForm_lastName"));
		lastname1.clear();
		lastname1.sendKeys("V");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title3=driver.getTitle();
		
		System.out.println(title3);
		//driver.close();
		}


	}

