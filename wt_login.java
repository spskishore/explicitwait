package explicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wt_login {
  static WebDriver dr;
	static wait_types wt;
	

	
	public wt_login(WebDriver dr)
	{
		this.dr=dr;
	}
	public static String login(String uid, String pwd)
	{
		wt= new wait_types(dr);
		String result;
		
		
		By by_eid=By.xpath("//*[@id='Email']");
		WebElement we_eid=wt.waitForElement(by_eid, 20);
		we_eid.sendKeys(uid);
		
		By by_pwd=By.xpath("//*[@id='Password']");
		WebElement we_pwd=wt.waitForElement(by_pwd, 20);
		we_pwd.sendKeys(pwd);
		
		By by_btn=By.xpath("//form/div[5]/input");
		WebElement we_btn=wt.waitForElement(by_btn, 20);
		we_btn.click();
		
	}
}
