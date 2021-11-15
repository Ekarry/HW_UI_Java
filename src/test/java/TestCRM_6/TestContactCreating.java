package TestCRM_6;

import HW_3.CRM_GB.HW_6.ContactCreate;
import HW_3.CRM_GB.HW_6.ContactsPage;
import HW_3.CRM_GB.HW_6.LoginPage;
import HW_3.CRM_GB.HW_6.PartnerSubMenu;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static HW_3.CRM_GB.Configuration.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.isDisplayed;

@Feature("Тестирование создания нового контактного лица")
public class TestContactCreating extends TestBase {
    @BeforeEach
    public void goToPage(){
        driver.get(BASE_URL);
    }

    @Test
    void createNewContact() {
        new LoginPage(driver).login(CRM_LOGIN, CRM_PASSWORD)
                .navigationMenu.openNavigationMenuItem("Контрагенты");
        new PartnerSubMenu(driver).goToPageContacts();
        new ContactsPage(driver).contactCreate();
        new ContactCreate(driver)
                .fillSurnameInput("Турунен")
                .fillNameInput("Тарья")
                .fillOrganisationSearch("Все организации")
                .fillJobTitleInput("Певица")
                .pushSaveAndCloseButton();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath(new ContactCreate(driver).infoAboutSuccessSavingLocatorContact)));

        assertThat(new ContactCreate(driver).infoAboutSuccessSaving, isDisplayed());
    }
}
