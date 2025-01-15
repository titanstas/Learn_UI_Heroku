package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

public class Heroku_drag_and_drop_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_drag_and_drop_page(WebDriver driver) {
        super(driver);
    }


    /**
     * Кнопка добавления элемента
     */
    public static String add_element_path = "//button[contains(@onclick, 'addElement')]";
    /**
     * 1ый столбец
     */
    public static String a_column_path = "//div[contains(@id, 'column-a')]";
    /**
     * 2ой столбец
     */
    public static String b_column_path = "//div[contains(@id, 'column-b')]";





    /**
     * Метод изменения положения столбцов А и В
     *
     * @return
     */
    public Heroku_drag_and_drop_page change_columns(String columt_to_move)  {
        WebElement column_a = set_element_visible(a_column_path);
        WebElement column_b = set_element_visible(b_column_path);

        Actions actions = new Actions(driver);
        if (columt_to_move.equalsIgnoreCase("A") ) {
            actions.dragAndDrop(column_a, column_b).build().perform();
        }
        else if (columt_to_move.equalsIgnoreCase("B") )
        {
            actions.dragAndDrop(column_b, column_a).build().perform();
        }

        Assertions.assertEquals("B", column_a.getText());
        Assertions.assertEquals("A", column_b.getText());
    return new Heroku_drag_and_drop_page(driver);
    }
    /**
    * Метод возврата положения столбцов А и В в первоначалбную позицию
    */
        public Heroku_drag_and_drop_page change_columns_back(String columt_to_move)  {
            WebElement column_a = set_element_visible(a_column_path);
            WebElement column_b = set_element_visible(b_column_path);

            Actions actions = new Actions(driver);
            if (columt_to_move.equalsIgnoreCase("A") ) {
                actions.dragAndDrop(column_a, column_b).build().perform();
            }
            else if (columt_to_move.equalsIgnoreCase("B") )
            {
                actions.dragAndDrop(column_b, column_a).build().perform();
            }

            Assertions.assertEquals("A", column_a.getText());
            Assertions.assertEquals("B", column_b.getText());

            return new Heroku_drag_and_drop_page(driver);
    }
}
