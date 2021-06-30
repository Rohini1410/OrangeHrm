package org.addUser;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.properties.Properties;
import org.testng.annotations.Test;

public class AddUserModule  extends BaseClass{
	@Test
public void addUserModule2() {
		launchBrwoser();
		maximize();
		getUrl("https://opensource-demo.orangehrmlive.com/");
		Properties po= new Properties();
		insert(po.getUsername(), "Admin");
		insert(po.getPassword(), "admin123");
		click(po.getLoginbtn());
		
		click(po.getAdminbtn());
		click(po.getAddbtn());
		insert(po.getUsernametxt1(), "Alice Duval");
		insert(po.getUsernametxt2(), "Rohini");
		insert(po.getUserpass(), "Rohini123");
		insert(po.getConfirmpass(), "Rohini123");
		click(po.getBtnsave());
		}

}
