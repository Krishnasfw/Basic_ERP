package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.classbase;
import data.ReadExcel;
import pageobjects.PurchaseObjects;

public class TC002_Product extends classbase {
	
	
	@DataProvider
	public Object[][] ProductCreate() {
		Object[][] testdata = ReadExcel.getexceldata("Product");
		return testdata;
		
	}
	
	@Test(priority = 0,dataProvider = "ProductCreate", description = "Testcase Description : To Check Whether the User is able to Create the PurchaseOrder Number, GRN Number, Vendor Bill And Payment Number by using DataProvider")
	
	public void purchasing(String productname, String price, String cost,String vendorname, String product_name,String unitprice,String reference,String Bankname,String Accvendorname) throws Exception {
		PurchaseObjects purchase = PageFactory.initElements(d, PurchaseObjects.class);
		purchase.product(productname, price, cost);
		Screenshot("Product");
		Thread.sleep(2000);
		purchase.PurchaseOrder(vendorname, product_name,unitprice);
		Screenshot("Purchase Order");
		purchase.GRN();
		Screenshot("GRN Number");
		purchase.VendorSuppNumber(reference);
		Screenshot("Vendor Bill");
		purchase.PaymentCreation(Bankname);
		Screenshot("Purchase_PaymentConfirmation");
		purchase.Paymentsuccessfull();
		purchase.AccountingNumber(Accvendorname);
		Screenshot("Payment_Number");
	}
	
	@Test(priority = 1, description = "Testcase Description : To Chech Whether the User is able to save "
			+ "the Record with out adding the Name and Product field")
	public void Negative() throws Exception {
		PurchaseObjects purchase = PageFactory.initElements(d, PurchaseObjects.class);
		purchase.Negative_CaseEmptyfield();
		String PageTitle = d.getTitle();
		Assert.assertEquals("New - AccentuateERP13", PageTitle);
		Screenshot("Negative_Emptyfield");
		purchase.Negative_Withoutproduct();
		Screenshot("Negative_Withoutproduct");
	}
	
}
