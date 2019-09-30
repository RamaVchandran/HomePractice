package org.framework.framewrk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Search extends BaseClass {

	public Pom_Search() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//input[@id='username']")
	public WebElement username ;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='login']")
	public WebElement log;

	@FindBy(xpath = "//select[@id='location']")
	public WebElement location;
	@FindBy(xpath = "//select[@id='hotels']")
	public WebElement hot;
	@FindBy(xpath = "//select[@id='room_type']")
	public WebElement room;
	@FindBy(xpath = "//select[@id='room_nos']")
	public WebElement romno;
	@FindBy(xpath = "//input[@id='datepick_in']")
	public WebElement in;
	@FindBy(xpath = "//input[@id='datepick_out']")
	public WebElement out;
	@FindBy(xpath = "//Select[@id='adult_room']")
	public WebElement adult;
	@FindBy(xpath = "//Select[@id='child_room']")
	public WebElement child;

	@FindBy(xpath = "//input[@id='Submit']")
	public WebElement sub;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLog() {
		return log;
	}

	public void setLog(WebElement log) {
		this.log = log;
	}

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHot() {
		return hot;
	}

	public void setHot(WebElement hot) {
		this.hot = hot;
	}

	public WebElement getRoom() {
		return room;
	}

	public void setRoom(WebElement room) {
		this.room = room;
	}

	public WebElement getRomno() {
		return romno;
	}

	public void setRomno(WebElement romno) {
		this.romno = romno;
	}

	public WebElement getIn() {
		return in;
	}

	public void setIn(WebElement in) {
		this.in = in;
	}

	public WebElement getOut() {
		return out;
	}

	public void setOut(WebElement out) {
		this.out = out;
	}

	public WebElement getAdult() {
		return adult;
	}

	public void setAdult(WebElement adult) {
		this.adult = adult;
	}

	public WebElement getChild() {
		return child;
	}

	public void setChild(WebElement child) {
		this.child = child;
	}

	public WebElement getSub() {
		return sub;
	}

	public void setSub(WebElement sub) {
		this.sub = sub;
	}


}
