package org.framework.framewrk;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Book extends BaseClass{

@Test
public void book() throws IOException {
	WebElement t15 = chooseElement(4, "//input[@id='first_name']");
	type(t15, Excel(1, 8));
	WebElement t16 = chooseElement(4, "//input[@id='last_name']");
	type(t16, Excel(1, 9));
	WebElement t17 = chooseElement(4, "//textarea[@id='address']");
	type(t17, Excel(1, 10));
	WebElement t18 = chooseElement(4, "//input[@id='cc_num']");
	type(t18, Excel(1, 11));
	WebElement t19 = chooseElement(4, "//select[@id='cc_type']");
	type(t19, Excel(1, 12));
	WebElement t20 = chooseElement(4, "//select[@id='cc_exp_month']");
	type(t20, Excel(1, 13));
	WebElement t21 = chooseElement(4, "//select[@id='cc_exp_year']");
	type(t21, Excel(1, 14));
	WebElement t22 = chooseElement(4, "//input[@id='cc_cvv']");
	type(t22, Excel(1, 15));
	WebElement t23 = chooseElement(4, "//input[@id='book_now']");
	butnClick(t23);
}
}
