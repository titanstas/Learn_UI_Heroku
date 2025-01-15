package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_dynamic_controls_page extends BasePage {

    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_dynamic_controls_page(WebDriver driver) {
        super(driver);
    }


    /**
     * Чекбокс в разделе удалити/добавить
     */
    public static String checkbox_path = "//input[contains(@type,'checkbox')]";
    /**
     * Кнопка удаления/добавления чекбокса
     */
    public static String remove_add_button_path = "//button[contains(@onclick, 'swapCheckbox()')]";
    /**
     * Строка загрузки чекбокса
     */
    public static String loading_checkbox_path = "//form[contains(@id, 'checkbox-example')]/div[contains(@id, 'loading')]";
    /**
     * Строка загрузки поля ввода текста
     */
    public static String loading_text_field_path = "//form[contains(@id, 'input-example')]/div[contains(@id, 'loading')]";



    /**
     * Поле ввода текста
     */
    public static String text_field_path = "//input[contains(@type,'text')]";
    /**
     * Кнопка активации/деактивации поля ввода текста
     */
    public static String text_field_button_path = "//button[contains(@onclick, 'swapInput()')]";


//button[contains(@onclick, 'swapInput()')]

    /**
     * Метод установки галочки в чекбоксе
     */
    public Heroku_dynamic_controls_page check_checkbox () {

    WebElement checkbox = set_element_visible(checkbox_path);
    checkbox.click();
    Assertions.assertTrue(checkbox.isSelected());
    return new Heroku_dynamic_controls_page(driver);
}
    /**
     * Метод снятия галочки в чекбоксе
     */
    public Heroku_dynamic_controls_page uncheck_checkbox ()  {

        WebElement checkbox = set_element_visible(checkbox_path);
        checkbox.click();
        Assertions.assertTrue(!checkbox.isSelected());

        return new Heroku_dynamic_controls_page(driver);
    }

    /**
     * Метод удаления чекбокса
     */
    public Heroku_dynamic_controls_page remove_checkbox ()
    {
        WebElement button = set_element_visible(remove_add_button_path);
        Assertions.assertEquals("Remove", button.getText());
        button.click();
        element_invisible(loading_checkbox_path);

        Assertions.assertEquals("Add", button.getText());
        Assertions.assertTrue( element_invisible(checkbox_path));


        return new Heroku_dynamic_controls_page(driver);
    }
    /**
     * Метод добавления чекбокса
     */
    public Heroku_dynamic_controls_page add_checkbox ()
    {
        WebElement button = set_element_visible(remove_add_button_path);
        Assertions.assertEquals("Add", button.getText());
        button.click();
        element_invisible(loading_checkbox_path);

        Assertions.assertEquals("Remove", button.getText());
        Assertions.assertTrue(element_visible(checkbox_path));


        return new Heroku_dynamic_controls_page(driver);
    }
    /**
     * Метод ввода текста в поле для ввода
     */
    public Heroku_dynamic_controls_page insert_text_into_field (String text)
    {
        WebElement text_field = set_element_visible(text_field_path);
        text_field.sendKeys(text);

        return new Heroku_dynamic_controls_page(driver);
    }
    /**
     * Метод активации поля для ввода текста
     */
    public Heroku_dynamic_controls_page enable_text_field()
    {
        WebElement text_field_button = set_element_visible(text_field_button_path);
        text_field_button.click();

        element_invisible(loading_text_field_path);

        WebElement text_field = set_element_visible(text_field_path);
        Assertions.assertTrue(text_field.isEnabled());


        return new Heroku_dynamic_controls_page(driver);
    }
    /**
     * Метод деактивации поля для ввода текста
     */
    public Heroku_dynamic_controls_page disable_text_field()
    {
        WebElement text_field_button = set_element_visible(text_field_button_path);
        text_field_button.click();

        element_invisible(loading_text_field_path);

        WebElement text_field = set_element_visible(text_field_path);
        Assertions.assertTrue(!text_field.isEnabled());


        return new Heroku_dynamic_controls_page(driver);
    }
}
