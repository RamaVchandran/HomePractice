package org.framework.framewrk;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Junit extends BaseClass {
	
	@BeforeClass
	public static void beforeClass() {
		WebDriver driver = getDriver();
		loadurl("http://adactin.com/HotelApp/index.php");
		
	}

	@AfterClass
	public static void afterClass() {
		driver.close();

	}
	
	@Test
	public void test1() throws IOException {
		//Search hotel
		WebElement t1 = chooseElement(4, "//input[@id='username']");
		type(t1, "Ramachandran15");
		WebElement t2 = chooseElement(4, "//input[@id='password']");
		type(t2, "Rama@1591");
		WebElement t3 = chooseElement(4, "//input[@id='login']");
		butnClick(t3);
		WebElement t4 = chooseElement(4, "//select[@id='location']");
		type(t4, Excel(1, 0));
		WebElement t5 = chooseElement(4, "//select[@id='hotels']");
		type(t5, Excel(1, 1));
		WebElement t6 = chooseElement(4, "//select[@id='room_type']");
		type(t6, Excel(1, 2));
		WebElement t7 = chooseElement(4, "//select[@id='room_nos']");
		type(t7, Excel(1, 3));
		WebElement t8 = chooseElement(4, "//input[@id='datepick_in']");
		type(t8, Excel(1, 4));
		WebElement t9 = chooseElement(4, "//input[@id='datepick_out']");
		type(t9, Excel(1, 5));
		WebElement t10 = chooseElement(4, "//Select[@id='adult_room']");
		type(t10, Excel(1, 6));
		WebElement t11 = chooseElement(4, "//Select[@id='child_room']");
		type(t11, Excel(1, 7));
		WebElement t12 = chooseElement(4, "//input[@id='Submit']");
		butnClick(t12);
	}
	
	@Test
	//select hotel
	public void test2() {
		WebElement t13 = chooseElement(4, "//input[@id='radiobutton_0']");
		butnClick(t13);
		WebElement t14 = chooseElement(4, "//input[@id='continue']");
		butnClick(t14);
	}
	@Test
	public void test3() throws IOException {
		//book hotel
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
	@Test
	//orderid
	public void test4() throws IOException {
		WebDriverWait w = new WebDriverWait(driver, 500);
		w.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='order_no']"))));

		WebElement t24 = chooseElement(4, "//input[@name='order_no']");
		String name = t24.getAttribute("value");
		System.out.println(name);
		write(1, 17, name);

	}
	
}
