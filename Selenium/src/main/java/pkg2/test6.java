package pkg2;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test6 {

    public static void main(String[] args) {
        // Create a single WebDriver instance
        WebDriver dr1 = new EdgeDriver();

        // Set the implicit wait once (before any find element calls)
      

        String[] arr = new String[]{"https://www.youtube.com/", "https://www.whereby.com/", "https://www.amazon.in/"};

        for (int i = 0; i < 3; i++) {
        	//dr1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            dr1.manage().window().maximize();
            dr1.get(arr[i]);
            dr1.manage().window().minimize();
        }
        dr1.quit();
    }
}
