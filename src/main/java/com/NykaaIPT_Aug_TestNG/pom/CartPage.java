package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.NykaaIPT_Aug_TestNG.base.BaseClass;

public class CartPage extends BaseClass {

	@FindBy(xpath = "//p[contains(text(),'Bag')]")
	private WebElement editbag;

	public WebElement getEditbag() {
		return editbag;
	}

}
