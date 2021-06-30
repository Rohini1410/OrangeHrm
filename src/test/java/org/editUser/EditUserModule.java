package org.editUser;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.properties.Properties;
import org.testng.annotations.Test;

public class EditUserModule extends BaseClass {

    @Test
    public void Module3() {
		launchBrwoser();
		maximize();
		getUrl("https://opensource-demo.orangehrmlive.com/");
		Properties po= new Properties();
		insert(po.getUsername(), "Admin");
		insert(po.getPassword(), "admin123");
		click(po.getLoginbtn());
		
		click(po.getAdminbtn());
		insert(po.getEmpnameEdit(), "Rohini");
		click(po.getSearchBtn());
		click(po.getReqElement());
		click(po.getEditbtn());
		insert(po.getEditUsername(), "Jayaram");
		click(po.getEditSave());
		
		}
}
