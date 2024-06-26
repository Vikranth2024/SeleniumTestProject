package pkg2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;

public class ImplicitWaitExample {

    public static void main(String[] args) {
        WebDriver dr1 = new EdgeDriver();
        
        dr1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        for(int i =0;i<3;i++) {
			dr1.manage().window().maximize();
			dr1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String[] arr = new String[]{"https://www.youtube.com/","https://www.whereby.com/","https://www.amazon.in/"};
		
			dr1.get(arr[i]);
			
			dr1.manage().window().minimize();
    }
    }}

