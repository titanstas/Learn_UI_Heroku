package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_large_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_large_page(WebDriver driver) {
        super(driver);
    }
    /**
     *  Глубокий элемент DOM
     */
    public static String deep_element_path = "//div[contains(@class,'parent large-12 columns tier-50 item-1')]";
    /**
     *   Элемент таблицы
     */
    public static String table_element_path = " //tr[@class='row-%s']//td[@class='column-%s']";

    /**
     * Метод ввода данных в поле
     */
    public Heroku_key_presses_page find_deep_element()  {
        WebElement element =  set_element_visible(deep_element_path);
        Assertions.assertEquals(
                "50.1\n" +
                        "50.2\n" +
                        "50.3"
                , element.getText());

        return new Heroku_key_presses_page(driver);
    }

    /**
     * Метод получения элемента из таблицы
     */
    public Heroku_key_presses_page find_table_element(String row, String column)  {
        WebElement element =  set_element_visible(table_element_path, row, column);
        System.out.println(element.getText());
        Assertions.assertEquals(row+"."+column,element.getText());

        return new Heroku_key_presses_page(driver);
    }
}
