package pageobjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseObjects {
	WebDriver d;

	public PurchaseObjects(WebDriver d) {
		this.d = d;
	}

	@FindBy(css = "body > header > nav > ul.o_menu_apps > li > a")
	WebElement Dashboard;

	@FindBy(css = "body > header > nav > ul.o_menu_apps > li > div > a:nth-child(6)")
	WebElement Purchase;

	// For Product Creation
	@FindBy(css = "body > header > nav > ul.o_menu_sections > li:nth-child(2) > a")
	WebElement Product;

	@FindBy(css = "body > header > nav > ul.o_menu_sections > li.show > div > a")
	WebElement CreateProduct;

	@FindBy(css = "body > div.o_action_manager > div > div.o_cp_controller > div > "
			+ "div:nth-child(2) > div.o_cp_left > div > div > button.btn.btn-primary.o-kanban-button-new")
	WebElement Createbutton;

	@FindBy(xpath = "//input[@placeholder='Product Name']")
	WebElement ProductName;

	@FindBy(xpath = "//input[@class='o_input']")
	WebElement Sales;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]/div[8]/div[2]/div[1]/div/table[2]/tbody/tr[3]/td[2]/div/span[3]/button")
	WebElement UpdateCost;

	@FindBy(xpath = "/html/body/div[20]/div/div/main/div/div/div/div[3]/table[1]/tbody/tr/td[2]/input")
	WebElement Cost;

	@FindBy(xpath = "/html/body/div[20]/div/div/footer/div/footer/button[1]")
	WebElement Applybutton;

	@FindBy(xpath = "//button[@class='btn btn-primary o_form_button_save']")
	WebElement SaveButton;

	@FindBy(css = "body > div.o_action_manager > div > div.o_cp_controller > div > div:nth-child(2) "
			+ "> div.o_cp_left > aside > div > div:nth-child(2) > button")
	WebElement action;

	@FindBy(css = "body > div.o_action_manager > div > div.o_cp_controller > div > div:nth-child(2) >"
			+ " div.o_cp_left > aside > div > div.btn-group.o_dropdown.show > div > a:nth-child(3)")
	WebElement Delete;

	public void product(String productname, String price, String cost) throws Exception {
		Dashboard.click();
		Thread.sleep(3000);
		Purchase.click();
		Thread.sleep(2000);
		Product.click();
		Thread.sleep(2000);
		CreateProduct.click();
		Thread.sleep(2000);
		Createbutton.click();
		Thread.sleep(2000);
		ProductName.sendKeys(productname);
		Sales.clear();
		Sales.sendKeys(price);
		Thread.sleep(2000);
		UpdateCost.click();
		Thread.sleep(3000);
		Cost.clear();
		Thread.sleep(2000);
		Cost.sendKeys(cost);
		Applybutton.click();
		Thread.sleep(3000);
		SaveButton.click();
		Thread.sleep(3000);
		/*
		 * Thread.sleep(5000); action.click(); Thread.sleep(3000); Delete.click();
		 * Thread.sleep(5000); Alert alert = d.switchTo().alert(); alert.accept();
		 */

	}

	@FindBy(xpath = "/html/body/header/nav/ul[2]/li[1]/a")
	WebElement OrderButton;

	@FindBy(css = "body > header > nav > ul.o_menu_sections > li.show > div > a:nth-child(1)")
	WebElement RFQbutton;

	@FindBy(css = "body > div.o_action_manager > div > div.o_cp_controller > div > div:nth-child(2) > div.o_cp_left > div > div > button.btn.btn-primary.o_list_button_add")
	WebElement CreatePO;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]/div[3]/table[1]/tbody/tr[1]/td[2]/div/div/input")
	WebElement Vendor;

	@FindBy(xpath = "//a[text()='Search More...']")
	WebElement Searchmore;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement SearchFor;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]/div[3]/table[1]/tbody/tr[3]/td[2]/div/div/input")
	WebElement POContact;

	@FindBy(xpath = "//a[text()='Add a product']")
	WebElement AddProduct;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/input")
	WebElement ProductClick;

	@FindBy(xpath = "/html/body/ul[17]/li[8]/a")
	WebElement ProductSearchmore;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement ProductSearchFor;

	@FindBy(xpath = "//span[text()='Send For Approval']")
	WebElement SendForApprovalButton;

	@FindBy(xpath = "//input[@name='price_unit']")
	WebElement UnitPrice;

	public void PurchaseOrder(String vendorname, String product_name, String unitprice) throws Exception {
		Thread.sleep(3000);
		OrderButton.click();
		Thread.sleep(2000);
		RFQbutton.click();
		Thread.sleep(2000);
		CreatePO.click();
		Thread.sleep(2000);
		Vendor.click();
		Thread.sleep(2000);
		Searchmore.click();
		Thread.sleep(3000);
		SearchFor.sendKeys(vendorname);

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

		POContact.click();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		AddProduct.click();
		Thread.sleep(2000);
		ProductClick.click();
		Thread.sleep(2000);
		ProductSearchmore.click();
		Thread.sleep(2000);
		ProductSearchFor.sendKeys(product_name);

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
		UnitPrice.clear();
		UnitPrice.sendKeys(unitprice);
		Thread.sleep(3000);
		SendForApprovalButton.click();
		// String text = d.get
		// System.out.println("This is Your Purchase Order Number :" + text);

		Thread.sleep(3000);
	}

	@FindBy(xpath = "//span[text()='Approve']")
	WebElement ApprovedButton;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]/div[1]/button[1]")
	WebElement Receiptbutton;

	public void GRN() throws Exception {
		ApprovedButton.click();
		Thread.sleep(3000);
		Receiptbutton.click();
		Thread.sleep(3000);

	}

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div[1]/button[3]")
	WebElement Validatebutton;

	@FindBy(xpath = "//span[text()='Apply']")
	WebElement Applybutton1;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div[1]/button[10]")
	WebElement CreateBill;

	@FindBy(xpath = "//span[text()='Send For Checking']")
	WebElement SendForCheckingbutton;

	@FindBy(xpath = "//input[@name='ref']")
	WebElement Reference;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[11]/div[11]/table[2]/tbody/tr[3]/td[2]/div/div[1]/div/input")
	WebElement PaymentTerms;

	@FindBy(xpath = "//span[text()='Checked']")
	WebElement Checkedbutton;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div[1]/button[6]")
	WebElement Approvebutton1;

	public void VendorSuppNumber(String reference) throws Exception {

		Validatebutton.click();
		Thread.sleep(3000);

		try {
			Alert alert = d.switchTo().alert();
			System.out.println("The Alert is .." + alert.getText());
			alert.accept();

		} catch (Exception e) {
			Applybutton1.click();
		}

		// Web Page Navigate to before window
		d.navigate().back();

		Thread.sleep(5000);
		CreateBill.click();

		Thread.sleep(3000);

		Reference.sendKeys(reference);

		Robot r1 = new Robot();
		PaymentTerms.click();
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		SendForCheckingbutton.click();
		Thread.sleep(3000);
		Checkedbutton.click();
		Thread.sleep(3000);
		Approvebutton1.click();
		Thread.sleep(3000);
		String text1 = d.getTitle();
		System.out.println("This is Your Vendor bill Number :" + text1);
		Thread.sleep(3000);
	}

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div[1]/button[13]")
	WebElement CreatePaymentbutton;

	@FindBy(xpath = "//input[@name='bank_reference']")
	WebElement BankRefernce;

	@FindBy(xpath = "/html/body/div[36]/div/div/footer/div/footer/button[1]")
	WebElement CreatebankPayment;

	public void PaymentCreation(String Bankname) throws Exception {
		CreatePaymentbutton.click();
		Thread.sleep(3000);
		BankRefernce.sendKeys(Bankname);
		Thread.sleep(3000);
		CreatebankPayment.click();
		Thread.sleep(3000);

	}

	@FindBy(xpath = "/html/body/div[31]/div/div/footer/div/footer/button")
	//
	WebElement BankPaymentSuccessfull;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div[2]/div[1]/div/div/div[2]/button[1]")
	WebElement SaveVendorbill;

	public void Paymentsuccessfull() throws Exception {

		try {
			Alert alert = d.switchTo().alert();
			System.out.println("The Alert is .." + alert.getText());
			alert.accept();

		} catch (Exception e) {
			BankPaymentSuccessfull.click();
		}

		Thread.sleep(3000);

		SaveVendorbill.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath = "/html/body/header/nav/ul[1]/li/div/a[9]")
	WebElement Accounting ;
	
	@FindBy(xpath = "/html/body/header/nav/ul[2]/li[3]/a")
	WebElement VendorPayment ;
	
	@FindBy(xpath = "/html/body/header/nav/ul[2]/li[3]/div/a[4]/span")
	WebElement Payments ;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div[1]/div/div/div/input")
	WebElement SearchforAccount ;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div[1]/button[4]")
	WebElement SendforApproval_Accounting ;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div[1]/button[6]")
	WebElement IstApproval ;
	
	public void AccountingNumber(String Accvendorname) throws Exception {
		Dashboard.click();
		Thread.sleep(3000);
		Accounting.click();
		Thread.sleep(3000);
		VendorPayment.click();
		Thread.sleep(3000);
		Payments.click();
		Thread.sleep(2000);
		SearchforAccount.sendKeys(Accvendorname);
		
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
		
		SendforApproval_Accounting.click();
		Thread.sleep(3000);
		IstApproval.click();
		
		String number = d.getTitle();
		System.out.println("Payment Number : "+number);
	}
		///html/body/header/nav/ul[1]/li/a
		///html/body/header/nav/ul[1]/li/a
		/*
		 * try { Thread.sleep(2000); } catch
		 * 
		 * (InterruptedException e) {}
		 * 
		 * for(WebElement vendor : NameList){ if(vendor.getText().equals(vendorname)) {
		 * vendor.click(); Thread.sleep(3000); try { Thread.sleep(3000); } catch
		 * (InterruptedException e) {}break; }
		 * 
		 * }
		 */
		/*
		 * Actions action = new Actions(d); action.moveToElement(NameList).perform();
		 * 
		 * 
		 * Select dropSelect =new Select (NameList); dropSelect.selectByValue("DON");
		 */
		
		public void Negative_CaseEmptyfield() throws Exception {
			Dashboard.click();
			Thread.sleep(3000);
			Purchase.click();
			Thread.sleep(2000);
			CreatePO.click();
			Thread.sleep(2000);
			SendForApprovalButton.click();
			Thread.sleep(2000);
		}
		
		public void Negative_Withoutproduct() throws Exception {
			Vendor.click();
			Thread.sleep(2000);
			Searchmore.click();
			Thread.sleep(3000);
			SearchFor.sendKeys("ABC");

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
			SendForApprovalButton.click();
			Thread.sleep(3000);
		}

	}


