package org.framework.framewrk;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PomexecuteOrder extends BaseClass {

	Pom_Search see = new Pom_Search();
	Pom_Select sel = new Pom_Select();
	Pom_Book bok = new Pom_Book();
	Pom_order or = new Pom_order();

	@BeforeClass
	public static void beforeClass() {
		WebDriver driver = getDriver();
		loadurl("http://adactin.com/HotelApp/index.php");

	}

	

	@Test
	public void test1() throws IOException {
		// Search hotel
		type(see.username, "Ramachandran15");
		
		type(see.password, "Rama@1591");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		butnClick(see.log);
		
		type(see.location, Excel(1, 0));

		type(see.hot, Excel(1, 1));

		type(see.room, Excel(1, 2));

		type(see.romno, Excel(1, 3));

		type(see.in, Excel(1, 4));

		type(see.out, Excel(1, 5));

		type(see.adult, Excel(1, 6));

		type(see.child, Excel(1, 7));

		butnClick(see.sub);
	}

	@Test
	// select hotel
	public void test2() {
		
		butnClick(sel.radio);
		butnClick(sel.cont);
	}

	@Test
	public void test3() throws IOException {
		// book hotel
	
		type(bok.firstname, Excel(1, 8));
		
		type(bok.lastname, Excel(1, 9));
		
		type(bok.address1, Excel(1, 10));
		
		type(bok.cardno, Excel(1, 11));
		
		type(bok.cardtype, Excel(1, 12));
		
		type(bok.epmonth, Excel(1, 13));
		
		type(bok.epyear, Excel(1, 14));
		
		type(bok.cvvno, Excel(1, 15));
		
		butnClick(bok.booknow);

	}

	@Test
	// orderid
	public void test4() throws IOException {
		
		
		String name = or.order.getAttribute("value");
		System.out.println(name);
		write(1, 17, name);

	}
	
	@AfterClass
	public static void afterClass() {
		driver.close();

	}

}
