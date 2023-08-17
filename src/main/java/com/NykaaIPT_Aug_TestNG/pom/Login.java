package com.NykaaIPT_Aug_TestNG.pom;

public interface Login {

	String signIn_btn_xpath = "//button[text()='Sign in']";

	String sign_with_mobile_xpath = "//button[text()='Sign in with Mobile / Email']";

	String email_mobile_xpath = "//input[@name='emailMobile']";

	String signIn_proceed_btn_xpath = "//button[text()='proceed']";

	String otp_verify_btn_xpath = "//button[text()='verify']";

	String user_btn_xpath = "//span[@class='css-17ukzrr euw1lbv4']";
	
	String user_logout_btn_xpath = "//button[text()='Logout']";
	
	String logout_alldevices_xpath = "//span[text()='Logout from all devices']";
}

