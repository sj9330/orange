package PagerLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.Utilsclass;

public class PIMPage extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pimlink;

	public PIMPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnPIMLink() {
		Utilsclass.clickOnElement(pimlink);
	}

	public String capturepimpageUrl() {
		return driver.getCurrentUrl();
	}

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addButton;

	@FindBy(name = "firstName")
	private WebElement firstname;

	@FindBy(name = "lastName")
	private WebElement lastName;

	@FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-')])[5]")
	private WebElement empid;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savebutton;

	public void clickOnAddButton() {
		Utilsclass.clickOnElement(addButton);
	}

	public String captureAddEmployeePageUrl() {
		return driver.getCurrentUrl();
	}

	public void enterFirstAndLastName(String fname, String lname) {
		Utilsclass.enterData(firstname, fname);
		Utilsclass.enterData(lastName, lname);
	}

	public String captureEmployeeid() {
		return empid.getAttribute("value");
	}

	public void clickOnSaveButton() {
		Utilsclass.clickOnElement(savebutton);
	}

	@FindBy(xpath = "//a[text()='Employee List']")
	private WebElement employeelistlink;

	public void clickOnEmployeeList() {
		Utilsclass.clickOnElement(employeelistlink);
	}

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement searchEmpid;

	public void typeEmpid(String id) {
		Utilsclass.enterData(searchEmpid, id);
	}

	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement searchbutton;

	public void clickOnseachButton() {
		Utilsclass.clickOnElement(searchbutton);
	}

	@FindBy(xpath = "(//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input'])[1]")
	private WebElement checkbox;

	public void clickonSelectedCheckbox() {
		Utilsclass.clickOnElement(checkbox);
	}

	@FindBy(xpath = "//button[text()=' Delete Selected ']")
	private WebElement deletedSelected;

	public void clickonDeletedSelected() {
		Utilsclass.clickOnElement(deletedSelected);
	}

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--card-body']")
	private WebElement capturePopText;

	public String capturePopUpText() {
		return capturePopText.getText();
	}

	@FindBy(xpath = "//button[text()=' Yes, Delete ']")
	private WebElement YesDeleted;

	public void clickonYesDeleted() {
		Utilsclass.clickOnElement(YesDeleted);
	}

}
