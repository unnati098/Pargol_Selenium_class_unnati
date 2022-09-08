import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class TestCases {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static void DriverLoad()  {
		System.setProperty("webdriver.chrome.driver",
				"chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/install.php");
		driver.manage().window().maximize();
		
	}
	public void getUrl() {
		String s = driver.getCurrentUrl();
		System.out.println(s);
	}
	public void SiteTitle()  {
		DriverLoad();
		WebElement a = driver.findElement(By.cssSelector("#weblog_title"));
		a.click();
		a.sendKeys("WordPressTestCases");
		String text = a.getText();
		String w = "WordPressTestCases";
		Assert.assertEquals(text,w); 
	}
	public void UserName() {
		WebElement a = driver.findElement(By.cssSelector("#user_login"));
		a.sendKeys("UnnatiandChetan");
		a.getText();
		System.out.println(a.getText());
		String w = "UnnatiandChetan";
		Assert.assertTrue(a.getText().equalsIgnoreCase(w)); 
	}
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
	public void ShowHideWithClick() {
		//By showhide = RelativeLocator.with(By.tagName("button")).below(By.cssSelector("#pass1"));

		//System.out.println(typeValue);
		
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
}
