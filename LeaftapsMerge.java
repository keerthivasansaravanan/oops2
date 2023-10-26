package week5day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsMerge {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Enter the username as DemoSalesManager
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Enter the password as crmsfa
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);

		
		//click the crmsfa hyper link
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//to create a lead
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Merge Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='From Lead']/following::img[1]")).click();
		
		
		Set<String> childWindow = driver.getWindowHandles();
		
		List<String> OpenWindow=new ArrayList<String>(childWindow);
		
		//move the control to child window
		driver.switchTo().window(OpenWindow.get(1));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		
		//again move the control to parent window
		
		driver.switchTo().window(OpenWindow.get(0));
		
		//click on to lead
        
		driver.findElement(By.xpath("//span[@class='requiredField']/following::img[2]")).click();
        
		//to get the window handles
        
		Set<String> childWindow1 = driver.getWindowHandles();
        List<String> OpenWindow1=new ArrayList<String>(childWindow1);
		
        //move the control to child window 2
		
        driver.switchTo().window(OpenWindow1.get(1));
		
		//click on any resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/following::a[12]")).click();
		
		driver.switchTo().window(OpenWindow1.get(0));
		//to merge
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//alert
		driver.switchTo().alert().accept();
}
}
