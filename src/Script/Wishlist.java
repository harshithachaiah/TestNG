package Script;


import org.testng.annotations.Test;


import Generic.Basetest;
import Generic.Voonik;
import pom.Homepage;
import pom.Login;

public class Wishlist extends Basetest {
	@Test
	public void wishlist() throws InterruptedException{
	String us = Voonik.abc(excelpath,"sheet1",1,0);
	String pwd = Voonik.abc(excelpath, "sheet1",1,1);
	
	driver.get("https://www.voonik.com/");
	Login l = new Login(driver);
	l.login();
	Thread.sleep(2000);
	l.username(us);
	Thread.sleep(2000);
	l.password(pwd);
	Thread.sleep(2000);
	l.loginbtn();
	Thread.sleep(2000);
	Homepage h = new Homepage(driver);
	h.wishlist();
	}
}
