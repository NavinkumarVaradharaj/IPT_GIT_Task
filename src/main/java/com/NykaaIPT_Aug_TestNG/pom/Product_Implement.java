package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT_Aug_TestNG.base.BaseClass;

public class Product_Implement extends BaseClass implements Product {

	public Product_Implement() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = babypowder_xpath)
	private WebElement babypowder;

	public WebElement getBabypowder() {
		return babypowder;
	}
	
}x	
