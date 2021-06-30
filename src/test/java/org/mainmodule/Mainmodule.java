package org.mainmodule;

import org.Base.BaseClass;
import org.properties.Properties;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Mainmodule extends BaseClass {
	
@BeforeSuite
	public void Browser() {
	launchBrwoser();
	maximize();
}
@Test(priority=0)
	public void accessUrl() {
	getUrl("https://opensource-demo.orangehrmlive.com/");
	
}
@Test(priority=1)
public void adminModule() {
	Properties po= new Properties();
	insert(po.getUsername(), "Admin");
	insert(po.getPassword(), "admin123");
	click(po.getLoginbtn());
}
@Test(priority=2,dependsOnMethods="adminModule")
public void addusermodule() {
	Properties po= new Properties();
	click(po.getAdminbtn());
	click(po.getAddbtn());
	insert(po.getUsernametxt1(), "Alice Duval");
	insert(po.getUsernametxt2(), "Rohini");
	insert(po.getUserpass(), "Rohini123");
	insert(po.getConfirmpass(), "Rohini123");
	click(po.getBtnsave());
	
}
@Test(priority=3,dependsOnMethods="adminModule")
public void editUsermodule() {
	Properties po= new Properties();
	click(po.getAdminbtn());
	insert(po.getEmpnameEdit(), "Rohini");
	click(po.getSearchBtn());
	click(po.getReqElement());
	click(po.getEditbtn());
	insert(po.getEditUsername(), "Jayaram");
	click(po.getEditSave());

}
@Test(priority=4,dependsOnMethods="adminModule")
public void deleteUsermodule() {
	Properties po= new Properties();
	click(po.getAdminbtn());
	insert(po.getEmpnameEdit(), "Aaliyah Haq");
	click(po.getSearchBtn());
	implicitwait();
	click(po.getSelectElement());
	click(po.getDelectbtn());
	click(po.getDialogdelectbtn());
	
}

@AfterSuite
public void ClosingBrowser() {
	closeBrowser();

}
}




