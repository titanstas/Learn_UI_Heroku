package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_logged_in_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_logged_in_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Текст в залогиненной зоне
     */
    public static String text_logged_in_path = " //h4[contains(@class,'subheader')]";
    /**
     *  Кнопка log_out
     */
    public static String log_out_path_path = "  //i[contains(@class,'signout')]";



    /**
     * Метод проверки отображения верного текста на странице
     */
    public Heroku_logged_in_page text_check()  {
        WebElement text_element =  set_element_visible(text_logged_in_path);
        Assertions.assertEquals("Welcome to the Secure Area. When you are done click logout below.",
                text_element.getText()
        );

        return new Heroku_logged_in_page(driver);
    }

    /**
     * Метод log_out
     */
    public Heroku_login_page log_out()  {
        WebElement button =  set_element_visible(log_out_path_path);
        button.click();
        Assertions.assertEquals("https://the-internet.herokuapp.com/login",
                driver.getCurrentUrl()
        );

        return new Heroku_login_page(driver);
    }
}
