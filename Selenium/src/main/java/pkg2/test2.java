package pkg2;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class test2 {

	public static void main(String[] args)throws FileNotFoundException {
		Map<String,String> map1 = new HashMap<>();
		File f1 = new File("flipkart.txt");
		Scanner sc = new Scanner(f1);
		String str1 = sc.nextLine();
		String[] arr1 = str1.split(":",2);
		map1.put(arr1[0],arr1[1]);
		String url1 = "https://www.flipkart.com";
		System.out.println(url1);
		WebDriver wd1 = new EdgeDriver();
		wd1.get(map1.get("url1"));
		
		
	}
}