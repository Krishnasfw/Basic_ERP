package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.classbase;
import data.ReadExcel;
import pageobjects.ContactObjects;


public class TC001_Contact extends classbase {
	
	 @DataProvider public Object[][] CreateCompanyContact() throws Exception { 
		  Object[][] testdata = ReadExcel.getexceldata("Contact_Company");
	  return testdata;
	  }
	 
	 @DataProvider public Object[][] CreateIndividualContact() throws Exception { 
		  Object[][] testdata = ReadExcel.getexceldata("Contact_Individual");
	  return testdata;
	  }

	@Test(priority = 0, dataProvider = "CreateCompanyContact", enabled = true,
			description = "Testcase Description : To Check Whether the user is able to create a Company Contact Information by using DataProvider")
	public void Companydetails(String name,String add1, String add2,String city,
			String zip, String tax, String contactname, String phone ,String fax, String mobile,String email
			) throws Exception  {
		ContactObjects contacts = PageFactory.initElements(d, ContactObjects.class);
		contacts.info();	
		Thread.sleep(3000);
		Thread.sleep(3000);
		contacts.Companycontactdetails(name, add1, add2, city, zip, tax); 
		contacts.CommonDetails(contactname, phone, fax, mobile, email);
		Thread.sleep(2000);
		contacts.Save();
		Screenshot("Company_Contact");
		Thread.sleep(3000);
	}
	
	@Test(priority = 1,dataProvider = "CreateIndividualContact", enabled = true,
			description = "Testcase Description : To Check Whether the user is able to create a Individual Person Contact Information by using DataProvider")
	public void Individual(String name,String contactname, String phone ,String fax, String mobile,String email
			) throws Exception {
		ContactObjects contacts = PageFactory.initElements(d, ContactObjects.class);
		contacts.info();
		Thread.sleep(3000);
		contacts.individualDetails(name);
		Thread.sleep(3000);
		contacts.CommonDetails(contactname, phone, fax, mobile, email);
		Thread.sleep(2000);
		contacts.Save();
		Screenshot("Individual_Contact");
		Thread.sleep(3000);
	}
	@Test(priority = 2, 
			description = "Testcase Description : To Check Whether the user is able to Save the Contact Information with out adding the Name Field")
	public void Negative() throws Exception {
		ContactObjects contacts = PageFactory.initElements(d, ContactObjects.class);
		contacts.info();
		Thread.sleep(3000);
		contacts.FOR_Negative();
		Thread.sleep(2000);
		contacts.Save();
		Screenshot("NegativeCase_Contact");
		
	}
}



