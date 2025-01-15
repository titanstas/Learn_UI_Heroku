package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_disappearing_elements_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_disappearing_elements_page(WebDriver driver) {
        super(driver);
    }


/**
 * Xpath
 */

    /**
     * Кнопка добавления элемента
     */
    public static String button_home_path = "//a[contains(text(),'Home')]";
    public static String button_about_path = "//a[contains(text(),'About')]";
    public static String button_contact_us_path = "//a[contains(text(),'Contact Us')]";
    public static String button_portfolio_path = "//a[contains(text(),'Portfolio')]";
    public static String button_gallery_path = "//a[contains(text(),'Gallery')]";



    /**
     * Метод поиска заголовка на странице
     */

    public void search_buttons() {


        Assertions.assertTrue(element_visible(button_home_path));
        Assertions.assertTrue(element_visible(button_about_path));
        Assertions.assertTrue(element_visible(button_contact_us_path));
        Assertions.assertTrue(element_visible(button_portfolio_path));

        String button_gallery_presents =element_visible(button_gallery_path)? "Кнопка Gallery на этот раз есть": "Кнопки Gallery на этот раз нет"; ;
        System.out.println(button_gallery_presents);



    }
}
