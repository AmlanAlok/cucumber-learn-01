package StepDefinitions;

import Implementation.Checkout;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CheckoutSteps {

//    int bananaPrice = 0;

    HashMap<String, Integer> catalog = new HashMap<>();
    Checkout checkout = new Checkout();

    @Given("^the price of a \"(.*?)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        bananaPrice = price;
        catalog.put(name, price);
    }
    @When("^I checkout (\\d+) \"(.*?)\"$")
    public void iCheckout(int itemCount, String itemName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        checkout = new Checkout();
        checkout.add(itemCount, catalog.get(itemName));
    }
    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int total) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(total, checkout.total());
    }

}
