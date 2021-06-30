package org.admin;
import org.Base.BaseClass;
import org.properties.Properties;
import org.testng.annotations.Test;
public class AdminModule extends BaseClass {

@Test
public void AdminModule1() {
		
	    launchBrwoser();
		maximize();
		getUrl("https://opensource-demo.orangehrmlive.com/");
		Properties po= new Properties();
		insert(po.getUsername(), "Admin");
		insert(po.getPassword(), "admin123");
		click(po.getLoginbtn());
		closeBrowser();
		}
}
