package HW_3.CRM_GB.HW_6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactCreate extends BaseView {
    public ContactCreate(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "crm_contact[lastName]")
    public WebElement surnameInput;
    public By surnameInputLocator = By.name("crm_contact[lastName]");

    public ContactCreate fillSurnameInput(String surname) {
        surnameInput.sendKeys(surname);
        return this;
    }

    @FindBy(name = "crm_contact[firstName]")
    public WebElement nameInput;

    public ContactCreate fillNameInput(String name) {
        nameInput.sendKeys(name);
        return this;
    }

    @FindBy(xpath = "//span[@class='select2-arrow']/..")
    public WebElement OrganisationNameSearch;

    public ContactCreate fillOrganisationSearch(String organisationName) {
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader-overlay")));
        OrganisationNameSearch.click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='\"Континент+\"']")));
        OrganisationNameSearch.sendKeys(organisationName);
        webDriverWait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Все орг')]")));
        OrganisationNameSearch.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(name = "crm_contact[jobTitle]")
    public WebElement jobTitleInput;

    public ContactCreate fillJobTitleInput(String jobTitle) {
        jobTitleInput.sendKeys(jobTitle);
        return this;
    }

    @FindBy(xpath = "//button[contains(text(), 'Сохранить и закрыть')]")
    public WebElement saveAndCloseButton;

    public ContactCreate pushSaveAndCloseButton() {
        saveAndCloseButton.click();
        return this;
    }

    @FindBy(xpath = infoAboutSuccessSavingLocatorContact)
    public WebElement infoAboutSuccessSaving;
    public static final String infoAboutSuccessSavingLocatorContact = "//*[text()='Контактное лицо сохранено']";
}
