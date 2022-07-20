package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewClass {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2093906\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");
		Actions test = new Actions(driver);
		test.keyDown(Keys.CONTROL).sendKeys("a").perform();
		test.keyUp(Keys.CONTROL);
		
		Thread.sleep(2000);
		
		driver.get("C:\\Users\\2093906\\Desktop\\Web_Programming\\Xyz\\text.txt");
		Actions test1 = new Actions(driver);
		test1.keyDown(Keys.CONTROL).sendKeys("a").perform();
		test1.keyUp(Keys.CONTROL);
		test1.keyDown(Keys.CONTROL).sendKeys("c").perform();
		test1.keyUp(Keys.CONTROL);
		Thread.sleep(2000);
		driver.get("C:\\Users\\2093906\\Desktop\\Web_Programming\\Xyz\\xyz.html");
		WebElement a = driver.findElement(By.id("paste"));
		a.click();
		test1.keyDown(Keys.CONTROL).sendKeys("v").perform();
		test1.keyUp(Keys.CONTROL);
		
		//+Thread.sleep(2000);
		
		// we can do mouse left click by both actions class and driver but the right click of the mouse is only done by the actions.

		
		
		//		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction");
//		driver.get("https://www.amazon.ca/");
//		WebElement te = driver.findElement(By.id("nav-link-accountlist"));
//		test.contextClick(te);
		
		
		// extension of coordinate
		//https://chrome.google.com/webstore/detail/coordinates/bpflbjmbfccblbhlcmlgkajdpoiepmkd
		Thread.sleep(2000);
		
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		test.dragAndDropBy(drag, 1000, 50).perform();
		Thread.sleep(1000);
		test.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(5000);
        driver.close();
	}
}
