package pkg2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test5 { 

	public static void main(String[] args) {
		String url1 = "https://www.funwithprogramming.com/python1.html";
		String url2 = "https://www.funwithprogramming.com/java2.html";
		String url3 = "https://www.funwithprogramming.com/web1.html";
		String part1 = "window.open('";
		String part3 = "');";
		String str1="";
		String[] urls = {url1,url2,url3};
		WebDriver dr1 = new EdgeDriver();
		dr1.manage().window().maximize();
		
		for(int i=0;i<3;i++) {
			str1 = part1+urls[i]+part3 ;
			dr1.get(urls[i]);
			dr1.getWindowHandle();
			((JavascriptExecutor)dr1).executeScript(str1);
		}	
	}
}
