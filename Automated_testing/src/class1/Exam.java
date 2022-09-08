import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class JunitTest {
	static WebDriver driver;
	@Before
	public void DriverLoad() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",
				"chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/install.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	@Test
	public void getUrl() {
		String s = driver.getCurrentUrl();
		String s1 = "https://s1.demo.opensourcecms.com/wordpress/wp-admin/install.php";
		Assert.assertEquals(s, s1);
	}
	
	@Test
	public void EmptyData() {
		
		Assert.assertNotNull(driver.findElement(By.cssSelector("#weblog_title")));
		Assert.assertNotNull(driver.findElement(By.cssSelector("#user_login")));
		Assert.assertNotNull(driver.findElement(By.cssSelector("#admin_email")));
		Assert.assertNotNull(driver.findElement(By.cssSelector("#blog_public")));
		System.out.println("Please fill the data..");
	}
	@Test
	public void SiteTitle()  {
		WebElement a = driver.findElement(By.cssSelector("#weblog_title"));
		Assert.assertNotNull(a);
		a.click();
		a.sendKeys("WordPressTestCases");
		
	}
	
	@Test
	public void UserName() {
		WebElement a = driver.findElement(By.cssSelector("#user_login"));
		Assert.assertNotNull(a);
		a.click();
		a.sendKeys("UnnatiandChetan");
	}
	
	@Test
	public void ShowHideWithoutClick() {
		WebElement input = driver.findElement(By.cssSelector("#pass1"));
		String typeValue=input.getAttribute("type");
		//System.out.println(typeValue);
		if(typeValue =="password") {
			System.out.println("Your Password is visible on page");
		}
		else {
			System.out.println("Your Password is Hide on page");
		}
	}
	
	@Test
	public void ShowHideWithClick() {
		WebElement input = driver.findElement(By.cssSelector("#pass1"));
		driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div[1]/button[1]")).click();
		String typeValue=input.getAttribute("type");
		if(typeValue.equals("password")) {
			System.out.println("Your Password is visible on page");
		}
		else {
			System.out.println("Your Password is Hide on page");
		}
	}
	
	@Test
	public void WeakPassword() {
		 driver.findElement(By.cssSelector("#pass1")).clear();
		 driver.findElement(By.cssSelector("#pass1")).sendKeys("una@we");
		 Assert.assertNotNull(driver.findElement(By.xpath("//input[@name='pw_weak']")));
		 driver.findElement(By.xpath("//input[@name='pw_weak']")).click();
	}
	
	@Test
	public void Email() {
		WebElement a = driver.findElement(By.cssSelector("#admin_email"));
		Assert.assertNotNull(a);
		a.click();
		a.sendKeys("UnnatiandChetan@gmail.com");
	}
	

	@Test
	public void SearchEngin() {
		WebElement a = driver.findElement(By.cssSelector("#blog_public"));
		Assert.assertNotNull(a);
		a.click();
	}
	
	@Test
	public void Install() {
		driver.findElement(By.cssSelector("#weblog_title")).sendKeys("UnnatiAndChetan");
		driver.findElement(By.cssSelector("#user_login")).sendKeys("UnnatiAndChetan");
		driver.findElement(By.cssSelector("#pass1")).sendKeys("fa$Wq&nuxiIeIp$dgA");
		driver.findElement(By.cssSelector("#admin_email")).sendKeys("unnatichetan@gmail.com");
		driver.findElement(By.cssSelector("#blog_public")).click();
		driver.findElement(By.cssSelector("#submit")).click();
	}
	@After
	public void close() {
		driver.close();
	}
}
