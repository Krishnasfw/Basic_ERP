package pageobjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesObjects {
	WebDriver d;

	public SalesObjects(WebDriver d) {
		this.d = d;
	}
	
	@FindBy(css = "body > header > nav > ul.o_menu_apps > li > a")
	WebElement Dashboard ;
	
	@FindBy(xpath = "/html/body/header/nav/ul[1]/li/div/a[5]")
	WebElement SalesButton ;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div[2]/div[1]/div/div/button[3]")
	WebElement CreateSalesOrder ;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[3]/div[4]/table[1]/tbody/tr[1]/td[2]/div/div/input")
	WebElement Customer ;
	
	@FindBy(xpath = "//a[text()='Create and Edit...']")
	WebElement CreateCustomer ;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement CustomerName ;
	
	@FindBy(xpath = "/html/body/div[46]/div/div/main/div/div/div/div/div[2]/div[4]/div[4]/div/div/input")
	WebElement CustomerComapanyname ;
	
	@FindBy(xpath = "/html/body/ul[23]/li[8]/a")
	WebElement Searchformore_CompanyName ;
	
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement SelectCompanyName ;
	
	@FindBy(xpath = "//input[@name='attn']")
	WebElement ContactPersonName ;
	
	@FindBy(xpath = "//input[@name='function']")
	WebElement JobPosition ;
	
	@FindBy(xpath = "//input[@name='phone']")
	WebElement PhoneField ;
	
	@FindBy(xpath = "//input[@name='fax_no']")
	WebElement FaxNo ;
	
	@FindBy(xpath = "//input[@name='mobile']")
	WebElement MoblieNo ;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement Email_ID ;
	
	@FindBy(xpath = "/html/body/div[44]/div/div/main/div/div/div/div/div[2]/div[3]/img")
	WebElement Profilepicture ;
	
	@FindBy(xpath = "/html/body/div[44]/div/div/main/div/div/div/div/div[2]/div[3]/div/button[1]")
	WebElement Pictureupload ;
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement CustomerInfoSave ;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[3]/div[4]/table[1]/tbody/tr[3]/td[2]/div/div/input")
	WebElement ShippingAddress ;
	
	@FindBy(xpath = "/html/body/ul[3]/li[8]/a")
	WebElement AddressSearchmore ;
	
	@FindBy(xpath = "/html/body/div[27]/div/div/main/div/div[1]/div/div[1]/div/div/div/input")
	WebElement AddressSearchby_CompanyName ;
	
	@FindBy(xpath = "//label[text()='Sea Shipment']")
	WebElement SeaShipping_Checkbox ;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[3]/div[4]/table[2]/tbody/tr[6]/td[2]/div/div/input")
	WebElement PaymenTerms ;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[3]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[2]/a[1]")
	WebElement AddProduct ;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[3]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/input")
	WebElement ChooseProduct ;

	@FindBy(xpath = "/html/body/ul[23]/li[8]/a")
	WebElement ProductSearchMore ;
	
	@FindBy(xpath = "/html/body/div[30]/div/div/main/div/div[1]/div/div[1]/div/div/div/input")
	WebElement Search_ChooseProduct ;
	
	@FindBy(xpath = "//span[text()='Send For Approval']")
	WebElement SendforApprovalbutton ;
	
	@FindBy(xpath = "//span[text()='Approve']")
	WebElement SalesQuotation_Approvebutton ;
	
	
	public void SalesQuotation(String customername,String companyname,String contactperson, String jobpost,
			String phone, String fax, String mobile, String email, String addcompanyname, String productname) throws Exception {
		Dashboard.click();
		Thread.sleep(2000);
		SalesButton.click();
		Thread.sleep(2000);
		CreateSalesOrder.click();
		Thread.sleep(2000);
		Customer.click();
		Thread.sleep(2000);
		CreateCustomer.click();
		Thread.sleep(2000);
		CustomerName.sendKeys(customername);
		Thread.sleep(2000);
		CustomerComapanyname.click();
		Thread.sleep(2000);
		Searchformore_CompanyName.click();
		Thread.sleep(2000);
		SelectCompanyName.sendKeys(companyname);
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		ContactPersonName.sendKeys(contactperson);
		JobPosition.sendKeys(jobpost);
		PhoneField.sendKeys(phone);
		FaxNo.sendKeys(fax);
		MoblieNo.sendKeys(mobile);
		Email_ID.sendKeys(email);
		Thread.sleep(2000);
		
		Profilepicture.click();
		Pictureupload.sendKeys("C:\\Users\\Admin\\Downloads\\Man.jpg");
		
		Thread.sleep(5000);
		
		CustomerInfoSave.click();
		Thread.sleep(6000);
		
		ShippingAddress.click();
		Thread.sleep(2000);
		AddressSearchmore.click();
		Thread.sleep(2000);
		AddressSearchby_CompanyName.sendKeys(addcompanyname);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		SeaShipping_Checkbox.click();
		Thread.sleep(2000);
		PaymenTerms.click();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		AddProduct.click();
		Thread.sleep(2000);
		ChooseProduct.click();
		Thread.sleep(2000);
		ProductSearchMore.click();
		Thread.sleep(2000);
		Search_ChooseProduct.sendKeys(productname);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		SendforApprovalbutton.click();
		Thread.sleep(2000);
		SalesQuotation_Approvebutton.click();
		Thread.sleep(2000);
	}
	@FindBy(xpath = "//span[text()='Email Customer']")
	WebElement EmailtoCustomer_Button ;
	
	@FindBy(xpath = "//button[@special='cancel']")
	WebElement CancelButton ;
	
	@FindBy(xpath = "//span[text()='Customer Confirm']")
	WebElement ConfirmCustomer ;
	
	@FindBy(xpath = "//span[text()='Confirm SO']")
	WebElement ConfirmSalesOrderNumber ;
	
	
	public void SalesOrdernumber() throws Exception {
		
		EmailtoCustomer_Button.click();
		Thread.sleep(5000);
		CancelButton.click();
		Thread.sleep(3000);
		ConfirmCustomer.click();
		Thread.sleep(2000);
		ConfirmSalesOrderNumber.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[3]/div[1]/button[2]")
	WebElement DeliveryButton ;
	
	public void DeliveryOrdernumber() throws Exception {
		DeliveryButton.click();
		Thread.sleep(3000);
	}
	
	@FindBy(xpath = "//span[text()='Check Availability']")
	WebElement CheckAvailability ;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div[1]/button[3]")
	WebElement ValidateButton ;
	
	@FindBy(xpath = "/html/body/div[22]/div/div/footer/div/footer/button[1]")
	WebElement ApplyButton ;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div[1]/button[3]")
	WebElement CreateInvoicebutton ;
	
	@FindBy(xpath = "//span[text()='Create and View Invoice']")
	WebElement CheckInvoiceButton ;
	
	@FindBy(xpath = "//span[text()='Send For Checking']")
	WebElement SendForCheckingbutton ;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div[2]/div[1]/div/div/div[1]/button[1]")
	WebElement Editbutton ;
	
	@FindBy(xpath = "//input[@name='invoice_date']")
	WebElement InvoiceDate ;
	
	@FindBy(xpath = "//span[text()='Checked']")
	WebElement Checkedbutton ;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[1]/div[1]/button[6]")
	WebElement Invoice_Approvedbutton ;
	
	public void Invoicenumber() throws Exception {
		CheckAvailability.click();
		Thread.sleep(2000);
		ValidateButton.click();
		Thread.sleep(2000);
		ApplyButton.click();
		Thread.sleep(2000);
		
		d.navigate().back();
		Thread.sleep(2000);
		CreateInvoicebutton.click();
		Thread.sleep(2000);
		CheckInvoiceButton.click();
		Thread.sleep(2000);
		SendForCheckingbutton.click();
		Thread.sleep(2000);
		Editbutton.click();
		Thread.sleep(3000);
		InvoiceDate.sendKeys("27-05-2022");
		Thread.sleep(2000);
		SendForCheckingbutton.click();
		Thread.sleep(2000);
		Checkedbutton.click();
		Thread.sleep(2000);
		Invoice_Approvedbutton.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath = "//span[text()='Create Payment']")
	WebElement CreatePaymentButton ;
	
	@FindBy(xpath = "//input[@name='bank_reference']")
	WebElement BankReference;
	
	@FindBy(xpath = "//button[@name='action_create']")
	WebElement CreatePaymentDetailsButton ;
	public void PaymentInfo() throws Exception {
		CreatePaymentButton.click();
		Thread.sleep(3000);
		BankReference.click();
		Thread.sleep(3000);
		CreatePaymentDetailsButton.click();
		Thread.sleep(3000);
	}
	@FindBy(xpath = "//button[@name='action_ok']")
	WebElement PaymentSuccessfullMessage ;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div[2]/div[1]/div/div/div[2]/button[1]")
	WebElement Invoice_SaveButton ;
	
	public void PaymentSuccessfull() throws Exception {
		PaymentSuccessfullMessage.click();
		Thread.sleep(3000);
		Invoice_SaveButton.click();
	}
	
	@FindBy(xpath = "/html/body/header/nav/ul[1]/li/div/a[9]")
	WebElement Accounting ;
	
	@FindBy(xpath = "/html/body/header/nav/ul[2]/li[2]/a")
	WebElement Customers ;
	
	@FindBy(xpath = "/html/body/header/nav/ul[2]/li[2]/div/a[4]")
	WebElement CustomersPayments ;
	
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement CustomersSearchfor ;
	
	@FindBy(xpath = "//span[text()='Send For Approval']")
	WebElement SendforPaymentApproval ;
	
	@FindBy(xpath = "//button[@name='action_approve']")
	WebElement Ist_Approval ;
	
	public void Accounting(String custname) throws Exception {
		Dashboard.click();
		Thread.sleep(2000);
		Accounting.click();
		Thread.sleep(3000);
		Customers.click();
		Thread.sleep(3000);
		CustomersPayments.click();
		Thread.sleep(3000);
		CustomersSearchfor.sendKeys(custname);
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		SendforPaymentApproval.click();
		Thread.sleep(3000);
		Ist_Approval.click();
		Thread.sleep(3000);
	}
	
	
	public void Negativetest() throws Exception {
		Dashboard.click();
		Thread.sleep(2000);
		SalesButton.click();
		Thread.sleep(2000);
		CreateSalesOrder.click();
		Thread.sleep(2000);
		SendforApprovalbutton.click();
		Thread.sleep(2000);
	
	}
}
