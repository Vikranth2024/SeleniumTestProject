package pkg2;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement searchBox=driver.findElement(By.xpath("(//input[@placeholder='Search for Products, Brands and More'])[1]"));
		searchBox.sendKeys("iphone 15 pro max");
		searchBox.submit();
		
		
		String mainPage = driver.getWindowHandle();
		System.out.println("Main page="+ mainPage);
		driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 15 Pro Max (Blue Titanium, 256 GB)']")).click();
		Set<String> allPages=driver.getWindowHandles();
		System.out.println(allPages);
		for(String page : allPages) {
			if(!page.equals(mainPage)) {
				driver.switchTo().window(page);
				break;
			}
			driver.findElement(By.name("NOTIFY ME")).click();
		}
		
		}
		
	}

