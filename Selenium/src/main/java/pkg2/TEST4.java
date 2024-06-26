package pkg2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TEST4 {

	public static void main(String[] args) {
		String url1 = "https://www.youtube.com/";
		String url2 = "https://www.whereby.com/";
		String url3 = "https://www.amazon.in/";
		int wait = 0;
		
		for(int i =0;i<3;i++) {
			WebDriver dr1 = new EdgeDriver();
			dr1.manage().window().maximize();
			dr1.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
		
		String[] arr = new String[]{url1,url2,url3};
		
		
			dr1.get(arr[i]);
			
			//dr1.manage().window().minimize();
		
			
		}

	}

}
