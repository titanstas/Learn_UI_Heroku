package pages.herokuapp.dynamic_loading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_dynamic_loading_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_dynamic_loading_page(WebDriver driver) {
        super(driver);
    }



    /**
     * Кнопка перехода на первую страницу Dynamic loading
     */
    public static String dynamic_loading_first_page_path = "//a[contains(@href, 'dynamic_loading/1')]";
    /**
     * Кнопка перехода на вторую страницу Dynamic loading
     */
    public static String dynamic_loading_second_page_path = "//a[contains(@href, 'dynamic_loading/2')]";





    /**
     * Метод перехода на первую страницу Dynamic loading
     */
    public Heroku_dynamic_loading_first_page goto_dynamic_first_page()
    {
        WebElement page_link =  set_element_visible(dynamic_loading_first_page_path);
        page_link.click();

        return new Heroku_dynamic_loading_first_page(driver);
    }

    /**
     * Метод перехода на вторую страницу Dynamic loading
     */
    public Heroku_dynamic_loading_second_page goto_dynamic_second_page()
    {
        WebElement page_link =  set_element_visible(dynamic_loading_second_page_path);
        page_link.click();

        return new Heroku_dynamic_loading_second_page(driver);
    }

}
