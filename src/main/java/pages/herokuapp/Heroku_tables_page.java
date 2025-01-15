package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;


public class Heroku_tables_page  extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_tables_page(WebDriver driver) {
        super(driver);
    }
    /**
     *   Элемент таблицы
     */
    public static String table_element_path = "//tr[%s]//td[%s]";
    /**
     *  Кнопка редактирования элемента таблицы в 6ом столбце Action
     */
    public static String button_editing_element_path = "/a[contains(@href,'edit')]";
    /**
     *  Кнопка удаления элемента таблицы в 6ом столбце Action
     */
    public static String button_delete_element_path = "/a[contains(@href,'delete')]";


    /**
     *  Таблицы
     */
    public static String tables_path = "//table[contains(@id,'table%s')]";

    /**
     * Нажатие кнопки редактирования элемента таблицы
     */
    public Heroku_tables_page click_edit_button_on_element(String table_number, String row_number)  {
        WebElement button =  set_element_visible(tables_path+table_element_path+button_editing_element_path, table_number, row_number, "6");
        button.click();


        Assertions.assertEquals("https://the-internet.herokuapp.com/tables#edit",driver.getCurrentUrl());
        return new Heroku_tables_page(driver);
    }

    /**
     * Нажатие кнопки удаления элемента таблицы
     */
    public Heroku_tables_page click_delete_button_on_element(String table_number, String row_number)  {
        WebElement button =  set_element_visible(tables_path+table_element_path+button_delete_element_path, table_number, row_number, "6");
        button.click();

        Assertions.assertEquals("https://the-internet.herokuapp.com/tables#delete",driver.getCurrentUrl());
        return new Heroku_tables_page(driver);
    }
}
