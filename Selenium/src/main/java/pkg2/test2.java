package pkg2;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class test2 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("mobile phones");
		searchBox.submit();
		
		String mainPage = driver.getWindowHandle();
		System.out.println("Main page="+ mainPage);
		
		driver.findElement(By.xpath("//div[normalize-space()='Motorola G34 5G (Ocean Green, 128 GB)']")).click();
		
		Set<String> allPages=driver.getWindowHandles();
		for(String page : allPages) {
			if(!page.equals(mainPage)) {
				driver.switchTo().window(page);
				break;
			}
		}
		
		driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
	}

}