package com.clearcode.po;

import org.openqa.selenium.By;

public class Dashboard {
	//public static By sales_tab = By.partialLinkText("Sales");
	public static By sales_tab = By.xpath("//*[@id=\"sale\"]/a/i");
	public static By returns_tab = By.partialLinkText("Returns");
	public static By add_new = By.xpath("//a[@data-original-title='Add New']");
	
	
}
