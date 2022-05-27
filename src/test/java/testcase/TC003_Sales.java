package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.classbase;
import data.ReadExcel;
import pageobjects.SalesObjects;

public class TC003_Sales extends classbase  {
	
	@DataProvider
	public Object[][] SalesInfo() {
		Object[][] testdata = ReadExcel.getexceldata("Sales");
		return testdata ;
	}
	
	@Test(priority = 0, dataProvider = "SalesInfo", description = "Testcase Description : To Check Whether the user is able"
			+ " to create the Customerdetails, Sales Quotation Number, Sale Order Number, Delivery order Number and Invoice Number by using DataProvider")
	public void Saleorder(String customername,String companyname,String contactperson, String jobpost,
			String phone, String fax, String mobile, String email, String addcompanyname, String productname,String custname) throws Exception {
		SalesObjects sales = PageFactory.initElements(d, SalesObjects.class);
		sales.SalesQuotation(customername, companyname, contactperson, jobpost, phone, fax, mobile, email, addcompanyname, productname);
		Screenshot("SalesQuotation_Number");
		sales.SalesOrdernumber();
		Screenshot("SalesOrder_Number");
		sales.DeliveryOrdernumber();
		Screenshot("DeliveryOrder_Number");
		sales.Invoicenumber();
		Screenshot("Invoice_Number");
		sales.PaymentInfo();
		Screenshot("Sales_PaymentCofirmation");
		sales.PaymentSuccessfull();
		sales.Accounting(custname);
		Screenshot("Customer_PaymentNumber");
	}
	@Test (priority = 1, description = "Testcase Description : To Check Whether the user is able to Send the"
			+ " Sales Quotation for Approval with entering the Customer Details")
	public void NegativeCase() throws Exception {
		SalesObjects sales = PageFactory.initElements(d, SalesObjects.class);
		sales.Negativetest();
		Screenshot("NegativeCase_Sales");
		}
}
