package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_entry_ad_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_entry_ad_page(WebDriver driver) {
        super(driver);
    }



    /**
     *  Модальное окно
     */
    public static String modal_window_path = "//div[contains(@id,'modal')]";
    /**
     * Кнопка закрытия модального окна
     */
    public static String modal_window_closing_button_path = "//p[contains(text(), 'Close')]";
    /**
     * Кнопка вызова модального окна
     */
    public static String modal_window_open_button_path = "//a[contains(@id,'restart-ad')]";


    /**
     * Метод закрытия модального окна
     */
    public Heroku_entry_ad_page close_modal_window()
    {
        WebElement button =  set_element_visible(modal_window_closing_button_path);
        button.click();

        Assertions.assertTrue(element_invisible(modal_window_path));

        return new Heroku_entry_ad_page(driver);
    }

    /**
     * Метод вызова модального окна
     */
    public Heroku_entry_ad_page open_modal_window()
    {
        WebElement button =  set_element_visible(modal_window_open_button_path);
        button.click();

        Assertions.assertTrue(element_visible(modal_window_path));

        return new Heroku_entry_ad_page(driver);
    }
}
