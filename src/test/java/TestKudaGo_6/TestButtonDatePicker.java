package TestKudaGo_6;

import HW_3.KudaGo.HW_6.ButtonDatePicker;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static HW_3.KudaGo.Configuration.EVENTS_URL;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

@Feature("Тестирование элемента Выбор даты")
public class TestButtonDatePicker extends TestBase {
    @BeforeEach
    public void goToPage() {
        driver.get(EVENTS_URL);
    }

    @Test
    void checkButtonDatePicker() {
        new ButtonDatePicker(driver)
                .clickDayPickerItem()
                .clickChosenDate()
                .clickButtonChosenDate();
        assertThat(new ButtonDatePicker(driver).successChosenDate.getText(), containsString("15 ноября"));
    }
}
