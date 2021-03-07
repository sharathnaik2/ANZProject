package Stepdefinations;

import java.util.List;
import java.util.Map;
import org.junit.Assert;

import FillDetailsImplementation.CalculatorImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FillDetailsSteps extends CalculatorImplementation{
	
	@Given("user is on landing page")
	public void user_is_on_landing_page() {
		
		OpenBrowser("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		
	}

	@When("user fills all details")
	public void user_fills_all_details(io.cucumber.datatable.DataTable dataTable) {
		
		 List<Map<String, String>> details = dataTable.asMaps(String.class, String.class);
		
		 driver.findElement(YourIncome).sendKeys(details.get(0).get("Income"));
		 driver.findElement(OtherIncome).sendKeys(details.get(0).get("OtherIncome"));
		 driver.findElement(LivingExpenses).sendKeys(details.get(0).get("Expenses"));
		 driver.findElement(CurrentHomeLoan).sendKeys(details.get(0).get("HomeLoan"));
		 driver.findElement(OtherLoan).sendKeys(details.get(0).get("OtherLoan"));
		 driver.findElement(OtherCommitments).sendKeys(details.get(0).get("Commitments"));
		 driver.findElement(CreditCard).sendKeys(details.get(0).get("CreditCard"));

	}

	@Then("user clicks Work out how much i could borrow button And Borrowing estimate is {string}")
	public void user_clicks_work_out_how_much_i_could_borrow_button_and_borrowing_estimate_is(String Expected) throws InterruptedException {
	    
		driver.findElement(BorrowCalculatorButton).click();
		Thread.sleep(2000);
		
		String BorrowResult = driver.findElement(Borrowresult).getText();
		Assert.assertEquals(Expected, BorrowResult);
		System.out.println("Expected amount: "+Expected+""+"matches with, Actual Borrow amount: "+BorrowResult);
	}

	@Then("click start over button clears the form")
	public void click_start_over_button_clears_the_form() throws InterruptedException {
	    
		driver.findElement(StartOver).click();
		Thread.sleep(1000);
		
	}
	
	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}
	
	@When("user fill the Living expense as ${int}")
	public void user_fill_the_living_expense_as_$(Integer int1) {
		
		String LivingExpense = Integer.toString(int1);
		
		driver.findElement(LivingExpenses).sendKeys(LivingExpense);
	    
	}

	@Then("user clicks Work out how much i could borrow button")
	public void user_clicks_work_out_how_much_i_could_borrow_button() throws InterruptedException {
	    
		driver.findElement(BorrowCalculatorButton).click();
		Thread.sleep(2000);
	}

	@Then("Verify the message {string}")
	public void verify_the_message(String Expectedstring) {
	    
		String actualMessage = driver.findElement(UnableToBorrowMessage).getText();
		Assert.assertEquals(Expectedstring, actualMessage);
	    System.out.println("Message verified!");
	}
	
	

}
