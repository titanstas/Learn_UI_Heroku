package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_status_codes_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_status_codes_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Кнопка перехода на страницу статус кода 200
     */
    public static String status_code_200_path = "//a[contains(@href,'status_codes/200')]";
    /**
     *  Кнопка перехода на страницу статус кода 301
     */
    public static String status_code_301_path = "//a[contains(@href,'status_codes/301')]";
    /**
     *  Кнопка перехода на страницу статус кода 404
     */
    public static String status_code_404_path = "//a[contains(@href,'status_codes/404')]";
    /**
     *  Кнопка перехода на страницу статус кода 500
     */
    public static String status_code_500_path = "//a[contains(@href,'status_codes/500')]";


    /**
     * Метод получения статус кода 200 на странице
     */
    public void go_to_status_code_200_page()  {
        WebElement button =  set_element_visible(status_code_200_path);
        button.click();

        Assertions.assertEquals("https://the-internet.herokuapp.com/status_codes/200",driver.getCurrentUrl());

    }

    /**
     * Метод получения статус кода 301 на странице
     */
    public void go_to_status_code_301_page()  {
        WebElement button =  set_element_visible(status_code_301_path);
        button.click();

        Assertions.assertEquals("https://the-internet.herokuapp.com/status_codes/301",driver.getCurrentUrl());

    }

    /**
     * Метод получения статус кода 404 на странице
     */
    public void go_to_status_code_404_page()  {
        WebElement button =  set_element_visible(status_code_404_path);
        button.click();

        Assertions.assertEquals("https://the-internet.herokuapp.com/status_codes/404",driver.getCurrentUrl());

    }

    /**
     * Метод получения статус кода 500 на странице
     */
    public void go_to_status_code_500_page()  {
        WebElement button =  set_element_visible(status_code_500_path);
        button.click();

        Assertions.assertEquals("https://the-internet.herokuapp.com/status_codes/500",driver.getCurrentUrl());

    }
}
