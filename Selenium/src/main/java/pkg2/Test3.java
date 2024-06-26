package pkg2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test3 {

	public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://youtube.com/");
	WebElement searchbox = driver.findElement(By.name("search_query"));
	searchbox.sendKeys("Sangamone");
	searchbox.submit();
	
	driver.findElement(By.xpath("(//yt-formatted-string[contains(text(),'SangamOne Connnected')])[1]")).click();
	driver.findElement(By.xpath("(//img[@class='yt-core-image yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded'])[12]")).click();
	
	////*[@id="video-title"]
	
			

	}

}
