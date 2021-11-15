package HW_3.KudaGo.HW_6;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonDatePicker extends BasePage {
    public ButtonDatePicker(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='DayPicker-choosenDate navbar-item-link']")
    public WebElement dayPickerItem;

    @FindBy(xpath = "//div[@aria-label='пн 15 нояб. 2021 г.']")
    public WebElement chosenDate;

    @FindBy(xpath = "//button[@class='button']")
    public WebElement buttonChosenDate;

    @FindBy(xpath = "//div[@id='react-date-picker']")
    public WebElement successChosenDate;

    public ButtonDatePicker clickDayPickerItem() {
        dayPickerItem.click();
        return this;
    }

    public ButtonDatePicker clickChosenDate() {
        chosenDate.click();
        return this;
    }

    public ButtonDatePicker clickButtonChosenDate() {
        buttonChosenDate.click();
        return this;
    }
}
