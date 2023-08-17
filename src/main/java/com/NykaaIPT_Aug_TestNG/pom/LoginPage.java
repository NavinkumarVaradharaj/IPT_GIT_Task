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
