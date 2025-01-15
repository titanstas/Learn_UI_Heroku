package pages.herokuapp.shifting_content;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.herokuapp.Heroku_infinite_scroll_page;

public class Heroku_shifting_content_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_shifting_content_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Кнопка перехода в изменяющееся меню
     */
    public static String shifting_menu_path = "//a[contains(@href,'menu')]";
    /**
     *  Кнопка перехода в изменяющююся картинку
     */
    public static String shifting_image_path = "//a[contains(@href,'image')]";
    /**
     *  Кнопка перехода в изменяющийся список
     */
    public static String shifting_list_path = "//a[contains(@href,'list')]";


    /**
     * Метод перехода в изменяющееся меню
     */
    public Heroku_shifting_content_menu_page go_to_shifting_menu()  {
        WebElement button = set_element_visible(shifting_menu_path);
        button.click();

       Assertions.assertEquals("https://the-internet.herokuapp.com/shifting_content/menu",driver.getCurrentUrl());
        return new Heroku_shifting_content_menu_page(driver);
    }
    /**
     * Метод перехода в изменяющююся картинку
     */
    public Heroku_shifting_content_image_page go_to_shifting_image()  {
        WebElement button = set_element_visible(shifting_image_path);
        button.click();

        Assertions.assertEquals("https://the-internet.herokuapp.com/shifting_content/image",driver.getCurrentUrl());
        return new Heroku_shifting_content_image_page(driver);
    }

    /**
     * Метод перехода в изменяющийся список
     */
    public Heroku_shifting_content_list_page go_to_shifting_list()  {
        WebElement button = set_element_visible(shifting_list_path);
        button.click();

        Assertions.assertEquals("https://the-internet.herokuapp.com/shifting_content/list",driver.getCurrentUrl());
        return new Heroku_shifting_content_list_page(driver);
    }
}
