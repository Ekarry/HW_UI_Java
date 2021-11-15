package TestKudaGo_6;

import HW_3.KudaGo.HW_6.LogIn;
import HW_3.KudaGo.HW_6.LogOut;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static HW_3.KudaGo.Configuration.BASE_URL;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.isDisplayed;

@Feature("Тестирование позитивного сценария LogIn и LogOut")
public class TestsPositiveLoginAndLogOut extends TestBase {
    @BeforeEach
    public void goToPage() {
        driver.get(BASE_URL);
    }

    @Test
    void positiveLogin() {
        new LogIn(driver)
                .submitUserZone()
                .inputLoginLocator()
                .fillInputLogin("ekarry@yandex.ru")
                .fillInputPassword("qq9147[[")
                .submitLogin();
        assertThat(new LogIn(driver).loginSuccess,isDisplayed());
    }
    @Test
    void positiveLogOut() {
        new LogOut(driver)
                .getCookie()
                .waitLoginLocator()
                .iconDropDownForLogOut()
                .clickForLogOut();
        assertThat(new LogOut(driver).successLogOut.getText(), containsString("Вход"));
    }
}
