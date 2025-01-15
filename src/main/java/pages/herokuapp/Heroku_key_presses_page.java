package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;


public class Heroku_key_presses_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_key_presses_page(WebDriver driver) {
        super(driver);
    }
    /**
     *  Кнопка алерта JS
     */
    public static String insert_input_field_path = "//input[contains(@id,'target')]";
    /**
     *  Результат выполнения
     */
    public static String result_path = "//p[contains(@id,'result')]";

    /**
     * Метод ввода данных в поле
     */
    public Heroku_key_presses_page insert_input_into_field(Keys input_button)  {
        WebElement field =  set_element_visible(insert_input_field_path);
        field.sendKeys(input_button);




        WebElement result =  set_element_visible(result_path);
        System.out.println(result.getText());
       ;
        return new Heroku_key_presses_page(driver);
    }
}
