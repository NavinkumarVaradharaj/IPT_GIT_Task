package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT_Aug_TestNG.base.BaseClass;

public class PaymentPage extends BaseClass {
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = Payment.cardnumber_xpath)
	private WebElement cardnumber;

	public WebElement getCardnumber() {
		return cardnumber;
	}

	@FindBy(xpath = Payment.expirydate_xpath)
	private WebElement exirydate;

	public WebElement getExirydate() {
		return exirydate;
	}

}
