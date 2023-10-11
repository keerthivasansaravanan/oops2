package week4day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.id("j_idt88:name")).sendKeys("keerthi");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("tamilnadu");
		WebElement selected=driver.findElement(By.id("j_idt88:j_idt93"));
		boolean ele = selected.isEnabled();
		System.out.println(ele);
		if(true) {
			System.out.println("it is enabled");
		}//else {
			//System.out.println("it is disabled");
		//}
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		String attribute = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(attribute);

	}

}
