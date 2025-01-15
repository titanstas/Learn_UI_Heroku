package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_inputs_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_inputs_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Строка для ввода цифр
     */
    public static String input_path = "//input[contains(@type,'number')]";
    /**
     * Метод ввода цифр в строку
     */
    public Heroku_infinite_scroll_page insert_input_numbers(String input_data)  {
      WebElement input = set_element_visible(input_path);
      input.sendKeys(input_data);

        Assertions.assertEquals(input_data, input.getAttribute("value"));
        return new Heroku_infinite_scroll_page(driver);
    }
}
