package Script;


import org.testng.annotations.Test;


import Generic.Basetest;
import Generic.Voonik;
import pom.Bagpage;
import pom.Homepage;
import pom.Login;
import pom.Productpage;

public class Removewishlist extends Basetest {
	@Test
	public void removewishlist() throws InterruptedException  {
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
	Homepage h= new Homepage(driver);
	h.mens(driver);
	h.bottomwear(driver);
	h.trousers();
	Productpage p = new Productpage(driver);
	p.bagbtn();
	Thread.sleep(2000);
	Bagpage b=new Bagpage(driver);
	b.proceed();
	h.wishlist();
	driver.close();
	} 
}
	
