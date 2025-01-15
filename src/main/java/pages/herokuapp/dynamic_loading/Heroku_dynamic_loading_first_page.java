package pages.herokuapp.dynamic_loading;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_dynamic_loading_first_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_dynamic_loading_first_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Кнопка появления скрытого элемента
     */
    public static String hidden_element_button_path = "//button[contains(text(), 'Start')]";

    /**
     * Полоса загрузки
     */
    public static String loading_button_path = "//div[contains(@id, 'loading')]";

    /**
     * Скрытый элемент
     */
    public static String hidden_element_path = "//div[contains(@id, 'finish')]/h4";




    /**
     * Метод нажатия на кнопку скрытого элемента
     */
    public Heroku_dynamic_loading_first_page search_hidden_element()
    {
        WebElement button =  set_element_visible(hidden_element_button_path);
        button.click();
        element_invisible(loading_button_path);
        WebElement hidden_element =  set_element_visible(hidden_element_path);

        Assertions.assertEquals("Hello World!",hidden_element.getText());

        return new Heroku_dynamic_loading_first_page(driver);
    }
}
