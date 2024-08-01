package stepDefinations;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import optionManager.ContextTestSetUp;

public class SearchStepDefination {
	
	ContextTestSetUp contextTestSetUp;
	public SearchStepDefination(ContextTestSetUp contextTestSetUp)
	{
		this.contextTestSetUp = contextTestSetUp;
	}
	
	@Given("user is already on landing page")
	public void user_is_already_on_landing_page() throws IOException {
		contextTestSetUp.pageM.getSearchPage().openWebsite();
	}

	@When("user search with baby {string} and click")
	public void user_search_with_baby_and_click(String string) {
		contextTestSetUp.pageM.getSearchPage().searchBaby(string);
	}

	@Then("babies full details should be displayed")
	public void babies_full_details_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
