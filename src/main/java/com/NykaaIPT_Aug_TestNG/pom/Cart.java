package com.NykaaIPT_Aug_TestNG.pom;

public interface Cart {

	String bag_icon_xpath = "//span[@class='cart-count']";
	
	String bag_frame_xpath = "//iframe[@src='/mobileCartIframe?ptype=customIframeCart']"; 
	
	String quantity_xpath = "//p[@data-test-id='select-quantity']";
	
	String count_radio_btn_xpath = "//span[@label='3']";
	
	String proceed_btn_xpath = "//span[contains(text(),'Proceed')]";
	
	String deliverHere_btn_xpath = "//button[contains(text(),'Deliver here')]";

	String editbag_xpath = "//p[contains(text(),'Bag')]";
	
	String edit_btn_xpath = "//p[contains(text(),'Edit')]";
	
	String delete_icon_xpath = "//div[@data-test-id='product-remove']";
	
	String remove_btn_xpath = "//button[contains(text(),'Remove')]";
		
}
