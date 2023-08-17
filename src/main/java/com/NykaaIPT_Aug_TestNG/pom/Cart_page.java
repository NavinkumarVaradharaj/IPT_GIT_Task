package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT_Aug_TestNG.base.BaseClass;

public class Cart_page extends BaseClass {
	public Cart_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[@class='cart-count']")
	private WebElement bag_icon;

	@FindBy (xpath = "//p[contains(text(),'Edit')]")
	private WebElement edit_btn;

	public WebElement getBag_icon() {
		return bag_icon;
	}

	public WebElement getEdit_btn() {
		return edit_btn;
	}
	
}
