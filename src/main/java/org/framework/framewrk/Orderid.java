package org.framework.framewrk;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orderid extends BaseClass {
	@Test
	public void order() throws IOException {
		WebDriverWait w = new WebDriverWait(driver, 500);
		w.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='order_no']"))));

		WebElement t24 = chooseElement(4, "//input[@name='order_no']");
		String name = t24.getAttribute("value");
		System.out.println(name);
		write(1, 18, name);


	}
	
	

	@AfterClass
	public static void afterClass() {
		driver.close();

	}

}
