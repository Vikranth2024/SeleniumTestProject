package pkg2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class OpenMultipleTabs {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        String[] urls = {
            "https://youtube.com", "https://amazon.com", "https://flipkart.com",
            
        };

        driver.get(urls[0]);

        for (int i = 1; i < urls.length; i++) {
            ((JavascriptExecutor) driver).executeScript("window.open('" + urls[i] + "', '_blank');");
        }

        for (String windowHandle : driver.getWindowHandles()) {
        	

            driver.switchTo().window(windowHandle);
        }
       
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        //driver.quit();
    }
}