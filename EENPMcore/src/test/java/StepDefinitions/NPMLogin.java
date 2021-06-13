package StepDefinitions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import cucumber.api.java.it.Date;

public class NPMLogin {

	static WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String date1;

	public void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\smukka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://eenpmdr.nat.bt.com/eenpmui/#/ee-npm/subdashboards/06f5oO");
		driver.manage().window().maximize();

	}

	public void Login(String username, String Pwd) {
		driver.findElement(By.name("USER")).sendKeys(username);
		driver.findElement(By.name("PASSWORD")).sendKeys(Pwd);
		driver.findElement(By.xpath("//input[@class='button']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Yes = driver.findElement(By.xpath("//input[@class='button'][1]"));
		Yes.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(By.xpath(
				"//mat-radio-button[label[@class='mat-radio-label'][1]][2]//div[@class='mat-radio-container']//div[2]")));
		driver.findElement((By.id("signIn"))).click();
	}

	public void Manage() {
		driver.findElement(By.xpath("//ul//li//span[contains(text(),'Manage KPI')]")).click();

	}

	public void Creation() {
		// date time
		DateFormat dateFormat = new SimpleDateFormat("MMddyyyy HH");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		System.out.println(date1);
		WebElement KPIname = driver.findElement(By.xpath("//input[@formcontrolname='name']"));
		KPIname.sendKeys("Search KPI Name" + date1);
		WebElement Description = driver.findElement(By.xpath("//input[@formcontrolname='description']"));
		Description.sendKeys("Search KPI Description" + date1);

	}

	public void Config() {
		driver.findElement(By.xpath("//div[text()='KPI Configuration']")).click();
	}

	public void Formula() {
		driver.findElement(By.xpath("//mat-list[@class='col-sm-12 mat-list ng-star-inserted']//mat-list-item[5]"))
				.click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//mat-checkbox[@class='col-sm-12 mat-checkbox mat-accent ng-star-inserted'][3]//div//div[@class='mat-checkbox-background']//following::span[1][@class='mat-checkbox-label']")));
		driver.findElement(By.xpath(
				"//mat-checkbox[@class='col-sm-12 mat-checkbox mat-accent ng-star-inserted'][3]//div//div[@class='mat-checkbox-background']//following::span[1][@class='mat-checkbox-label']"))
				.click();
		driver.findElement(By.xpath(
				"//mat-checkbox[@class='col-sm-12 mat-checkbox mat-accent ng-star-inserted'][4]//div//div[@class='mat-checkbox-background']//following::span[1][@class='mat-checkbox-label']"))
				.click();
		driver.findElement(By.xpath(
				"//div[@class='col-sm-12 rm-col-padding']//button[@class='numkey mat-button ng-star-inserted'][16]"))
				.click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(1000,0)");
		// js.executeScript("window.scrollBy(1000,0)");
		driver.findElement(By.xpath(
				"//div[@class='col-sm-12 rm-col-padding']//button[@class='selected-counter mat-button ng-star-inserted'][1]"))
				.click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,1000)");
		driver.findElement(By.xpath(
				"//div[@class='col-sm-12 rm-col-padding']//button[@class='numkey mat-button ng-star-inserted'][11]"))
				.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement max = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='col-sm-12 rm-col-padding']//button[@class='numkey mat-button ng-star-inserted'][17]")));
		max.click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(3000,0)");
		// js.executeScript("window.scrollBy(3000,0)");
		driver.findElement(By.xpath("//button[@class='selected-counter mat-button ng-star-inserted'][2]")).click();

	}

	public void Save() {
		driver.findElement(By.xpath(
				"//div[@class='pull-right ng-star-inserted']//button[@class='mat-raised-button mat-primary'][2]"))
				.click();
	}

	public void Edit() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		DateFormat dateFormat = new SimpleDateFormat("MMddyyyy HH");
		Date date = new Date();
		String date1 = dateFormat.format(date);

		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement Search = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchFilter']")));
		Search.sendKeys("Search KPI Name" + date1);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement KPI = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//mat-table//mat-row//mat-cell[contains(text(),'Search KPI Name')]")));
		String Name = KPI.getText();
		System.out.println(Name);

		driver.findElement(
				By.xpath("//mat-cell[contains(text(),'Search KPI Name')]/following-sibling::mat-cell[5]//a[1]"))
				.click();

		WebElement KPIname = driver.findElement(By.xpath("//input[@formcontrolname='name']"));
		KPIname.sendKeys(" edited");
		driver.findElement(By.xpath("//div[text()='KPI Configuration']")).click();
		driver.findElement(By.xpath(
				"//div[@class='col-sm-12 rm-col-padding']//button[@class='numkey mat-button ng-star-inserted'][11]"))
				.click();
		driver.findElement(By.xpath(
				"//div[@class='col-sm-12 rm-col-padding']//button[@class='numkey mat-button ng-star-inserted'][1]"))
				.click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(3000,0)");
		driver.findElement(By.xpath(
				"//div[@class='pull-right ng-star-inserted']//button[@class='mat-raised-button mat-primary'][2]"))
				.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement KPIedited = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//mat-table//mat-row//mat-cell[contains(text(),'Search KPI Name')]")));
		String KPIedit = KPIedited.getText();
		System.out.println(KPIedit);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	
		WebElement Delete =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-cell[contains(text(),'Search KPI Name')]/following-sibling::mat-cell[5]//a[2]//i")));
		Delete.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		Actions act = new Actions(driver);
		WebElement Del = driver.findElement(By.xpath("//button//span[text()='Yes']"));
		act.moveToElement(Del).build().perform();
		Del.click();
		}
	

	public void Adminset() {
		driver.findElement(By.xpath("//ul//li//span[contains(text(),'Admin Settings')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//ul[@id='sub-menu-3']//div[1]//div[1]//li[3]//a")).click();
	}

	public void Dashname() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		DateFormat dateFormat = new SimpleDateFormat("MMddyyyy HH");
		Date date = new Date();
		String date1 = dateFormat.format(date);

		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement Name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='col-md-12']//input[@class='form-control form-control-no ng-untouched ng-pristine ng-invalid']")));
		Name.sendKeys("Dashboard Test" + date1);

	}

	public void Rep1Name() {
		WebElement Repname = driver.findElement(By.xpath(
				"//input[@class='form-control form-control-no report-name ng-untouched ng-pristine ng-invalid']"));
		Repname.sendKeys("Report Name1");
	}

	public void Drag1() {
		WebElement From1 = driver.findElement(By.xpath("//div[@class='row report-type']//ul//li[3]"));
		WebElement To1 = driver.findElement(By.xpath("//div[@class='no-image-msg text-center ng-star-inserted']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(From1, To1).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement From2 = driver.findElement(By.xpath("//div[@class='row report-type']//ul//li[8]"));
		WebElement To2 = driver
				.findElement(By.xpath("//div[@class='row report-type selected ui-droppable highlight']"));
		act.dragAndDrop(From2, To2).build().perform();
	}

	public void addmore() {
		driver.findElement(By.xpath("//div[@class='pull-right']//span")).click();
	}

	public void Rep2Name() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Name = driver.findElement(By.xpath(
				"//input[@class='form-control form-control-no report-name ng-untouched ng-pristine ng-invalid']"));
		Actions act = new Actions(driver);
		act.moveToElement(Name).doubleClick().sendKeys("Report Name 2").build().perform();

	}

	public void createdash() 
	{
		WebElement From1 = driver.findElement(By.xpath("//div[@class='row report-type']//ul//li[4]"));
		WebElement To1 = driver.findElement(By.xpath("//div[@class='no-image-msg text-center ng-star-inserted']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(From1, To1).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement From2 = driver.findElement(By.xpath("//div[@class='row report-type']//ul//li[9]"));
		WebElement To2 = driver.findElement(By.xpath("//input[@class='form-control form-control-no report-name ng-dirty ng-valid ng-touched']/following::div[@class='row report-type selected ui-droppable highlight'][1]"));
		act.dragAndDrop(From2, To2).build().perform();

	}

	public void Access() {
		
		driver.findElement(By.xpath("//div[@class='pull-right']//a[@class='btn btn-primary ng-star-inserted']")).click();
		
		Actions act = new Actions(driver);
		WebElement Power = driver.findElement(By.xpath("//li[@class='col-md-4 ng-star-inserted']//div//label[text()='Power User All']"));
		act.moveToElement(Power).build().perform();
		Power.click();
		WebElement Yes = driver.findElement(By.xpath("//div[@id='profilesPopup']//button[@class='btn btn-primary' and @data-dismiss='modal']"));
		act.moveToElement(Yes).build().perform();
		Yes.click();
		}
}
