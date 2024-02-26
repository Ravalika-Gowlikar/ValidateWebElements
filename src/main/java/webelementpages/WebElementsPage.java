package webelementpages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebElementsPage {

	WebDriver driver;

	public WebElementsPage(WebDriver driver) {
		this.driver = driver;
	}

	By add_remove = By.xpath("//*[@id=\"content\"]/ul/li[2]/a");
	By add_ele = By.xpath("//*[@id=\"content\"]/div/button");
	By remove_ele = By.xpath("//*[@id=\"elements\"]/button");
	By checkbox = By.xpath("//*[@id=\"content\"]/ul/li[6]/a");
	By click_box1 = By.xpath("//*[@id=\"checkboxes\"]/input[1]");
	By drop_down  = By.xpath("//*[@id=\"content\"]/ul/li[11]/a");
	By drp_dwn1   = By.id("dropdown");
	By dynamic_con= By.xpath("//*[@id=\"content\"]/ul/li[13]/a");
	By add_btn    = By.xpath("//*[@id='checkbox-example']/button");
	By remove_btn = By.xpath("//*[@id='checkbox-example']/button");
	By enable_btn = By.xpath("//*[@id='input-example']/button");
	By disable_btn= By.xpath("//*[@id=\"input-example\"]/button");

	public void webelement() throws IOException, InterruptedException {
//		Thread.sleep(2000);
//		File src = new File(System.getProperty("user.dir")+"//POMScreenshots//HomePage.png");
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File f2 = ts.getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(f2, src);

		driver.findElement(add_remove).click();
		driver.findElement(add_ele).click();
		driver.findElement(remove_ele).click();
		driver.navigate().back();

		driver.findElement(checkbox).click();
		WebElement checkbox1 = driver.findElement(click_box1);
		boolean checkBoxTrueFalse1 = driver.findElement(click_box1).isSelected();

		Thread.sleep(2000);
		if (checkBoxTrueFalse1 != true) {
			checkbox1.click();
			Thread.sleep(2000);
			checkbox1.click();
		} else {
			System.out.println("Error occurred");
		}
		driver.navigate().back();

		driver.findElement(drop_down).click();
		
		Thread.sleep(2000);
		Select drp_down1 = new Select(driver.findElement(drp_dwn1));
		drp_down1.selectByIndex(1);
		
//		Thread.sleep(2000);
//		File src = new File(System.getProperty("user.dir")+"//POMScreenshots//DropdownPage.png");
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File f2 = ts.getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(f2, src);
		
		driver.navigate().back();
		
		driver.findElement(dynamic_con).click();
		
		Thread.sleep(2000);
//		File src = new File(System.getProperty("user.dir")+"//POMScreenshots//Dynamic_contrlPage.png");
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File f2 = ts.getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(f2, src);
		
		driver.findElement(remove_btn).click();
		Thread.sleep(2000);
		driver.findElement(add_btn).click();
		driver.findElement(enable_btn).click();
		driver.findElement(disable_btn).click();
	}

}
