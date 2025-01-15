package pages.herokuapp;

import org.openqa.selenium.*;
import pages.BasePage;

import java.util.List;

public class Heroku_shadow_dom_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_shadow_dom_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Теневой источник
     */
    public static String shadow_root_path = "//my-paragraph[1]";
    public static String shadow_root_css_path = "#my-paragraph";

    /**
     *  Элемент с теневым текстом
     */
    public static String shadow_text_path = "//span[contains(@slot,'my-text')]";
    public static String shadow_text_css_path = "span[slot='my-text']";
    /**
     * Метод ввода логина
     */
    public Heroku_shadow_dom_page get_shadow_text()  {


        WebElement shadowContent = set_element_visible(shadow_root_path)
                .getShadowRoot()
                .findElement(By.cssSelector(shadow_text_css_path));


        System.out.println(shadowContent.getText());

        
        return new Heroku_shadow_dom_page(driver);
    }


}
