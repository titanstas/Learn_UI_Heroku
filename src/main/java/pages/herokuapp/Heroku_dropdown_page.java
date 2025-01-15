package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;


public class Heroku_dropdown_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_dropdown_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Кнопка добавления элемента
     */
    public static String dropdown_path = "//select[contains(@id, 'dropdown')]";

    /**
     * Опции выпадающего списка
     */
    public static String dropdown_option_path = "//option[contains(@value, '%s')]";




    /**
     * Метод выбора опций из выпадающего списка
     */
    public Heroku_dropdown_page choose_option_in_dropdown(String option) {
        WebElement dropdown = set_element_visible(dropdown_path);
        dropdown.click();

        WebElement dropdown_option = set_element_visible(dropdown_option_path, option);
        dropdown_option.click();
        Assertions.assertEquals("true", dropdown_option.getAttribute("selected"));
        dropdown.click();

        return new Heroku_dropdown_page(driver);
    }

}
