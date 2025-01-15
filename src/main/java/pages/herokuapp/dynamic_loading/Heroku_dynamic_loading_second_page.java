package pages.herokuapp.dynamic_loading;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_dynamic_loading_second_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_dynamic_loading_second_page(WebDriver driver) {
        super(driver);
    }


    /**
     * Кнопка появления скрытого элемента
     */
    public static String missing_element_button_path = "//button[contains(text(), 'Start')]";

    /**
     * Полоса загрузки
     */
    public static String loading_button_path = "//div[contains(@id, 'loading')]";

    /**
     * Отсутствующий элемент
     */
    public static String missing_element_path = "//div[contains(@id, 'finish')]/h4";




    /**
     * Метод нажатия на кнопку скрытого элемента
     */
    public Heroku_dynamic_loading_second_page search_missing_element()
    {
        WebElement button =  set_element_visible(missing_element_button_path);
        button.click();
        element_invisible(loading_button_path);
        WebElement missing_element =  set_element_visible(missing_element_path);

        Assertions.assertEquals("Hello World!",missing_element.getText());

        return new Heroku_dynamic_loading_second_page(driver);
    }
}
