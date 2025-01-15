package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

public class Heroku_infinite_scroll_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_infinite_scroll_page(WebDriver driver) {
        super(driver);
    }


    /**
     *  Посдений элемент бесконечного списка
     */
    public static String infinite_list_last_element_path = "//div[contains(@class,'jscroll-added')][%s]";


    /**
     * Метод ввода логина
     */
    public Heroku_infinite_scroll_page scroll_list(int steps)  {
        Actions actions = new Actions(driver);


        for (int i = 0; i < steps; i++) {

            WebElement last_element = set_element_visible(infinite_list_last_element_path, String.valueOf(i+2));
            actions.moveToElement(last_element).sendKeys(Keys.END).build().perform();
            Assertions.assertTrue(
                    element_visible(infinite_list_last_element_path, String.valueOf(i+3))
            );

        }

        return new Heroku_infinite_scroll_page(driver);
    }
}
//
//