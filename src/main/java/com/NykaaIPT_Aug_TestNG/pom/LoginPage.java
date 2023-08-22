<<<<<<< HEAD
package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT_Aug_TestNG.base.BaseClass;

public class LoginPage extends BaseClass implements Login{
	public LoginPage() {
		PageFactory.initElements(driver,this);}
	
	@FindBy(xpath =signIn_btn_xpath)
	private WebElement signInbtn;
	
	@FindBy(xpath =sign_with_mobile_xpath)
	private WebElement SignInMobile_Btn;
	
	@FindBy (xpath =logout_alldevices_xpath)
	private WebElement logoutall;

	public WebElement getSignInbtn() {
		return signInbtn;
	}

	public WebElement getSignInMobile_Btn() {
		return SignInMobile_Btn;
	}
	
	public WebElement logoutall() {
		return logoutall;
	}
	
	
	

}

=======
package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.NykaaIPT_Aug_TestNG.base.BaseClass;

public class LoginPage extends BaseClass implements Login {
	
	

	@FindBy(xpath = email_mobile_xpath)
	private WebElement email_btn;
	
	public WebElement getEmail_btn() {
		return email_btn;
	}
	
	
	
	@FindBy(xpath = signIn_proceed_btn_xpath)
	private WebElement Sign_proceed;
	
	public WebElement getSign_proceed() {
		return Sign_proceed;
	}

}
>>>>>>> ipttask
