
//Hello 
package Sample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hello {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver web;
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\chromedriver.exe");
		web= new ChromeDriver();
		//System.out.println("Hello Java");
		
		web.manage().window().maximize();
		
		web.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		/*
		 * web.get("https://www.2shared.com/");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * web.findElement(By.id("upField")).sendKeys(
		 * "C:\\Users\\chinni\\Downloads\\toaz.info-qspiderselenium-complete-notespdf-pr_fedd29b931c7a8265b8ab52a0156cb29.pdf"
		 * );
		 * 
		 * Thread.sleep(2000);
		 */
		
		web.get("https://www.naukri.com/");
		
		Thread.sleep(2000);
		
		/*
		 * web.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * web.findElement(By.
		 * xpath("//input[contains(@placeholder,'Enter your active')]")).sendKeys(
		 * "b.hemanth1997@gmail.com");
		 * 
		 * web.findElement(By.
		 * xpath("//input[contains(@placeholder,'Enter your password')]")).sendKeys(
		 * "NaNi&143");
		 * 
		 * web.findElement(By.xpath("(//button[contains(text(),'Login')])[1]")).click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * web.findElement(By.xpath("//div[contains(text(),'UPDATE')]")).click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * web.findElement(By.id("attachCV")).
		 * sendKeys("C:\\Users\\chinni\\Downloads\\Hemanth CV.pdf");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement
		 * ele=web.findElement(By.xpath("//div[contains(text(),'My Naukri')]"));
		 * 
		 * Actions act = new Actions(web);;
		 * 
		 * act.moveToElement(ele).perform();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * web.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		 */
		String title="Resume Writing Services - CV - Bio data | Naukri Fastforward";
		
		WebElement ele= web.findElement(By.xpath("//div[contains(text(),'Jobs')]"));
		
		String parent= web.getWindowHandle();
		
		Actions act = new Actions(web);
		
		act.moveToElement(ele).click().perform();
		
		Thread.sleep(2000);
		
		String child=web.getWindowHandle();
		
		//web.switchTo().window(child);
		
		Thread.sleep(2000);
		
		WebElement ele1= web.findElement(By.xpath("//div[contains(text(),'Services')]"));
		
		act.moveToElement(ele1).click().perform();
		
		Thread.sleep(2000);
		
		Set<String> set=web.getWindowHandles();
		
	
		for(String s: set) {
			
			
			web.switchTo().window(s);
			
			System.out.println(web.getTitle());
			
			System.out.println(s);
			
			Thread.sleep(2000);
			
			if(title.equals(web.getTitle()))
			web.close();
		}
		
		
		
		
		
	}

}
