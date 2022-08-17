package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;

public class mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2093906\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");
		Actions test = new Actions(driver);
		WebElement drag = driver.findElement(By.id("nav-link-accountList"));
		test.moveToElement(drag).perform();
		// WebElement drag =
		// driver.findElement(By.xpath("//div[@id=\"nav-flyout-ya-signin\"]//a[@class=\"nav-action-button\"]"));
		Thread.sleep(1000);
//		test.dragAndDropBy(drag, 1662, 81).perform();

		WebElement element = driver.findElement(By.className("nav-action-inner"));
		// System.out.println(element);
		// boolean testing = element.isDisplayed();
		Assert.assertTrue(element.isDisplayed());

		Thread.sleep(3000);

		driver.close();

	}

	public boolean test1() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2093906\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");
		Actions test = new Actions(driver);
		WebElement drag = driver.findElement(By.id("nav-link-accountList"));
		test.moveToElement(drag).perform();
		// WebElement drag =
		// driver.findElement(By.xpath("//div[@id=\"nav-flyout-ya-signin\"]//a[@class=\"nav-action-button\"]"));
		// Thread.sleep(1000);
//				test.dragAndDropBy(drag, 1662, 81).perform();

		WebElement element = driver.findElement(By.className("nav-action-inner"));
		// System.out.println(element);
		boolean testing = element.isDisplayed();
		Assert.assertTrue(testing);
		return testing;
	}

	public void testing() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2093906\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String w1 = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).getText();
		System.out.println(w1);
		String w2 = "Sign in";
		String w3 = "Sig";
		Assert.assertTrue(w1.equalsIgnoreCase(w2));
		// Assert.assertEquals(w1, w3);   /// this one is failing...

	}
}

//// downloding JUNIT
/// https://github.com/junit-team/junit4/wiki/Download-and-Install
