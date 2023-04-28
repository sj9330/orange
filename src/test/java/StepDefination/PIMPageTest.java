package StepDefination;

import static org.junit.jupiter.api.Assertions.assertEquals;


import BaseLayer.BaseClass;
import PagerLayer.PIMPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPageTest extends BaseClass {
	private PIMPage pimpage = new PIMPage();
	private static String empid;

	@When("User is on PIM page")
	public void user_is_on_pim_page() {

		// pimpage = new PIMPage();
		pimpage.clickOnPIMLink();
	}

	@Then("validate user is on pim page using url")
	public void validate_user_is_on_pim_page_using_url() {

		assertEquals(true, pimpage.capturepimpageUrl().contains("pim"));

	}

	@When("user click on Add button")
	public void user_click_on_add_button() {
		// pimpage = new PIMPage();
		pimpage.clickOnAddButton();
	}

	@When("user is on Add Employee Page")
	public void user_is_on_add_employee_page() {
		assertEquals(true, pimpage.captureAddEmployeePageUrl().contains("addEmployee"));

	}

	@Then("user can enter firstname and last name")
	public void user_can_enter_firstname_and_last_name() {
		pimpage.enterFirstAndLastName("Christiano", "Ronaldo");
	}

	@Then("user can capture employee id")
	public void user_can_capture_employee_id() {
		empid = pimpage.captureEmployeeid();
	}

	@Then("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		
		//Thread.sleep(7000);
		pimpage.clickOnSaveButton();
	}

	@When("user click on employee list")
	public void user_click_on_employee_list() throws InterruptedException {
		//Thread.sleep(7000);
		pimpage.clickOnEmployeeList();
	}

	@When("user enter employee id Number")
	public void user_enter_employee_id_number() throws InterruptedException {
		//Thread.sleep(7000);
		pimpage.typeEmpid(this.empid);
	}

	@Then("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
		
		pimpage.clickOnseachButton();

	}

	@Then("user click on checkbox")
	public void user_click_on_checkbox() throws InterruptedException {
		//Thread.sleep(7000);
		pimpage.clickonSelectedCheckbox();
	}

	@Then("click on Delete selected")
	public void click_on_delete_selected() throws InterruptedException {
		//Thread.sleep(7000);
		pimpage.clickonDeletedSelected();
	}

	@Then("capture popup text")
	public void capture_popup_text() {
		String a =pimpage.capturePopUpText();
		System.out.println(a);
		assertEquals(true, a.contains("permanently "));
	}

	@Then("click on yes delete button")
	public void click_on_yes_delete_button() throws InterruptedException {
		//Thread.sleep(7000);
		pimpage.clickonYesDeleted();
		BaseClass.tearDown();
	}

}
