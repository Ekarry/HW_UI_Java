package HW_8.CRM;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AllProjectsPage {
    private SelenideElement header = $(By.xpath("//h1[contains(text(),'Проекты')]"));
}
