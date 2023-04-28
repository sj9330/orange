package PagerLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseLayer.BaseClass;

public class ContactPIMPage extends BaseClass {

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Street1;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement Street2;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
	private WebElement city;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
	private WebElement state;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[6]")
	private WebElement pincode;
	
	@FindBy(xpath="//div[@class='oxd-select-text-input']")
	private WebElement country;
	
	
	
}
