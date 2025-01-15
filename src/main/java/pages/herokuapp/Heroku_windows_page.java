package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import pages.BasePage;




public class Heroku_windows_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_windows_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Кнопка открытия нового окна
     */
    public static String new_window_path = "//a[contains(@href,'/windows/new')]";



    /**
     * Метод открытия нового окна
     */
    public Heroku_windows_page open_new_window()  {
        WebElement button =  set_element_visible(new_window_path);
        button.click();

        Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);

        Assertions.assertEquals("https://the-internet.herokuapp.com/windows/new",driver.getCurrentUrl());
        return new Heroku_windows_page(driver);
    }
}
