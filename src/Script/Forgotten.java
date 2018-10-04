package Script;


import org.testng.annotations.Test;


import Generic.Basetest;
import Generic.Voonik;
import pom.Forgottenpage;
import pom.Login;

public class Forgotten extends Basetest {
	@Test
	public void forgotten() throws InterruptedException {
	String us = Voonik.abc(excelpath,"sheet1",1,0);
	String pwd = Voonik.abc(excelpath, "sheet1",1,4);
	
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
	l.forgotten();
	Forgottenpage f =new Forgottenpage(driver);
	f.linkedemailid();
	f.sub();
	driver.close();
}
}
