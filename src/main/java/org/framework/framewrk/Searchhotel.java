package org.framework.framewrk;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searchhotel extends BaseClass {
	
	@BeforeClass
	public static void beforeClass() {
		WebDriver driver = getDriver();
		loadurl("http://adactin.com/HotelApp/index.php");
		
	}
	
	
	@Test
	public void search() throws IOException {
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
}
