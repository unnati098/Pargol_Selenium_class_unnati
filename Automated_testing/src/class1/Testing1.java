package class1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import graphql.Assert;

public class Testing1 {
	static WebDriver driver;
	@Test
	public void test() throws InterruptedException {
		//fail("Not yet implemented");
		mouse m1 = new mouse();
		m1.testing();
	}
	
	@Test
	public void create() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2093906\\Desktop\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
	public void test1() {
		//fail("Not yet implemented");
		create();
		driver.get("https://www.google.com/");
	}

}
