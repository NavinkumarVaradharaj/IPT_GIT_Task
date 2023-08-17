package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT_Aug_TestNG.base.BaseClass;

public class Cart_Page extends BaseClass {
	
		
	@FindBy (xpath = "//iframe[@src='/mobileCartIframe?ptype=customIframeCart']")
	private WebElement bag_frame;
	
	
	@FindBy (xpath = "//div[@data-test-id='product-remove']")
	private WebElement delete_icon;
	
	public WebElement getbag_frame() {
	return bag_frame;
	
}

	public WebElement getDelete_icon() {
		return delete_icon;
	}
	
}
	
	