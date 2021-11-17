package HW_8.CRM;

import HW_3.CRM_GB.HW_6.MainPage;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static HW_3.CRM_GB.Configuration.BASE_URL;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private SelenideElement inputLogin = $(By.id("prependedInput"));

    private SelenideElement inputPassword = $(By.id("prependedInput2"));

    private SelenideElement submitButton = $(By.id("_submit"));

    @Step("Заполнить поле логина")
    public LoginPage fillInputLogin(String login) {
        inputLogin.sendKeys(login);
        return this;
    }

    @Step("Ввести пароль")
    public LoginPage fillInputPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }

    @Step("Нажать кнопку Войти")
    public MainPage submitLogin() {
        submitButton.click();
        return page(MainPage.class);
    }

    @Step("Логин на сайте")
    public MainPage login(String login, String password){
        open(BASE_URL);
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        submitButton.click();
        return page(MainPage.class);
    }
}
