package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {

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
