package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class classbase {
	public WebDriver d;

	public Properties Configproperties() throws IOException {
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
		properties.load(file);
		return properties;
	}

	@BeforeSuite
	public void OpenBrowser() throws IOException, Exception {
		System.setProperty("webdriver.chrome.driver", Configproperties().getProperty("driverpath"));
		d = new ChromeDriver();
		d.get(Configproperties().getProperty("url"));
		d.manage().window().maximize();

		d.findElement(By.cssSelector("body > div.container > div > div > div.list-group > div:nth-child(1) > a"))
				.click();
		Thread.sleep(3000);
		d.findElement(By.id("login")).sendKeys("admin");
		d.findElement(By.id("password")).sendKeys("#Accentuate1234");
		d.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(3000);

	}

	public void Screenshot(String Screenshot) throws Exception {
		File file = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		File path = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\ERP_Project\\src\\test\\resources\\ScreenShot\\" + Screenshot + "_" + timestamp + ".png");
		FileUtils.copyFile(file, path);
	}

	@AfterSuite
	public void CloseBrowser() {
		//d.close();
	}
}



