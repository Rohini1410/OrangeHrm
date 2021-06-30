package org.deleteUser;

import java.util.concurrent.TimeUnit;

import org.Base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.properties.Properties;
import org.testng.annotations.Test;

public class DeleteUser extends BaseClass{
	@Test
	public void deleteUsermodule4() {
	
		launchBrwoser();
		maximize();
		getUrl("https://opensource-demo.orangehrmlive.com/");
		Properties po= new Properties();
		insert(po.getUsername(), "Admin");
		insert(po.getPassword(), "admin123");
		click(po.getLoginbtn());
		 WebElement adminbtn = driver.findElement(By.xpath("//b[text()='Admin']"));
		adminbtn.click();
		insert(po.getEmpnameEdit(), "Aaliyah Haq");
		click(po.getSearchBtn());
		implicitwait();
		click(po.getSelectElement());
		click(po.getDelectbtn());
		click(po.getDialogdelectbtn());
		
	 }
}