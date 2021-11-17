package HW_8.CRM;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ProjectsSubMenu {
    private SelenideElement myProjectsButton = $(By.xpath("//span[.='Мои проекты']"));

    @Step("Выбрать Мои проекты")
    public MyProjectsPage clickMyProjectsButton() {
        myProjectsButton.click();
        return page(MyProjectsPage.class);
    }
}
