package com.clearcode.po;

import org.openqa.selenium.By;

public class ProductsReturn {
	//public static By sales_tab = By.partialLinkText("Sales");
	public static By order_ip = By.id("input-order-id");
	public static By cust_ip = By.id("input-customer");
	public static By fname_ip = By.id("input-firstname");
	public static By lname_ip = By.id("input-lastname");
	public static By email_ip = By.id("input-email");
	public static By tele_ip = By.id("input-telephone");
	public static By pdt_ip = By.id("input-product");
	public static By model_ip = By.id("input-model");
	public static By save_btn = By.xpath("//button[@type='submit']");
	public static By ver_msg = By.xpath("//*[contains(text(),'Success')]");
	public static By ver_msg1 = By.xpath("//*[contains(text(),'Warning')]");
	
	public static By chk_box =By.xpath("(//*[@type='checkbox'])[2]");
	public static By del_btn =By.xpath("(//button[@type='button'])[1]");
	
}
