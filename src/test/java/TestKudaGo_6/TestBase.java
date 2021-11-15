package TestKudaGo_6;

import HW_3.KudaGo.HW_6.ButtonDatePicker;
import HW_3.KudaGo.HW_6.LogIn;
import HW_3.KudaGo.HW_6.LogOut;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
    WebDriver driver;
    WebDriverWait webDriverWait;
    LogIn logIn;
    LogOut logOut;
    ButtonDatePicker buttonDatePicker;

    @BeforeAll
    static void beforeAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setupBrowser() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, 15);
        logIn = new LogIn(driver);
        logOut = new LogOut(driver);
        buttonDatePicker = new ButtonDatePicker(driver);

    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }
}
