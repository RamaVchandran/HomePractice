package org.framework.framewrk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Select extends BaseClass{
	
	public  Pom_Select() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
		@FindBy(xpath ="//input[@id='radiobutton_0']")
		public WebElement radio;
		

		@FindBy(xpath ="//input[@id='continue']")
		public WebElement cont;


		public WebElement getRadio() {
			return radio;
		}


		public void setRadio(WebElement radio) {
			this.radio = radio;
		}


		public WebElement getCont() {
			return cont;
		}


		public void setCont(WebElement cont) {
			this.cont = cont;
		}
		
		

	
	
	
	



}
