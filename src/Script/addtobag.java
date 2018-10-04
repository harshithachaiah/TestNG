package Script;


import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.Voonik;
import pom.Homepage;
import pom.Login;
import pom.Productpage;

public class addtobag extends Basetest {

	@Test
	public void ac() throws InterruptedException {
		
	String us = Voonik.abc(excelpath,"sheet1",1,0);
	String pwd = Voonik.abc(excelpath, "sheet1",1,1);
	String product = Voonik.abc(excelpath,"sheet1",1,2);
	
	
	Login l = new Login(driver);
	l.login();
	Thread.sleep(2000);
	l.username(us);
	Thread.sleep(2000);
	l.password(pwd);
	Thread.sleep(2000);
	l.loginbtn();
	Homepage h = new Homepage(driver);
	h.searchbox(product);
	h.searchlogo();
	Thread.sleep(2000);
	Productpage p = new Productpage(driver);
	p.addbag(driver);
	p.selectsize();
	p.atb();
	driver.close();
	
	}

}
