package TestCRM_8;

import HW_8.CRM.*;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCRMCreateProject {
    @Given("Autorized")
    public void autorized() {
        new LoginPage().login("Applanatest1", "Student2020!");
    }

    @Given("Hover nav menu")
    public void hoverNavMenu() {
        new MainPage().navigationMenu.openNavigationMenuItem("Проекты");
    }

    @And("Click my project")
    public void clickMyProject() {
        new ProjectsSubMenu().clickMyProjectsButton();
    }

    @And("Click create project button")
    public void clickCreateProjectButton() {
        new MyProjectsPage().clickCreateProjectButton();
    }

    @When("Fill project name")
    public void fillProjectName() {
        new CreateProjectPage().setProjectName("NoNoName7");
    }

    @And("Select Organization")
    public void selectOrganization() {
        new CreateProjectPage().setOrganization();
    }

    @And("Select BusinessUnit")
    public void selectBusinessUnit() {
        new CreateProjectPage().setBusinessUnit("Research & Development");
    }

    @And("Select Curator")
    public void selectCurator() {
        new CreateProjectPage().setCurator("Applanatest Applanatest Applanatest");
    }

    @And("Select Rp")
    public void selectRp() {
        new CreateProjectPage().setRp("Applanatest1 Applanatest1 Applanatest1");
    }

    @And("Select Administrator")
    public void selectAdministrator() {
        new CreateProjectPage().setAdministrator("Applanatest2 Applanatest2 Applanatest2");
    }

    @And("Select Manager")
    public void selectManager() {
        new CreateProjectPage().setManager("Юзеров Юзер");
    }

    @And("Select Contact")
    public void selectContact() throws InterruptedException {
        new CreateProjectPage().setContact();
    }

    @And("Click Save And Close Button")
    public void clickSaveAndCloseButton() {
        new CreateProjectPage().clickSaveAndCloseButton();
    }

    @Then("Can see all Projects Page")
    public void canSeeAllProjectsPage() {
        new CreateProjectPage().successfullCreate.shouldBe(Condition.visible);
    }
}
