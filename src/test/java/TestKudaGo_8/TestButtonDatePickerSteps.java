package TestKudaGo_8;

import HW_8.KudaGo.DatePickerPage;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static HW_3.KudaGo.Configuration.EVENTS_URL;
import static com.codeborne.selenide.Selenide.open;

public class TestButtonDatePickerSteps {
    @Given("I am on Events page")
    public void iAmOnEventsPage() {
        open(EVENTS_URL);
    }

    @When("I press button DatePicker")
    public void iPressButtonDatePicker() {
        new DatePickerPage().clickDayPickerItem();
    }

    @And("I choose date")
    public void iChooseDate() {
        new DatePickerPage().clickChosenDate();
    }

    @And("I press button Apply")
    public void iPressButtonApply() {
        new DatePickerPage().clickButtonChosenDate();
    }

    @Then("I see chosen Date")
    public void iSeeChosenDate() {
        new DatePickerPage().successChosenDate.shouldBe(Condition.visible);
    }
}
