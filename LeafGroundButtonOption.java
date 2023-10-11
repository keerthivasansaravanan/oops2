package week4day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.xpath("//li[@id='menuform:j_idt38']/a")).click();
		driver.findElement(By.className("rotated-icon")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']/span")).click();
		driver.navigate().back();

	}

}
