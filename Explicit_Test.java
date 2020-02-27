package explicitwait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Explicit_Test {
	
	@BeforeClass
	 public void lb() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver_v79.exe");
			WebDriver dr = new ChromeDriver();
			dr.get("http://demowebshop.tricentis.com/login");
	  }
	
    @Test
  public void f() {
  }
}
