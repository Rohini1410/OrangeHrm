package org.properties;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Properties extends BaseClass {
	
	public Properties() {
		
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(id="txtUsername")
	private WebElement username;
	@FindBy(id="txtPassword")
	private WebElement password;
	@FindBy(name = "Submit")
	private WebElement loginbtn;
	@FindBy(id="btnAdd")
	private WebElement addbtn;
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement usernametxt1;
	@FindBy(xpath="//b[text()='Admin']")
	private WebElement adminbtn;
	@FindBy(id="systemUser_userName")
	private WebElement usernametxt2;
	@FindBy(id="systemUser_password")
	private WebElement userpass;
	@FindBy(id="systemUser_confirmPassword")
	private WebElement confirmpass;
	@FindBy(id="btnSave")
	private WebElement btnsave;
	@FindBy(id="searchSystemUser_employeeName_empName")
	private WebElement empnameEdit;
	@FindBy(id="searchBtn")
	private WebElement searchBtn;
	@FindBy(xpath="//a[text()='Rohini']")
	private WebElement reqElement;
	@FindBy(xpath="//input[@value='Edit']")
	private WebElement editbtn;
	@FindBy(id="systemUser_userName")
	private WebElement editUsername;
   @FindBy(xpath="//*[@id='btnSave']")
	private WebElement editSave;
	
   @FindBy(xpath="(//tr//td//input)[2]")
  	private WebElement selectElement;
   @FindBy(xpath="//*[@id='btnDelete']")
  	private WebElement delectbtn;
   
   @FindBy(xpath="//*[@id='dialogDeleteBtn']")
  	private WebElement dialogdelectbtn;
   
   public WebElement getSelectElement() {
	return selectElement;
}
public WebElement getDelectbtn() {
	return delectbtn;
}
public WebElement getDialogdelectbtn() {
	return dialogdelectbtn;
}
public WebElement getEditSave() {
	return editSave;
}
	public WebElement getEmpnameEdit() {
		return empnameEdit;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public WebElement getReqElement() {
		return reqElement;
	}
	public WebElement getEditbtn() {
		return editbtn;
	}
	public WebElement getEditUsername() {
		return editUsername;
	}
	public WebElement getUsernametxt2() {
		return usernametxt2;
	}
	public WebElement getUserpass() {
		return userpass;
	}
	public WebElement getConfirmpass() {
		return confirmpass;
	}
	public WebElement getBtnsave() {
		return btnsave;
	}
	public WebElement getAdminbtn() {
		return adminbtn;
	}
	public WebElement getAddbtn() {
		return addbtn;
	}
	public WebElement getUsernametxt1() {
		return usernametxt1;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	

}
