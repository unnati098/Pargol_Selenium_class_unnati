package class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class ClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2093906\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		/*
		 * AMAZON WITH RELATIVELOCATER
		 * 
		 * driver.get("https://www.youtube.com/watch?v=t0Q2otsqC4I");
		 * 
		 * 
		 * driver.navigate().to("https://www.amazon.com/"); // driver.navigate().back();
		 * driver.navigate().forward();
		 * driver.navigate().refresh(); 
		 * System.out.println(driver.getTitle()); 
		 * System.out.println(driver.getCurrentUrl());
		 * driver.findElement(By.id("nav-link-accountList")).click();
		 * driver.findElement(By.className("a-button-input")).click();
		 * 
		 * driver.findElement(By.id("createAccountSubmit")).click();
		 *  By emailLocator = RelativeLocator.with(By.tagName("input")).above(By.
		 * xpath("//label[contains(text(),'Mobile number or email')]"));
		 * driver.findElement(emailLocator).sendKeys("unnati@gmail.com");
		 * 
		 * 
		 * driver.findElement(By.linkText("Privacy Notice")).click();
		 * driver.navigate().to("https://www.amazon.com/");
		 * driver.navigate().back(); //driver.navigate().back();
		 */
		driver.get("C:\\Users\\2093906\\Desktop\\Web_Programming\\Xyz\\xyz.html");
		
		List <WebElement> list = driver.findElements(By.tagName("li"));
		
		for (WebElement lists : list) {
		    System.out.println( lists.getText());
		}
		
		driver.findElement(By.id("vehicle1")).click();
		driver.findElement(By.id("vehicle3")).click();
		
		Thread.sleep(2000);
		
		
		driver.navigate().to("https://www.google.com/");
		WebElement in = driver.findElement(By.name("q"));
		in.sendKeys("Unnati Patel");
		in.clear();
		
		in.sendKeys("amazon"+Keys.ENTER);
		driver.findElement(By.xpath("//span[contains(text(),'Amazon.ca Official Site - Low Prices. Fast Shippin')]")).click();
		WebElement amazon = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div/span"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(amazon);
		
		WebElement signin = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[13]/div[2]/a/span"));
		boolean answer = signin.isDisplayed();
		System.out.println(answer);
		Thread.sleep(3000);

        driver.close();
		}

}
