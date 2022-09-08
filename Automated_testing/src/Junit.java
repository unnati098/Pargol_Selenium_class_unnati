import static org.junit.Assert.*;

import org.junit.Test;

public class Junit {

	//@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void EnterSiteTitle() {
		TestCases a1 = new TestCases();
		a1.SiteTitle();
	}
	@Test
	public void EnterUserName() {
		TestCases a1 = new TestCases();
		a1.UserName();
	}
	@Test
	public void ShowHideWithoutClick() {
		TestCases a1 = new TestCases();
		//a1.ClickHideButton();
	}
	@Test
	public void ShowHideWithClick() {
		TestCases a1 = new TestCases();
		a1.ShowHideWithClick();
	}
}
