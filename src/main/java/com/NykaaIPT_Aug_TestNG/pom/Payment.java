package com.NykaaIPT_Aug_TestNG.pom;

public interface Payment {
	
	String cardnumber_xpath = "//input[@placeholder='Card Number']";

	String expirydate_xpath = "(//input[@type='tel'])[2]";
	
	String cvv_xpath = "//input[@placeholder='CVV']";
	
	String pay_button_xpath = "//button[contains(text(),'Pay ')]";
	
	String securepay_btn_xpath = "//button[contains(text(),'Secure Card and pay')]";
	
	String rupee_btn_xpath = "(//span[@class='checkmark'])[2]";
	
	String paynow_btn_xpath = "//button[@class='pay-btn']";

	String close_btn_xpath = "//button[text()='Close']";
	
}
