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

public class List_HashMap extends BaseClass {
	
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
		
		type(see.location, getData(1,"Location"));

		type(see.hot, getData(1,"Hotel"));

		type(see.room, getData(1,"Room Type"));

		type(see.romno, getData(1,"No of Rooms"));

		type(see.in, getData(1,"Checkin"));

		type(see.out, getData(1,"Checkout"));

		type(see.adult, getData(1,"Adults per room"));

		type(see.child, getData(1,"Children per room"));

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
	
		type(bok.firstname, getData(1,"FirstName"));
		
		type(bok.lastname, getData(1,"Lastname"));
		
		type(bok.address1, getData(1,"Billing add"));
		
		type(bok.cardno, getData(1,"Creditcard"));
		
		type(bok.cardtype, getData(1,"cardType"));
		
		type(bok.epmonth, getData(1,"Month"));
		
		type(bok.epyear, getData(1,"Year"));
		
		type(bok.cvvno, getData(1,"CVV"));
		
		butnClick(bok.booknow);

	}

	@Test
	// orderid
	public void test4() throws IOException {
		WebDriverWait w = new WebDriverWait(driver, 500);
		w.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='order_no']"))));

		
		String name = or.order.getAttribute("value");
		System.out.println(name);
		write(1, 16,name);

	}
	
	@AfterClass
	public static void afterClass() {
		driver.close();

	}

}

	
	


