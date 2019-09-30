package org.framework.framewrk;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Selecthotel extends BaseClass {
	
	@Test
	public void selecthotel() {
		WebElement t13 = chooseElement(4, "//input[@id='radiobutton_0']");
		butnClick(t13);
		WebElement t14 = chooseElement(4, "//input[@id='continue']");
		butnClick(t14);
		
	}

}
