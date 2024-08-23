package pom;

import java.sql.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.BaseClass;


public class LoginPagePom extends BaseClass{
	
	public LoginPagePom(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//p[text()='Username : Admin']")
	private WebElement usernameText;
	
	@FindBy(xpath = "//p[text()='Password : admin123']")
	private WebElement passwordText;
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button")
	private WebElement loginButton;
	
	@FindBy(xpath = "//p[text()='Forgot your password? ']" )
	private WebElement forgotPasswordLink;
	
	public String getUsername() {
		String text = usernameText.getText();
		return text.substring(text.indexOf('A'));
	}
	
	public String getPassword() {
		String text = passwordText.getText();
		return text.substring(text.lastIndexOf('a'));
	}
	
	public void setUsername(String usernameText) {
		username.sendKeys(usernameText);
	}
	
	public void setPassword(String passwordText) {
		password.sendKeys(passwordText);
	}
	
	public void loginClick() {
		loginButton.click();
	}

}