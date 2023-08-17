package com.NykaaIPT_Aug_TestNG.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT_Aug_TestNG.base.BaseClass;

public class Locators extends BaseClass {

	public Locators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[contains(text(),'Bag')]")
	private WebElement editbag;

	public WebElement getEditbag() {
		return editbag;
	}

}
