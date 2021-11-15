package TestCRM_6;

import HW_3.CRM_GB.HW_6.AllProjectsPage;
import HW_3.CRM_GB.HW_6.LoginPage;
import HW_3.CRM_GB.HW_6.ProjectCreating;
import HW_3.CRM_GB.HW_6.ProjectSubMenu;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static HW_3.CRM_GB.Configuration.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.isDisplayed;

public class TestProjectCreating extends TestBase {

    @BeforeEach
    public void goToPage(){
        driver.get(BASE_URL);
    }

    @Test
    void createNewProject() throws InterruptedException {
        new LoginPage(driver).login(CRM_LOGIN, CRM_PASSWORD)
                .navigationMenu.openNavigationMenuItem("Проекты");
        new ProjectSubMenu(driver).goToPageAllProjects();
        new AllProjectsPage(driver).createProject();
        new ProjectCreating(driver)
                .fillProjectNameInput("test174")
                .fillOrganisationSearch("Все орг")
                .selectBusinessUnitSelect("Research & Development")
                .selectProjectCurator("Applanatest1 Applanatest1 Applanatest1")
                .selectProjectManager("Applanatest1 Applanatest1 Applanatest1")
                .selectManager("Applanatest1 Applanatest1 Applanatest1")
                .fillPlanningDescription("Планирование")
                .fillProjectRequirementsManagementDescription("Управление требованиями")
                .fillProjectDevelopmentDescription("Разработка")
                .fillTestingDescription("Тестирование")
                .fillConfigManagement("Управление конфигурацией")
                .saveAndCloseButton.click();

        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader-overlay")));
        assertThat(new ProjectCreating(driver).infoAboutSuccessSaving, isDisplayed());
    }
}
