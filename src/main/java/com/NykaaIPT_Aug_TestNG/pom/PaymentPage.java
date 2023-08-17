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

	@FindBy(xpath = Payment.expirydate_xpath)
	private WebElement exirydate;

	@FindBy(xpath = Payment.cvv_xpath)
	private WebElement cvv;

	@FindBy(xpath = Payment.pay_button_xpath)
	private WebElement pay_button;
	
	@FindBy(xpath = Payment.rupee_btn_xpath )
	private WebElement rupee_btn_xpath;
	
	@FindBy(xpath = Payment.securepay_btn_xpath )
	private WebElement securepay_btn_xpath;

	public WebElement getCardnumber() {
		return cardnumber;
	}
	
	public WebElement getExirydate() {
		return exirydate;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getPay_button() {
		return pay_button;
	}	

	public WebElement getRupee_btn_xpath() {
		return rupee_btn_xpath;
	}

	public WebElement getSecurepay_btn_xpath() {
		return securepay_btn_xpath;
	}
}