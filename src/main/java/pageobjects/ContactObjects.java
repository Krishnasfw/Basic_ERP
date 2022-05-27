package pageobjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactObjects {
	 WebDriver d;
	public ContactObjects(WebDriver d) {
		this.d = d ;
	}
	
	@FindBy(css = "body > header > nav > ul.o_menu_apps > li > a")
	WebElement Dashboard ;
	
	@FindBy(css = "body > header > nav > ul.o_menu_apps > li > div > a:nth-child(3)")
	WebElement Contactinfo ;
	
	@FindBy(css = "body > div.o_action_manager > "
			+ "div > div.o_cp_controller > div > div:nth-child(2) > "
			+ "div.o_cp_left > div > div > button.btn.btn-primary.o-kanban-button-new")
	WebElement Createbutton ;
	
	public void info() throws Exception {
		Dashboard.click();
		Thread.sleep(2000);
		Contactinfo.click();
		Thread.sleep(2000);
		Createbutton.click();	
		Thread.sleep(3000);
	}
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]/div[4]/div[3]/div[1]/label")
	WebElement Individual ;
	
	@FindBy (xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]/div[4]/div[4]/div/div/input")
	WebElement companyname ;
	
	@FindBy(xpath = "/html/body/ul[1]/li[8]/a")
	WebElement SearchFor ;
	
	@FindBy(xpath = "/html/body/div[24]/div/div/main/div/div[1]/div/div[1]/div/div/div/input")
	WebElement Search ;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement IndName ;
	
	
	public void individualDetails(String name) throws Exception {
		Thread.sleep(3000);
		Individual.click();
		Thread.sleep(2000);
		IndName.sendKeys(name);
		companyname.click();
		Thread.sleep(2000);
		SearchFor.click();
		Thread.sleep(2000);
		Search.sendKeys("Don");
		Thread.sleep(2000);
		
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
		
	}
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement Name ;
	
	@FindBy(xpath = "//input[@placeholder='Street...']")
	WebElement Address1 ;
	
	@FindBy(xpath = "//input[@placeholder='Street 2...']")
	WebElement Address2 ;
	
	@FindBy(xpath = "//input[@placeholder='City']")
	WebElement City ;
	
	@FindBy(xpath = "//input[@placeholder='ZIP']")
	WebElement ZIP ;
	
	@FindBy(xpath = "//input[@placeholder='e.g. BE0477472701']")
	WebElement TaxID ;
	
	
	
	/*@FindBy(xpath = "//a[@aria-selected='true']")
	WebElement AccountCreation ;
	
	@FindBy(xpath = "//a[text()='Add a line']")
	WebElement AddLine ;
	
	@FindBy(xpath = "//*[@id=\"o_field_input_2912\"]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/input")
	WebElement Dropdown ;
	
	@FindBy(id = "ui-id-234")
	WebElement CreateButton ;
	
	@FindBy(xpath = "/html/body/div[27]/div/div/main/div/div/div/div/div/table/tbody/tr/td[2]/input")
	WebElement BankName ;
	
	@FindBy(id = "o_field_input_3016")
	WebElement Street1 ;
	
	@FindBy(id = "o_field_input_3022")
	WebElement BankCity ;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement SaveBankInfo ;*/
	
	
	
	public void Companycontactdetails(String name,String add1, String add2,String city,
			String zip, String tax) throws Exception {
		Thread.sleep(5000);
		Name.sendKeys(name);
		Address1.sendKeys(add1);
		Address2.sendKeys(add2);
		City.sendKeys(city);
		ZIP.sendKeys(zip);
		TaxID.sendKeys(tax);
		Thread.sleep(2000);
	}
	@FindBy(xpath = "//input[@name='attn']")
	WebElement ContactPerson ;
	
	@FindBy(xpath = "//input[@name='phone']")
	WebElement Phone ;
	
	@FindBy(xpath = "//input[@name='fax_no']")
	WebElement Fax ;
	
	@FindBy(xpath = "//input[@name='mobile']")
	WebElement Moblie ;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement Email ;
	
	public void CommonDetails(String contactname, String phone ,String fax, String mobile,
			String email) throws Exception {
	
		ContactPerson.sendKeys(contactname);
		Phone.sendKeys(phone);
		Fax.sendKeys(fax);
		Moblie.sendKeys(mobile);
		Email.sendKeys(email);
		Thread.sleep(5000);
	}
	
	public void FOR_Negative() {
		Name.sendKeys("");
	}
	@FindBy(xpath = "//button[@class='btn btn-primary o_form_button_save']")
	WebElement SaveButton ;
	
	public void Save() {
		SaveButton.click();
		
	}
	

}

