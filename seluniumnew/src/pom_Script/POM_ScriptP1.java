package pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_ScriptP1 {
	//DECLARATION
	@FindBy(xpath = "//a[text()='Login']")private WebElement loginButton;
	
	//INITIALIZATION
	public void POM1(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	//UTILIZATION
	public void clickAgain() {
		loginButton.click();
	}

}
