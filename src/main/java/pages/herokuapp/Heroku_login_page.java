package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_login_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_login_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Поле ввода логина
     */
    public static String username_path = "//input[contains(@name,'username')]";
    /**
     *  Поле ввода пароля
     */
    public static String password_path = "//input[contains(@name,'password')]";
    /**
     *  Кнопка Login
     */
    public static String login_button_path = "//i[contains(@class,'sign-in')]";
    /**
     *  Алерт ошибки
     */
    public static String alert_error_path = "//div[contains(@class,'flash error')]";







    /**
     * Метод ввода логина
     */
    public Heroku_login_page insert_login(String username)  {
        WebElement field =  set_element_visible(username_path);
        field.sendKeys(username);

        return new Heroku_login_page(driver);
    }
    /**
     * Метод ввода пароля
     */
    public Heroku_login_page insert_password(String password)  {
        WebElement field =  set_element_visible(password_path);
        field.sendKeys(password);

        return new Heroku_login_page(driver);
    }
    /**
     * Метод нажатия на кнопку Login
     */
    public Heroku_login_page login_button()  {
        WebElement button =  set_element_visible(login_button_path);
        button.click();

        return new Heroku_login_page(driver);
    }

    /**
     * Метод ввода верного логина и пароля
     */
    public Heroku_logged_in_page true_username_and_password(String username, String password)
    {
        insert_login(username);
        insert_password(password);
        login_button();
       Assertions.assertEquals("https://the-internet.herokuapp.com/secure",
               driver.getCurrentUrl()
       );

        return new Heroku_logged_in_page(driver);
    }

    /**
     * Метод ввода неверного логина и пароля
     */
    public Heroku_login_page false_username(String username, String password)
    {
        insert_login(username);
        insert_password(password);
        login_button();
        System.out.println(set_element_visible(alert_error_path).getText());
        Assertions.assertEquals("Your username is invalid!\n×",
                set_element_visible(alert_error_path).getText()
        );


        return new Heroku_login_page(driver);
    }

    /**
     * Метод ввода неверного логина и пароля
     */
    public Heroku_login_page false_password(String username, String password)
    {
        insert_login(username);
        insert_password(password);
        login_button();
        System.out.println(set_element_visible(alert_error_path).getText());
        Assertions.assertEquals("Your password is invalid!\n×",
                set_element_visible(alert_error_path).getText()
        );


        return new Heroku_login_page(driver);
    }

}
