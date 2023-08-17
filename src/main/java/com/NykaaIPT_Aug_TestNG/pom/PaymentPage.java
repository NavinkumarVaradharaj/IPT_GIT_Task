package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT_Aug_TestNG.base.BaseClass;

public class PaymentPage extends BaseClass {
	
public PaymentPage() {
	PageFactory.initElements(driver, this);
	
}

@FindBy(xpath=Payment.cvv_xpath)
private WebElement cvv;

@FindBy(xpath=Payment.pay_button_xpath)
private WebElement pay_button;

public WebElement getCvv() {
	return cvv;
}

public WebElement getPay_button() {
	return pay_button;
}
}
