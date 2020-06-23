package com.clearcode.testsuite;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.Dashboard;
import com.clearcode.po.HomePage;
import com.clearcode.po.MenuBar;
import com.clearcode.po.PatientPage;
import com.clearcode.po.ProductsReturn;

import dataProvider.LoginData;

public class TestSuite3 extends TestSetup{
//
//	@Test(enabled=false,priority=1,dataProvider="CreatePatient",dataProviderClass=LoginData.class)
//	public void createPatient(String[] data) throws InterruptedException {
//		wdu.type(HomePage.username_ip, data[0]);
//		wdu.type(HomePage.pwd_ip, data[1]);
//		wdu.click(HomePage.login_btn);
//		wdu.mouseOver(MenuBar.patient_menu);
//		wdu.click(MenuBar.newPatient_menu);
//		wdu.selectByVisibleText(PatientPage.title_select, data[2]);
//		wdu.type(PatientPage.fname_ip, data[3]);
//		wdu.type(PatientPage.lname_ip, data[4]);
//		
//	}
	@Test(dataProvider="negativeLogin",dataProviderClass=LoginData.class)
	public void product(String desc,String order,String customer,String Fname,String lname,String email,String Telephone,String Product,String Model) throws InterruptedException
	{
		wdu.type(HomePage.usernmae_ip,"admin");
		wdu.type(HomePage.password_ip,"admin@123");
		wdu.click(HomePage.login_btn);
		wdu.click(Dashboard.sales_tab);
		wdu.click(Dashboard.returns_tab);
		wdu.click(Dashboard.add_new);
		wdu.type(ProductsReturn.order_ip,order);
		wdu.type(ProductsReturn.cust_ip,customer);
		wdu.type(ProductsReturn.fname_ip,Fname);
		wdu.type(ProductsReturn.lname_ip,lname);
		wdu.type(ProductsReturn.email_ip,email);
		wdu.type(ProductsReturn.tele_ip,Telephone);
		wdu.type(ProductsReturn.pdt_ip,Product);
		wdu.type(ProductsReturn.model_ip,Model);
		wdu.click(ProductsReturn.save_btn);
		
		
		//wdu.assertText(ProductsReturn.ver_msg, "Success: You have modified returns!x");
		wdu.click(ProductsReturn.chk_box);
		wdu.click(ProductsReturn.del_btn);
		Thread.sleep(5000);
		//wdu.Alert();
		
//		wdu.type(ProductsReturn.order_ip,"21");
//		wdu.type(ProductsReturn.cust_ip,"xyz");
//		wdu.type(ProductsReturn.fname_ip,"Mano");
//		wdu.type(ProductsReturn.lname_ip,"Aathi");
//		wdu.type(ProductsReturn.email_ip,"xyz@gmail.com");
//		wdu.type(ProductsReturn.tele_ip,"876543456");
//		wdu.type(ProductsReturn.pdt_ip,"hjk");
//		wdu.type(ProductsReturn.model_ip,"hjk78");
//		wdu.click(ProductsReturn.save_btn);
		//wdu.assertText(ProductsReturn.ver_msg, "Success: You have modified returns!");
		
				
	}
	
//	@Test(dataProvider="SearchPatient",dataProviderClass=LoginData.class)
//	public void searchPatient(String user, String pwd, String title, String fname, String lname) throws InterruptedException {
//		wdu.type(HomePage.username_ip, user);
//		wdu.type(HomePage.pwd_ip, pwd);
//		wdu.click(HomePage.login_btn);
//		wdu.mouseOver(MenuBar.patient_menu);
//		wdu.click(MenuBar.newPatient_menu);
//		wdu.selectByVisibleText(PatientPage.title_select, title);
//		wdu.type(PatientPage.fname_ip, fname);
//		wdu.type(PatientPage.lname_ip, lname);
//	}
	
}
