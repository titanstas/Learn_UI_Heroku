package pages.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_redirector_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_redirector_page(WebDriver driver) {
        super(driver);
    }


    /**
     *  Кнопка перехода на страницу со статус кодами
     */
    public static String username_path = "//a[contains(@href,'redirect')]";


    /**
     * Метод перехода на страницу со статус кодами
     */
    public Heroku_status_codes_page redirect_to_status_codes_page()  {
        WebElement button =  set_element_visible(username_path);
        button.click();

        return new Heroku_status_codes_page(driver);
    }
}
