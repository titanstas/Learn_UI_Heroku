package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;


public class Heroku_floating_menu_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_floating_menu_page(WebDriver driver) {
        super(driver);
    }



    /**
     *  Меню
     */
    public static String menu_path = "//div[contains(@id,'menu')]";
    /**
     *  Меню Home
     */
    public static String menu_home_path = "//div[contains(@id,'menu')]//a[contains(@href,'#home')]";
    /**
     *  Меню News
     */
    public static String menu_news_path = "//div[contains(@id,'menu')]//a[contains(@href,'#news')]";
    /**
     *  Меню Contact
     */
    public static String menu_contact_path = "//div[contains(@id,'menu')]//a[contains(@href,'#contact')]";
    /**
     *  Меню About
     */
    public static String menu_about_path = "//div[contains(@id,'menu')]//a[contains(@href,'#about')]";


    /**
     *  Url меню Home
     */
    public static String menu_home_url_path = "https://the-internet.herokuapp.com/floating_menu#home";
    /**
     *  Url меню News
     */
    public static String menu_news_url_path = "https://the-internet.herokuapp.com/floating_menu#news";
    /**
     *  Url меню Contact
     */
    public static String menu_contact_url_path = "https://the-internet.herokuapp.com/floating_menu#contact";
    /**
     *  Url меню About
     */
    public static String menu_about_url_path = "https://the-internet.herokuapp.com/floating_menu#about";



    /**
     * Метод вызова Home из меню
     */
    public Heroku_floating_menu_page click_home()  {
        WebElement button =  set_element_visible(menu_home_path);
        button.click();

        Assertions.assertEquals(
                menu_home_url_path,
                driver.getCurrentUrl()
        );

        return new Heroku_floating_menu_page(driver);
    }

    /**
     * Метод вызова News из меню
     */
    public Heroku_floating_menu_page click_news()  {
        WebElement button =  set_element_visible(menu_news_path);
        button.click();

        Assertions.assertEquals(
                menu_news_url_path,
                driver.getCurrentUrl()
        );

        return new Heroku_floating_menu_page(driver);
    }

    /**
     * Метод вызова Сontact из меню
     */
    public Heroku_floating_menu_page click_contact()  {
        WebElement button =  set_element_visible(menu_contact_path);
        button.click();

        Assertions.assertEquals(
                menu_contact_url_path,
                driver.getCurrentUrl()
        );

        return new Heroku_floating_menu_page(driver);
    }

    /**
     * Метод вызова About из меню
     */
    public Heroku_floating_menu_page click_about()  {
        WebElement button =  set_element_visible(menu_about_path);
        button.click();

        Assertions.assertEquals(
                menu_about_url_path,
                driver.getCurrentUrl()
        );

        return new Heroku_floating_menu_page(driver);
    }

}
