package p;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class c1 {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
/*	
System.setProperty("webdriver.chrome.driver","C:\\Users\\sushil\\Downloads\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
*/
System.setProperty("webdriver.chrome.driver","C:\\Users\\sushil\\Downloads\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
//driver.close();
//
//String title=driver.getTitle();
//System.out.println(title);
//String url=driver.getCurrentUrl();
//System.out.println(url);
//driver.navigate().to("https://www.nokia.com/");
//Thread.sleep(10);
//driver.navigate().to("https://www.coca-cola.com/us/en");
//
//Thread.sleep(10);
//driver.navigate().back();
//Thread.sleep(10);
//driver.navigate().forward();
//driver.navigate().refresh();
////driver.quit();
driver.get("https://www.facebook.com/");
/*driver.findElement(By.id("email")).sendKeys("5");
driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).sendKeys("5");
driver.findElement(By.linkText("Forgotten password?")).click();
driver.findElement(By.partialLinkText("Create a")).click();
*/
Thread.sleep(10);
driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(10);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("s");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("s");

WebElement Day=driver.findElement(By.id("day"));
Select s=new Select(Day);
s.selectByIndex(1);
s.selectByValue("4");
s.selectByVisibleText("6");


WebElement Month=driver.findElement(By.id("month"));
Select s1=new Select(Month);
s1.selectByValue("5");
Thread.sleep(2);
s1.selectByIndex(3);
s1.selectByVisibleText("Feb");
/*
List<WebElement> allselect=s1.getAllSelectedOptions();
for(WebElement ww:allselect)
{System.out.println(ww.getText());
	}

WebElement firstselected=s1.getFirstSelectedOption();
String a=firstselected.getText();
System.out.println(a);

boolean mul=s1.isMultiple();
System.out.println(mul);

List <WebElement> Dummy=s1.getOptions();
for(WebElement r1:Dummy)
{System.out.println(r1.getText());
	}

//driver.findElement(By.xpath("//input[@value='1']")).click();
boolean av =driver.findElement(By.xpath("//input[@value='1']")).isDisplayed();
boolean av1 =driver.findElement(By.xpath("//input[@value='1']")).isEnabled();
boolean av2 =driver.findElement(By.xpath("//input[@value='1']")).isSelected();

List<WebElement> www=driver.findElements(By.xpath("//input[@type='radio']"));
System.out.println(www.size());

String Exp="Male";
for(int i=0;i<www.size();i++)
{if(www.get(i).getText().equalsIgnoreCase(Exp))
		{www.get(i).click();
	
		}

	}
System.out.println(av);
System.out.println(av1);
System.out.println(av2);
//WebElement Months=driver.findElement(By.id("year"));
//Select s3=new Select(Months);

//s3.selectByValue("2013");

//driver.findElement(By.id("year"));
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.google.co.in/");
driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Redmi");
List<WebElement> Listq=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
String Expe="redmi note 14";
for(int i=0;i<Listq.size();i++)
	
{if(Listq.get(i).getText().equalsIgnoreCase(Expe))
{Listq.get(i).click();
break;
}	}

driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
driver.get("https://www.google.co.in/");
driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("navy");

List<WebElement> Listqq=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
String Expt="Navya Naveli Nanda";
for(WebElement lk: Listqq)
{System.out.println(lk.getText().equalsIgnoreCase(Expt));
lk.click();
	}
	
	*/
/// Read Data from Excel sheets
//Make Object of FileInputStream Class give Path to Excel sheet
FileInputStream file = new FileInputStream("E:\\Book1.xlsx");

//Create Excel sheet by using Static method Create which present in WorkBookFactory interface


Workbook Book=WorkbookFactory.create(file);
//Create sheetS=
Sheet sh=Book.getSheet("Sheet1");
//getRow
Row rw=sh.getRow(0);
//get Cell
Cell cl=rw.getCell(0);
// getStringCellValue
String StringValue=cl.getStringCellValue();
System.out.println(StringValue);

}}
