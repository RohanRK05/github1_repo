package pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_ScriptP2 {
	//DECLARATION
	@FindBy(name = "username")private WebElement unTBox;
	@FindBy(name = "pwd")private WebElement pwdTBox;
	@FindBy(xpath = "//a[text()='Login']")private WebElement loginButton;
	
	//INITIALIZATION
	public void POM1(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	//UTILIZATION
	public void userName(String un) {
		unTBox.sendKeys(un);
	}
	public void password(String pwd) {
		unTBox.sendKeys(pwd);
	}
	public void clickLogin() {
		loginButton.click();
	}

}
