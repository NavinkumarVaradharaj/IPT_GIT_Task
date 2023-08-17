package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT_Aug_TestNG.base.BaseClass;

public class Payment_Page extends BaseClass{
	
	public Payment_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = Payment.rupee_btn_xpath )
	private WebElement rupee_btn_xpath;
	
	@FindBy(xpath = Payment.securepay_btn_xpath )
	private WebElement securepay_btn_xpath;

	public WebElement getRupee_btn_xpath() {
		return rupee_btn_xpath;
	}

	public WebElement getSecurepay_btn_xpath() {
		return securepay_btn_xpath;
	}
}
