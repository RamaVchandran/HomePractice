package org.framework.framewrk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pom_order extends BaseClass {
	
	public Pom_order() {
		PageFactory.initElements(driver, this);
		
	}
	
	

	@FindBy(xpath = "//input[@name='order_no']")
	public WebElement order;

	public WebElement getOrder() {
		return order;
	}

	public void setOrder(WebElement order) {
		this.order = order;
	}
	
	
	
	
}
