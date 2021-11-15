package TestKudaGo_6;

import HW_3.KudaGo.HW_6.ButtonCitySelect;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static HW_3.KudaGo.Configuration.BASE_URL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@Feature("Тестирование элемента Выбор города")
public class TestButtonCitySelect extends TestBase {
    @BeforeEach
    public void goToPage() {
        driver.get(BASE_URL);
    }

    @Test
    void checkButtonCitySelect() {
        new ButtonCitySelect(driver)
                .dropDownCitySelect()
                .clickCitySelect()
                .citySelect();
        assertThat(new ButtonCitySelect(driver).successCitySelect.getText(), containsString("в Санкт-Петербурге"));


    }
}
