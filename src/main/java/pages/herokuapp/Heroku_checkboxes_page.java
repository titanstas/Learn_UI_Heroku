package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_checkboxes_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_checkboxes_page(WebDriver driver) {
        super(driver);
    }


    /**
     * Чекбокс 1
     */
    public static String check_box_1_path= "//input[contains(@type, 'checkbox')][1]";

    /**
     * Чекбокс 2
     */
    public static String check_box_2_path= "//input[contains(@type, 'checkbox')][2]";





    /**
     * Метод проставления галочки в обоих чекбоксах и проверки
     */
    public void check_checkboxes() {
        WebElement check_box_1 = set_element_visible(check_box_1_path);
        WebElement check_box_2 = set_element_visible(check_box_2_path);
        check_box_1.click();

        Assertions.assertEquals("true",check_box_1.getAttribute("checked"));
        Assertions.assertEquals("true",check_box_2.getAttribute("checked"));


    }
}
