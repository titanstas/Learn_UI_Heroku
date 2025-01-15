package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_challenging_dom_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_challenging_dom_page(WebDriver driver) {
        super(driver);
    }

    /**
     * элемент текста
     */
    public static String text_from_table_path= "//tr[%s]/td[%s]";
    /**
     * Кнопка добавления элемента
     */
    public static String canvas_path= "//canvas[contains(@id, 'canvas')]";


    /**
     * Метод получения текста из таблицы
     */

    public String get_text_from_table(String text_to_search, String row, String column) {
        WebElement element_of_table = set_element_visible(text_from_table_path, row, column);

        Assertions.assertEquals(text_to_search,element_of_table.getText());

        return element_of_table.getText();
    }
    /**
     * Метод получения атрибута tagName из элемента с id = canvas
     */
    public String get_canvas_tag_name() {

        WebElement element_of_canvas = set_element_visible(canvas_path);

        Assertions.assertEquals("CANVAS",element_of_canvas.getAttribute("tagName"));

        return element_of_canvas.getAttribute("tagName");
    }

    //tr[5]/td[3]
}
